package com.maxam.pattern;

/**
 * Created by maxam0128 on 2017/02/13.
 */
public class HappensBefore {
    private static int a = 0;
    private static boolean flag = false;

    public void writer(){
        a = a + 1;
        flag = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void reader(){
        if(flag){
            int i = a*a;
            System.out.printf("i=" + i );
        }
    }

    public static void main(String[] args){
        final HappensBefore happensBefore = new HappensBefore();
        new Thread(new Runnable() {
            public void run() {
                happensBefore.writer();
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                happensBefore.reader();
            }
        }).start();
    }
}
