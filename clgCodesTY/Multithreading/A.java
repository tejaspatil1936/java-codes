// package Multithreading;
// import java.lang.*;

class ThreadClass extends Thread{
    @Override
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("thread t");
                Thread.sleep(1000); //print the output after 1 sec
            }
        }
        catch (InterruptedException e){

        }

    }
}
class A{
    public static void main(String[] args) throws InterruptedException {
        ThreadClass t=new ThreadClass();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
        }
    }
}
