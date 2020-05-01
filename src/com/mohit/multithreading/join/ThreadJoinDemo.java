package com.mohit.multithreading.join;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println("Seetha Thread");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join(10_000);
        for(int i = 0;i < 10;i++) {
            System.out.println("Rama Thread");
        }

    }
}
