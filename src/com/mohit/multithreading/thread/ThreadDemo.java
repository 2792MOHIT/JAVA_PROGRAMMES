package com.mohit.multithreading.thread;

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0;i < 10;i++)
        System.out.println("CHILD THREAD");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        for(int i = 0; i < 10; i++)
            System.out.println("MAIN THREAD");
    }
}
