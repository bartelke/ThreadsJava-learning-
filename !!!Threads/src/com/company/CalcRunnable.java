package com.company;

public class CalcRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<5; i++) {
            System.out.println("This calc is in thread: " + Thread.currentThread().getId());
        }
    }
}
