package pl.advanced_programming.threading.atomic;


public class Exercise4 {
    public static void main(String[] args) {
        Person ja = new Person("Bartek", "Kozioł", null);
        Person ty = new Person("Monika", "Kozioł", ja);
        ja.setPartner(ty);
        Person clone = ty.performColoning();
        System.out.println(clone);

    }



}

class Person implements Cloneable {
    private String name;
    private String surname;

    private Person partner;

    public Person(String name, String surname, Person partner) {
        this.name = name;
        this.surname = surname;
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", partner=" + partner +
                '}';
    }

    public Person setPartner(Person ty) {
        return partner;
    }
    public Person performColoning() {
        Person newYou = null;
        try {
            newYou = (Person) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newYou;
    }
}
