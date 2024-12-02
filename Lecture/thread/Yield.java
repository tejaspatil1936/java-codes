// The yield method of the Thread class allows the current thread to pause and lets another thread with the same priority 
// execute.

package Threads_Methods;

class Yield_Method extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Base Thread -> " + i);
            Thread.yield(); // Hint to the thread scheduler
        }
    }
}

public class Yield 
{
    public static void main(String[] args) 
    {
        Yield_Method ym = new Yield_Method();
        ym.start();

        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main Thread -> " + i);
        }
    }
}
