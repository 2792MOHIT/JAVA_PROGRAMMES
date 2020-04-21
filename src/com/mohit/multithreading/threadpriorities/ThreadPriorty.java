package com.mohit.multithreading.threadpriorities;

class MyThread extends Thread {

}

class Test {
    public static void main (String args[]){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(15);
         Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());

        MyThread t = new MyThread();
        System.out.println(t.getPriority());

    }
}
