package com.mohit.multithreading;

class MyThread4 extends Thread {

    public void start() {
        System.out.println("start method");
    }

    public void run(){
        System.out.println("run method");
    }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.start();
        System.out.println("main method");
    }
}
