package com.capgemini.multithreading; 
class ABC
{
    public static synchronized void display()
    {
        System.out.println("Current thread " + Thread . currentThread().getName()); 
        for(int i = 0; i < 5 ; i++)
        {
            System.out.println(Thread.currentThread().getName() + " i - " + i);
            try 
            {
                Thread.sleep(50);
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }    
    }
}
class Valueof implements Runnable{
    Thread t; 
    ABC val; 
    Valueof(ABC val)
    {
        this.val = val; 
        t = new Thread(this);
        t.start();
    }
    public void run() 
    {
        val.display();
    }
}
public class EXample2{
    public static void main(String[] args) { 
        ABC obj1 = new ABC();
        ABC obj2 = new ABC();
        Valueof t1 = new Valueof(obj1);
        Valueof t2 = new Valueof(obj2);
    }
}

