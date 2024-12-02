package Threads_Methods;

// This code is not work because the suspend and the resume method is deprecated  

class SuspendResume_Method extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Base Thread -> " + i);
            try 
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
             {
                // System.out.println("Base Thread interrupted."); optional
            }
        }
    }
}

public class Suspend_Resume 
{
    public static void main(String[] args) 
    {
        SuspendResume_Method srm = new SuspendResume_Method();
        srm.start();

        try
        {
          
            srm.suspend(); 
                                                 // Suspend the Base Thread
            System.out.println("Base Thread suspended.");

            Thread.sleep(2000);          // Main Thread executes while Base Thread is suspended

            srm.resume();                       // Resume the Base Thread

            System.out.println("Base Thread resumed.");

        } catch (InterruptedException e) 
        {
            // System.out.println("Main Thread interrupted.") optional ;
        }

       
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main Thread -> " + i);
            try 
            {
                Thread.sleep(500);
            } catch (InterruptedException e) 
            {
                System.out.println("Main Thread interrupted.");
            }
        }
    }
}
