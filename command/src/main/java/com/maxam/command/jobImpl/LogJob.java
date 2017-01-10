package com.maxam.command.jobImpl;

import com.maxam.command.Job;
import com.maxam.command.task.Log;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class LogJob implements Job {
    private Log log;

    public void setLog(Log log) {
        this.log = log;
    }

    public void run() {
        System.out.println("Job id :" + Thread.currentThread().getName() +" executing logging job...");
        if(log != null)
            log.log();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
