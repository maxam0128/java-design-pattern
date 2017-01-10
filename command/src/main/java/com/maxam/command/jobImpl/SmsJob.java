package com.maxam.command.jobImpl;

import com.maxam.command.Job;
import com.maxam.command.task.Sms;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class SmsJob implements Job {
    private Sms sms;

    public void setSms(Sms sms) {
        this.sms = sms;
    }

    public void run() {
        System.out.println("Job id :" + Thread.currentThread().getName() +" executing sms job...");
        if(sms != null)
            sms.sendSms();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
