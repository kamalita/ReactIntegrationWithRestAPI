/*
 * Copyright (c) 2020.
 * Kamalita's coding
 */

package RegularProgramming.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceExample2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread threadModel=new ThreadModel();
        threadModel.start();

//        ExecutorService executor= Executors.newSingleThreadExecutor();
//        executor.execute(new ThreadModel());
//        executor.execute(new ThreadModel());
//        executor.shutdown();

//        ExecutorService _executeor= Executors.newCachedThreadPool();
//        _executeor.submit(new ThreadModel());
//        _executeor.submit(new ThreadModel());
//        _executeor.shutdown();

//        ExecutorService _executor3=Executors.newFixedThreadPool(5);
//        _executor3.submit(new ThreadModel());
//        _executor3.submit(new ThreadModel());
//        System.out.println("thread count -> "+Thread.activeCount());
//        //System.out.println("thread count -> "+Thread.holdsLock(this()));
//        _executor3.shutdown();

        ExecutorService executor4=Executors.newSingleThreadExecutor();
        Future future=executor4.submit(new ThreadModel());
        ThreadModel t1=new ThreadModel();
        t1.checkThread();
        future.get();
        executor4.shutdown();
    }
}

class ThreadModel extends Thread{
    Service service;
    ThreadModel(){
        service=new Service();
    }
    public void run(){
        service.getService();
    }
    void checkThread(){
        long multi=0;
        for(int i=1;i<10000;i++){
            multi*=i;
        }
        System.out.println(multi);
    }
}
class Service{
    void getService(){
        System.out.println("service started!");
        int sum=0;
        for(int i=0;i<10000;i++){
            sum=sum+i;
        }
        System.out.println("current thread= "+Thread.currentThread()+" / "+sum);
    }
}


