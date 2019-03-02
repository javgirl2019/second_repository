package pl.advanced_programming;

//@Functional interface
interface SayHello {
    void sayHello ();
    default void goodbye() {
        System.out.println("Goodbye!!!");
    }
}

//@Functional interface
interface Test {

    // int a, String name
    // 2 x default method

    void person (int a, String name);
    default void job () {
        System.out.println("job");
    }
    default void pochodzenie () {
        System.out.println("pochodzenie ");
    }
}

public class HelloLambda {

    public static void main(String[] args) {
        SayHello hello = () -> {
        };
        hello.sayHello();

        person ((a, b) -> System.out.println("" + a + a + ".." + b + b)
                ,5, "Mariusz");

        person((a, c) -> System.out.println("" + a + a + a + ".." + c + c + c)
                ,7, "Monika");

        person(new Test() {
            @Override
            public void person(int a, String name) {
            }
        },
        5, "a");

    }

    static  void person (Test test, int a, String name) {
        test.person(a, name);
    }

}
