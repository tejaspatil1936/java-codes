class InterruptMethod extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("thread t");
                sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");

        }
    }
}

class Main {
    public static void main(String[] args) {
        InterruptMethod t = new InterruptMethod();
        t.start();
        t.interrupt();
    }
}