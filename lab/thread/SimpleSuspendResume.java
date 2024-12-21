class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is running... Step " + i);
                if (i == 3) {
                    System.out.println(getName() + " is suspended.");
                    suspend(); // Suspend the thread at Step 3
                }
                Thread.sleep(500); // Simulate some work
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}

public class SimpleSuspendResume {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();

        Thread.sleep(1500); // Let the thread run until it reaches the suspend point
        thread.resume(); // Resume the thread after being suspended
        System.out.println("Thread resumed.");
    }
}