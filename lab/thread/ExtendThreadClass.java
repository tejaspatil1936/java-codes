//7.1
class MyThread extends Thread {
	@Override
	public void run() {
	    System.out.println("Thread is running! " + Thread.currentThread().getName());
	}
}

public class ExtendThreadClass {
      public static void main(String[] args) {
	 MyThread thread = new MyThread();
	 thread.start();
	 System.out.println("Main thread is running! " + Thread.currentThread().getName());
      }
}