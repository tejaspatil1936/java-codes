class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is running... Step " + i);
                Thread.sleep(1000); // Simulate work by sleeping
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        // Let the thread run for a short time, then interrupt it
        Thread.sleep(2500); // Allow thread to run for a while
        thread.interrupt(); // Interrupt the thread
        System.out.println("Thread has been interrupted.");
    }
}