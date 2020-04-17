package com.mohit.multithreading.thread;

class MyThread5 extends Thread {

    public void start() {
        super.start();
        System.out.println("start method");
    }

    public void run(){
        System.out.println("run method");
    }
}
public class ThreadDemo5 {
    public static void main(String[] args) {
        MyThread5 t = new MyThread5();
        t.start();
        System.out.println("main method");
    }
}
