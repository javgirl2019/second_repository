package pl.advanced_programming.threading.atomic;

public class Exercises5 {

    public static void main(String[] args) {
        Person mariusz = new Person("Mariusz", "P", null);
        try {

            System.out.println("Before calling...");
            synchronized (mariusz){
                mariusz.wait(10000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(123);
    }
}
