class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " is running... Step " + i);
                Thread.sleep(500); // Simulate work by sleeping
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}
public class IsAliveExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        
        System.out.println("Before starting thread, isAlive: " + thread.isAlive()); // False before starting
        thread.start();  // Start the thread
        System.out.println("After starting thread, isAlive: " + thread.isAlive()); // True after starting
        
        thread.join();

        System.out.println("After thread completes, isAlive: " + thread.isAlive()); // False after completion
    }
}