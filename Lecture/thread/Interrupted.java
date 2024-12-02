// The interrupt method is used to interrupt a thread. If any thread is in a sleeping or blocked state, we can easily 
// interrupt the execution of the thread by throwing an InterruptedException.

package Threads_Methods;

class Interrupted_Method extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Base Thread -> " + i);

            if (Thread.interrupted()) 
            {
                break; // Exit if the thread is interrupted 
            }

            try 
            {
                Thread.sleep(1000);

            } catch (InterruptedException e)
            {
                break; 
            }
        }
    }
}

public class Interrupted 
{
    public static void main(String[] args) 
    {
        Interrupted_Method im = new Interrupted_Method();
        im.start();

        try 
        {
            Thread.sleep(3000);

            im.interrupt();                  // Interrupt the Base Thread
        } catch (InterruptedException e) 
        {
            // Optional 
        }

        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main Thread -> " + i);
        }
    }
}
