import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Road(), "Road1");
        thread1.start();
        try {
            Thread.currentThread().sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
