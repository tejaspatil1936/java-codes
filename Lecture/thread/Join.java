// The main purpose of the join method is to put a thread into a temporary waiting state. It ensures that a particular 
// thread completes its execution before other threads in the thread pool can continue.

package Threads_Methods;



class Join_Method extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Base Thread -> " + i);
            try 
            {
                Thread.sleep(1000); //Time Delay
            } catch (InterruptedException e) 
            {
                System.out.println("Base Thread interrupted.");
            }
        }
    }
}

public class Join 
{
    public static void main(String[] args) 
    {
        Join_Method jm = new Join_Method();
        jm.start();

        try 
        {
                               
            jm.join();                   // The main thread waits for the Base Thread to finish

        } catch (InterruptedException e) 
        {
            System.out.println("Main Thread interrupted.");
        }

       
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main Thread -> " + i);
        }
    }
}
