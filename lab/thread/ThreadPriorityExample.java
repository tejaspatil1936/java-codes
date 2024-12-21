class MyThread extends Thread {
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
        try {
            Thread.sleep(1000); // Simulate work by sleeping
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}
public class ThreadPriorityExample {
    public static void main(String[] args) throws InterruptedException {
        // Creating threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Default priority 5
        thread3.setPriority(Thread.MAX_PRIORITY);  // Priority 10
  
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}