class Demo extends Thread {
	public void run() {
	for (int i = 1; i <= 5; i++) {
		System.out.println("Threads" + i);
		try {
			Thread.sleep(1000); // Timedelay
		}
		catch (InterruptedException e) {

		}
	}
	}
}
public class ExtendThreadClassSleepMethod {
	public static void main(String[] args) throws InterruptedException {
		Demo d1 = new Demo(); 
		d1.start(); // Thread execution
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread" + i);
		}
	}
}