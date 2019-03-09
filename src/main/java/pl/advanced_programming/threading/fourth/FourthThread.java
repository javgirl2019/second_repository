//package pl.advanced_programming.threading.fourth;
//
//public class FourthThread {
//
//    public static void writer(String name) {
//        System.out.println("name " + name);
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Bomb is starting: ");
//        Runnable job = () -> writer();
//        System.out.println("Tic");
//    }
//}
