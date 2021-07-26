//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tqk.ex10;

import java.util.LinkedList;
import java.util.List;

public class StopWorld {
    public StopWorld() {
    }

    public static void main(String[] args) {
        StopWorld.FillListThread myThread = new StopWorld.FillListThread();
        StopWorld.TimerThread timerThread = new StopWorld.TimerThread();
        myThread.start();
        timerThread.start();
    }

    public static class TimerThread extends Thread {
        public static final long startTime = System.currentTimeMillis();

        public TimerThread() {
        }

        public void run() {
            try {
                while(true) {
                    long t = System.currentTimeMillis() - startTime;
                    Thread.sleep(100L);
                }
            } catch (Exception var3) {
            }
        }
    }

    public static class FillListThread extends Thread {
        List<byte[]> list = new LinkedList();

        public FillListThread() {
        }

        public void run() {
            try {
                while(true) {
                    if (this.list.size() * 512 / 1024 / 1024 >= 990) {
                        this.list.clear();
                        System.out.println("list is clear");
                    }

                    for(int i = 0; i < 100; ++i) {
                        byte[] bl = new byte[512];
                        this.list.add(bl);
                    }

                    Thread.sleep(1L);
                }
            } catch (Exception var3) {
            }
        }
    }
}
