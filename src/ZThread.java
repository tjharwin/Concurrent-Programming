public class ZThread extends Thread {

    private int count;
    private BinarySemaphore myStart;

    public ZThread(BinarySemaphore s) {

        myStart = s;
    }

    public void run() {

        count = 0;
        while (true) {
            myStart.P();
            count++;
            System.out.println("Z     [" + count + "]");
        }
    }
}