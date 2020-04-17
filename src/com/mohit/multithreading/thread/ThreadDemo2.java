package com.mohit.multithreading.thread;

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("no-arg run");
    }

    public void run(int i) {
        System.out.println("int-arg run");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
            t.start();
    }
}
