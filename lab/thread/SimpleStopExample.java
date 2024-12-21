class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is running... Step " + i);
                Thread.sleep(500); // Simulate some work
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}

public class SimpleStopExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        // Let the thread run for some time and then stop it
        Thread.sleep(1500);
        thread.stop(); // Stop the thread (deprecated method)
        System.out.println("Thread stopped.");
    }
}