/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cppassignment1;

import java.util.concurrent.*;
/**
 *
 * @author admin
 */
public class CPPAssignment1 {

    static ExecutorService pool;
    
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
  
        pool=Executors.newFixedThreadPool(2);
        Runnable r;
        Future future[]=new Future[4];
        for(int i=0; i<future.length;i++){
            r=new ThreadRunnableClass(i);
            future[i]=pool.submit(r);
        }
        
        for(Future x:future) x.get();
        pool.shutdown();
        System.out.println("Main Method is Finished");
    }

    
}
