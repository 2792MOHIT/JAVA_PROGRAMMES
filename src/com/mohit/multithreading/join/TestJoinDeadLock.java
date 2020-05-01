package com.mohit.multithreading.join;

public class TestJoinDeadLock {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}
