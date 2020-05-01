package com.mohit.multithreading.join;

class MyThreadDeadlock extends Thread {
    static Thread mainThread;

    @Override
    public void run() {
        try{
            mainThread.join();
        }catch (InterruptedException e) {}

        for(int i = 0;i < 10;i++) {
            System.out.println("CHILD THREAD");
        }
    }
}

public class ThreadJoinDeadLockCondition {
    public static void main(String[] args) throws InterruptedException{
        MyThreadDeadlock.mainThread = Thread.currentThread();
        System.out.println(MyThreadDeadlock.mainThread.getName());

        MyThreadDeadlock t = new MyThreadDeadlock();
        t.start();
        t.join();

        for(int i = 0;i < 10;i++) {
            System.out.println("MAIN THREAD");
            Thread.sleep(2000);
        }
    }
}
