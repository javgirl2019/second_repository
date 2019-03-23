package pl.advanced_programming.threading.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicTac {

    public static void main(String[] args) {

    TicTac tic = new TicTac();
    TicTac tac = new TicTac();

        Runnable jobTic = () -> {
            System.out.println("Tic");
        };

        Runnable jobTac = () -> {
            System.out.println("Tac");
        };

        ExecutorService workers = Executors.newFixedThreadPool(2);
        workers.execute(jobTic);
        workers.execute(jobTac);


    }

    public static void TicOrTac () {

    }


}
