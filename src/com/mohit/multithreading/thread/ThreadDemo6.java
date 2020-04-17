package com.mohit.multithreading.thread;

class MyThread6 extends Thread {

    public void start() {
        super.start();
        System.out.println("start method");
    }

    public void run(){
        System.out.println("run method");
    }
}
public class ThreadDemo6 {
    public static void main(String[] args) {
        MyThread6 t = new MyThread6();
        t.start();
        System.out.println("main method");
        t.start();
    }
}