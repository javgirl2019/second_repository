package pl.advanced_programming.threading.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example2Atomic {

    // 3 wątki zwiększają zwiększają zmienną typu long (500000 iteracji)
    // wątek zwiększa zmienną co 500ms (w jobie)
    // wątki używają synchro
    // nizacji przy zapisie
    // jeden wątek wypisuje (bez synchronizacji) - cały czas
    // obserwujemy wyjście i sprawdzamy czy wypis zgadza się z zapisem
    // do zmiennej

    static long counter = 0;

    public static void main(String[] args) {
        Runnable increaseJob = () -> {
            long currentCounterValue;
            for (int i = 0; i < 500000; i++) {

//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (Example2Atomic.class) {
                    currentCounterValue = ++counter;
                }

                System.out.println(String.format("Current value: [%s], from thred: [%s]",
                        currentCounterValue, Thread.currentThread().getName()));
            }
        };

        Runnable showJob = () -> {
            while (true) {
                System.out.println("Value: [" + counter + "]");
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);
        workers.execute(showJob);
        workers.execute(increaseJob);
        workers.execute(increaseJob);
        workers.execute(increaseJob);


    }
}
