/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.Thread;

public class TestSingleThread {
    public static void main(String[] args) throws Throwable {
        Thread checkextends=new Checkextends();
        Thread t=Thread.currentThread();
        checkextends.start();
        Thread checkextends1=new Checkextends();
        checkextends1.start();
         {
            for(int i: new int[]{1, 3, 2, 1, 5, 3}){
                System.out.println("main added "+ i);
            }
            System.out.println(checkextends.getName()+" and "+t.getName() );
        }

    }
}

class Checkextends extends Thread{
    static int count=1;

    @Override
    public void run() {
                for(int i: new int[]{1, 3, 2, 1, 5, 3}){
            System.out.println("child added  "+count+" and "+ i);
        }
        count++;
    }
}
