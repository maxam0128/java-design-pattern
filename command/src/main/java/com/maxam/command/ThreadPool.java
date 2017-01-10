package com.maxam.command;

import sun.tools.jconsole.Worker;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class ThreadPool {

    private static BlockingQueue<Job> jobQueue;

    private static Thread[] jobThreads;

    private volatile  boolean shutDown;

    public ThreadPool(int n){
        jobQueue = new LinkedBlockingQueue<Job>();
        jobThreads = new Thread[n];
        for(int i = 0;i < n ;i++){
            jobThreads[i] = new JobTread("Pool Thread " + i);
            jobThreads[i].start();
        }
    }

    public void addJob(Job job){
        try {
            jobQueue.put(job);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutdownThreadPool(){
        while (!jobQueue.isEmpty()){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        shutDown = true;
        for(Thread thread : jobThreads){
            thread.interrupt();
        }
    }




    private class JobTread extends Thread{
        public JobTread(String name){
            super(name);
        }
        public void run(){
            while (!shutDown){
                try {
                    Job job = jobQueue.take();
                    job.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }



}
