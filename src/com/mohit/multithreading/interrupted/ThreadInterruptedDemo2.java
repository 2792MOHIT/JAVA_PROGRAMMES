package com.mohit.multithreading.interrupted;

class MyThread2 extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 5000; i++){
            System.out.println("I am lazy Thread_" + (i+1));
        }
        System.out.println("I want to sleep");
        try {
            Thread.sleep(2000);
            for(int i = 0;i < 5000; i++){
                System.out.println("I am lazy Thread_" + (i+1));
            }
        } catch (InterruptedException e) {
            System.out.println("I am interrupted");
        }
    }
}

public class ThreadInterruptedDemo2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
        t.interrupt();
        for(int i = 0;i < 5000; i++){
            System.out.println("main thread_" + (i+1));
        }
    }
}
