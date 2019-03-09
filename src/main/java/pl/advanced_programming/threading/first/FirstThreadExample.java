package pl.advanced_programming.threading.first;

public class FirstThreadExample {

    public static void main(String[] args) {
        Runnable job = () -> {
            System.out.println("Worker: " + Thread.currentThread().getName());
            System.out.println("Run Forrest");
        };

        job.run();


        Thread worker = new Thread(job, "Pracus");
        worker.setName("Worker");
        worker.run();
        worker.start();
    }

}
