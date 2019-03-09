package pl.advanced_programming.threading.second;

import javafx.concurrent.Worker;

public class SecondThread {

    public static void main(String[] args) {

        System.out.println("main () - beginning ...");
        Runnable job = () -> {
            for(int i=0; i<3; i++) {
                System.out.println("Wypisz " + (i+1) + Thread.currentThread().getName());
            }
        };

        job.run();

        Thread worker = new Thread (job, "Thread 1");
        worker.run();
        worker.setDaemon(true);
        worker.start();


        Thread worker2 = new Thread (job, "Thread 2");
        worker2.setDaemon(true);
        worker2.start();

        System.out.println("main - end");
    }

}
