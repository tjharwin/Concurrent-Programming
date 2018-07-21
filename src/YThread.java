public class YThread extends Thread {

    private int count;
    private BinarySemaphore myStart;

    public YThread(BinarySemaphore s) {

        myStart = s;
    }

    public void run() {

        count = 0;
        while (true) {
            myStart.P();
            count++;
            System.out.println("Y     [" + count + "]");
        }
    }
}