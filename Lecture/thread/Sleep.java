// sleep is a static method of the Thread class which throws an exception called InterruptedException. The main purpose of
// the sleep method is to put a thread into a temporary waiting state.
// Example: Thread.sleep(milliseconds-1000)

package Threads_Methods;

class Sleep_Method extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Base Thread->"+i);
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {

        }
    }
    }
}
public class Sleep
{
    public static void main(String[] args) 
    {
        Sleep_Method sm=new Sleep_Method();
        sm.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Thread->"+i);
        }
    }
}