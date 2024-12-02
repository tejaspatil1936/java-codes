// The stop method of the Thread class is used to terminate a thread permanently.

package Threads_Methods;


class Stop_Method extends Thread 
{
    public void run() {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Base Thread -> " + i);
            try 
            {
                Thread.sleep(1000);

            } catch (InterruptedException e) 
            {
                // Optional
            }
        }
    }
}

public class Stop 
{
    public static void main(String[] args) 
    {
        Stop_Method sm = new Stop_Method();
        sm.start();

        try 
        {
            Thread.sleep(3000);
            sm.stop();

            System.out.println("Base Thread stopped.");

        } catch (InterruptedException e) 
        {
            System.out.println("Main Thread interrupted."); // Optional
        }

        try 
        {
            Thread.sleep(100);
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


