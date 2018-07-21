public class XThread extends Thread {

    private int count;
    private BinarySemaphore myStart;

    public XThread(BinarySemaphore s) {

        myStart = s;
    }

    public void run() {

        count = 0;
        while (true) {
            myStart.P();
            count++;
            System.out.println("X     [" + count + "]");
        }
    }
}
