package pl.advanced_programming.threading.atomic;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Example3 {

    public static void main(String[] args) {

        int [] myTab = new int [1024];
        Random random = new Random();
        for (int i=0; i<myTab.length; i++) {
            myTab [i] = random.nextInt(200);
        }

        AtomicInteger FirstSum = new AtomicInteger();
        AtomicInteger SecondSum = new AtomicInteger();


        Runnable sumFirstHalfTab = () -> {
            int currentFirstSum = 0;
            for (int i = 0; i < (myTab.length/2); i++) {
                currentFirstSum += myTab [i];
            }
            FirstSum.set(currentFirstSum);
        };

        Runnable sumSecondHalfTab = () -> {
            int currentSecondSum = 0;
            for (int i = myTab.length/2; i < myTab.length-1; i++) {
                currentSecondSum += myTab [i];
            }
            SecondSum.set(currentSecondSum);
        };

        ExecutorService workers = Executors.newFixedThreadPool(2);
        workers.execute(sumFirstHalfTab);
        workers.execute(sumSecondHalfTab);

        workers.shutdown();

        try {
            workers.awaitTermination(15, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sumTab(FirstSum, SecondSum));

    }

    public static int sumTab (AtomicInteger FirstSum, AtomicInteger SecondSum) {
            return FirstSum.get() + SecondSum.get();
    }

//    public long sumArray (int[] array) {
//        return 0;
//    }
}
