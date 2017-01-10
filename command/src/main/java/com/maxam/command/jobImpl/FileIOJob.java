package com.maxam.command.jobImpl;

import com.maxam.command.task.FileIO;
import com.maxam.command.Job;

/**
 * Created by maxam0128 on 2016/12/28.
 */
public class FileIOJob implements Job {
    private FileIO fileIO;

    public void setFileIO(FileIO fileIO) {
        this.fileIO = fileIO;
    }

    public void run() {
        System.out.println("Job id :" + Thread.currentThread().getName() +" executing fileio job...");
        if(fileIO != null)
            fileIO.execute();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
