package com.mohit.multithreading.join;

class MyThread2 extends Thread {
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

public class ThreadJoinDemo2 {
    public static void main(String[] args) throws InterruptedException{

        MyThread2.mainThread = Thread.currentThread();
        System.out.println(MyThread2.mainThread.getName());

        MyThread2 t = new MyThread2();
        t.start();

        for(int i = 0;i < 10;i++) {
            System.out.println("MAIN THREAD");
            Thread.sleep(2000);
        }
    }
}
