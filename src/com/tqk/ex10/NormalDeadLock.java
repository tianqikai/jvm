//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tqk.ex10;

public class NormalDeadLock {
    private static Object No13 = new Object();
    private static Object No14 = new Object();

    public NormalDeadLock() {
    }

    private static void peterDo() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        synchronized(No13) {
            System.out.println(threadName + " get NO13");
            Thread.sleep(100L);
            synchronized(No14) {
                System.out.println(threadName + " get NO14");
            }

        }
    }

    private static void kingDo() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        synchronized(No14) {
            System.out.println(threadName + " get NO14");
            Thread.sleep(100L);
            synchronized(No13) {
                System.out.println(threadName + " get NO13");
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Peter");
        NormalDeadLock.Peter peter = new NormalDeadLock.Peter("King");
        peter.start();
        kingDo();
    }

    private static class Peter extends Thread {
        private String name;

        public Peter(String name) {
            this.name = name;
        }

        public void run() {
            Thread.currentThread().setName(this.name);

            try {
                NormalDeadLock.peterDo();
            } catch (Exception var2) {
                var2.printStackTrace();
            }

        }
    }
}
