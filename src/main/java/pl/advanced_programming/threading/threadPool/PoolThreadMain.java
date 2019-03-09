package pl.advanced_programming.threading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolThreadMain {

    static private int k =0;
    public static void main(String[] args) {


        Runnable job = () -> {
            synchronized (PoolThreadMain.class){
                k++;
            }
        };

        ExecutorService workers = Executors.newFixedThreadPool(4);
        for(int i = 0; i<2000000; i++){
            workers.execute(job);
        }
        workers.shutdown();
        try {
            boolean test = true;
            do {
                 test = workers.awaitTermination(1, TimeUnit.SECONDS);
            } while (!test);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(k);
        }}




