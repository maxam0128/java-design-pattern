package com.maxam.facade;

import com.maxam.CPU;
import com.maxam.Disk;
import com.maxam.Memory;

/**
 * Created by maxam0128 on 2016/12/24.
 */
public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public void start(){
        cpu.freeze();
        disk.read();
        memory.load();
        cpu.execute();
    }
}
