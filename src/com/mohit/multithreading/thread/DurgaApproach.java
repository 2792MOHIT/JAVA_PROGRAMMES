package com.mohit.multithreading.thread;

class MyThreadD extends Thread {
    @Override
    public void run() {
        System.out.println("CHILD THREAD");
    }
}

class ThreadDemoD {
    public static void main(String[] args) {
        MyThreadD t = new MyThreadD();
        Thread t1 = new Thread(t);
        t1.start();
        t.start();
        System.out.println("Main Thread");
    }
}