package com.mohit.multithreading.interrupted;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for(int i = 0;i < 10; i++){
                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("I am interrupted");
        }

    }
}

public class ThreadInterruptedDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("main thread ends");
    }
}
