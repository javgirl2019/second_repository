package pl.advanced_programming.threading.third;

public class Example {

    public static void main(String[] args) {


        Thread runnerFirst = new Thread(()-> {
            Thread runnerFirstFirst = new Thread(
                    () -> {
                        for(int i = 0; i < 10; i++) {

                            System.out.println(Thread.currentThread().getName() + " - " + "FirstFirst" + " - " + i);
                        }
                    }
            );
            runnerFirstFirst.setPriority(Thread.MIN_PRIORITY);
            runnerFirstFirst.setDaemon(true);
            runnerFirstFirst.start();
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            Thread runnerFirstSecond = new Thread(
                    () -> {
                        for(int i = 0; i < 10; i++) {
                            System.out.println(Thread.currentThread().getName() + " - " + "FirstSecond" + " - " + i);
                        }
                    }
            );
            runnerFirstSecond.setPriority(Thread.MIN_PRIORITY);
            runnerFirstSecond.setDaemon(true);
            runnerFirstSecond.start();


        },"First"

                );
       runnerFirst.start();
        Thread runnerSecond = new Thread(()-> {
            Thread runnerSecondFirst = new Thread(
                    () -> {
                        for(int i = 0; i < 10; i++) {
                            System.out.println(Thread.currentThread().getName() + " - " + "SecondFirst" + " - " + i);
                        }

                    }
            );
            runnerSecondFirst.setDaemon(true);
            runnerSecondFirst.setPriority(Thread.MIN_PRIORITY);
            runnerSecondFirst.start();
            Thread runnerSecondSecond = new Thread(
                    () -> {
                        for(int i = 0; i < 10; i++) {
                            System.out.println(Thread.currentThread().getName() + " - " + "SecondSecond" + " - " + i);
                        }
                    }
            );
            runnerSecondSecond.setPriority(Thread.MAX_PRIORITY);
            runnerSecondSecond.setDaemon(true);
            runnerSecondSecond.start();


        },"Second"

        );
        runnerSecond.start();

    }

}


