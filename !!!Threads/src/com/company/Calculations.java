package com.company;

public class Calculations extends Thread{ //or you can also implement interface "Runnable"

    @Override
    public void run(){
        for(int i=0; i<5; i++) {
            System.out.println(i + ". This calc is in thread: " + Thread.currentThread().getId());
        }
    }
}
