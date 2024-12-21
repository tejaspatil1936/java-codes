class MyThread extends Thread {
    MyThread(String name) {
        super(name); // Set thread name
    }
    @Override
    public void run() {
        try {
            System.out.println(getName() + " is running.");
            Thread.sleep(1000); // Simulate work for 1 second
            System.out.println(getName() + " has finished.");
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}
public class ExtendThreadWithJoin {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        thread1.start();
        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for Thread 1.");
        }
        thread2.start();
        try {
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for Thread 2.");
        }
        System.out.println("Both threads are complete. Main thread exiting.");
    }
}