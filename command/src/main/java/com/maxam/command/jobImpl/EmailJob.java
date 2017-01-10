package com.maxam.command.jobImpl;

import com.maxam.command.task.Email;
import com.maxam.command.Job;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class EmailJob implements Job {
    private Email email;


    public void run() {
        System.out.println("Job id:" + Thread.currentThread().getId() + "execute email jobs.");
        if(email!= null){
            email.sendEmail();
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
