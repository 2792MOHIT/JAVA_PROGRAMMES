package com.mohit.multithreading.threadpriorities;

class MyPriorityThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 10 ; i++) {
            System.out.println("CHILD THREAD");
        }
    }
}

public class ThreadPrioritiesDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
        MyPriorityThread t = new MyPriorityThread();
        t.setPriority(10);
        System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
        System.out.println("Child Thread priority: " + t.getPriority());
        t.start();

        for(int i = 0;i < 10; i++){
            System.out.println("MAIN THREAD");
        }
    }
}
