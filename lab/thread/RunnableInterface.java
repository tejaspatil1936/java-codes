public class RunnableInterface implements Runnable {
    public void run() {
        // This is the code executed by the child thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        // This is the entry point where the main thread starts
        RunnableInterface ri = new RunnableInterface();  // Create an object of the Runnable class
        Thread t = new Thread(ri);  // Pass the Runnable object to the Thread constructor
        t.start();  // Start the thread

        // This is the code executed by the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }
    }
}