/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample implements Runnable{

    @Override
    public void run() {
        System.out.println("started");
    }

    public static void main(String[] args) {
        //ExecutorService execute= Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (int i=0;i<10;i++) {
            System.out.println("->"+System.currentTimeMillis());
            //Runnable worker= new WorkerThread();
            executor.submit(()->System.out.println(executor.getActiveCount()+" - "+Thread.currentThread().getId()+" - "+executor.isShutdown()));
        }
        executor.shutdown();
        System.out.println("Finished all threads"+ Thread.currentThread().getId());
    }
}
