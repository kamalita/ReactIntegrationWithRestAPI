/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.Thread;

public class Thread_RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadOne threadOne=new ThreadOne();
        Thread one=new Thread(threadOne);
            one.start();
        //one.join(100);
        Thread two=new ThreadTwo();
        two.start();
        //one.notify();
        //two.start();
    }

}

abstract class Test{
    Test(){
        System.out.print("came here");
    }
}

class ThreadOne extends Test implements Runnable {
    ThreadOne(){
        super();
        System.out.println(" in Thread One");
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Here in threadOne-> "+i);
        }
    }
}


class ThreadTwo extends Thread{
    ThreadTwo(){
        System.out.println(" in Thread Two");
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Here in threadTwo-> "+i);
        }
    }
}

