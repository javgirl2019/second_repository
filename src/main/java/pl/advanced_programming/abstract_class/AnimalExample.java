package pl.advanced_programming.abstract_class;

public class AnimalExample {

    public static void main(String[] args) {

        Zoo myzoo = new Zoo();

        myzoo.handleAnimal(new Animal("Azor") {

            @Override
            public void eat() {
                System.out.println("Eating  ...");
            }

            @Override
            public void play() {
                System.out.println("Playing ...");
            }
        });

        Animal maybeCat;
                new Animal("cat") {
            @Override
            public void eat() {

            }

            @Override
            public void play() {

            }

            public void miauuuu () {

            }
        }.miauuuu();

    }

}
