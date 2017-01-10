package com.maxam.command;

import com.maxam.command.jobImpl.EmailJob;
import com.maxam.command.jobImpl.FileIOJob;
import com.maxam.command.jobImpl.LogJob;
import com.maxam.command.jobImpl.SmsJob;
import com.maxam.command.task.Email;
import com.maxam.command.task.FileIO;
import com.maxam.command.task.Log;
import com.maxam.command.task.Sms;
import org.junit.Test;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class TestCommand {

    @Test
    public void testCommand(){

        ThreadPool threadPool = new ThreadPool(10);
        Email email = null;
        EmailJob emailJob = new EmailJob();
        Sms sms = null;
        SmsJob smsJob = new SmsJob();
        FileIO fileIO;
        FileIOJob fileIOJob = new FileIOJob();
        Log log = null;
        LogJob logJob = new LogJob();

        for(int i = 0; i < 5 ;i++){
            email = new Email();
            emailJob.setEmail(email);
            sms = new Sms();
            smsJob.setSms(sms);
            fileIO = new FileIO();
            fileIOJob.setFileIO(fileIO);
            log = new Log();
            logJob.setLog(log);
            threadPool.addJob(emailJob);
            threadPool.addJob(smsJob);
            threadPool.addJob(fileIOJob);
            threadPool.addJob(logJob);

        }
        threadPool.shutdownThreadPool();
    }
}
