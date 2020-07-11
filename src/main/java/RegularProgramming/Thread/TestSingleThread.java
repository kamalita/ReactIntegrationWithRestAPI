/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.Thread;

public class TestSingleThread {
    public static void main(String[] args) throws Throwable {
        Thread checkextends=new Checkextends();
        Thread t=Thread.currentThread();
        checkextends.run();
        System.out.println(checkextends.getName()+" and "+t.getName() );
    }
}

class Checkextends extends Thread{
    Checkextends(){
        System.out.print("here");
    }
}
