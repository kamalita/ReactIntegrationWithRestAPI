/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.JAVA8;

public class RunnableWithLambda {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread created");
            }
        });
        Thread thread1=new Thread(()-> System.out.println("in second rol"));

        thread.start();
        thread1.start();
    }



}
