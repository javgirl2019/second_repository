package pl.advanced_programming.threading.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();

        Runnable job = () -> {
            i.incrementAndGet(); //+ii
            i.getAndIncrement(); //i++

            int currentValue = i.intValue();
         boolean test = true;
         while (test) {
            test =! i.compareAndSet(currentValue, currentValue+2);
         }
            System.out.println(i);
        };

        Thread worker = new Thread(job);
        worker.start();


    }
}
