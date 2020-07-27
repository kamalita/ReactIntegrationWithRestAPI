/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SimaphoreExample {
    static Semaphore simaphore=new Semaphore(2);
    public static void main(String[] args) {

        ExecutorService service= Executors.newFixedThreadPool(10);
        IntStream.range(0,50).forEach(i->service.execute(new Task(simaphore)));
        service.shutdown();
    }
    static class Task implements Runnable{

        public Task(Semaphore simaphore) {
        }

        @Override
        public void run() {
            try {
                simaphore.acquire(2);
                System.out.println("here count -> "+Thread.activeCount()+" current : "+Thread.currentThread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                simaphore.release(2);
            }
        }
    }
}


