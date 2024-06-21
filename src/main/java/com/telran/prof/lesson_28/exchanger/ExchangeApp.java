package com.telran.prof.lesson_28.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangeApp {

    public static void main(String[] args) throws InterruptedException {
        /*
        A       B
            E
        C       D
        // track - 1
        A->C, A->D  after exchange A->D, B->D
        // track -2
        B->C, B->D  after exchange B->C, A->C
         */

        String[] parcelOne = {"parcel A->D", "parcel A->C"};
        String[] parcelTwo = {"parcel B->C", "parcel B->D"};

        Exchanger<String> objectExchanger = new Exchanger<>();
        new Thread(new Truck(1, "A", "D", parcelOne, objectExchanger)).start();

        Thread.sleep(100);

        new Thread(new Truck(2, "B", "C", parcelTwo, objectExchanger)).start();

    }
}
