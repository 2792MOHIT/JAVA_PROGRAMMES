package com.mohit.multithreading.thread;

class MyThread7 extends Thread {

}

class ThreadDemo7 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyThread7 t = new MyThread7();
        t.start();
        System.out.println(t.getName());
        Thread.currentThread().setName("Mohit MAIN THREAD");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
