package pl.advanced_programming.threading.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleAtomic {

    public static void main(String[] args) {

        AtomicInteger magicIncrement = new AtomicInteger();

        Runnable job = ( ) -> {
            for ( int i = 0; i<100; i++) {
                int tmp = magicIncrement.getAndIncrement(); //i++

            System.out.println(Thread.currentThread().getName() + " , current atomic value: " + tmp) ;
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(3);
            workers.execute(job);
            workers.execute(job);
            workers.execute(job);

            workers.shutdown();

        boolean done = false;
       do {
           try {
               workers.awaitTermination(5, TimeUnit.SECONDS);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       } while (!done);

        System.out.println(Thread.currentThread().getName());
        System.out.println(magicIncrement);
    }


}
