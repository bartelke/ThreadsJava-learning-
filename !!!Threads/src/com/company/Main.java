package com.company;

public class Main {

    public static void main(String[] args) {
        //By extending class "Threads":
        Calculations calculationsT1 = new Calculations();
        Calculations calculationsT2 = new Calculations();

        //starting threads:
        calculationsT1.start();
        calculationsT2.start();


        //By implementing interface "Runnable":
        Thread calcRn1 = new Thread(new CalcRunnable());
        Thread calcRn2 = new Thread(new CalcRunnable());

        //starting threads:
        calcRn1.start();
        calcRn2.start();
    }
}
