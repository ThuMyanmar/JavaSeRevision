package com.sspd.OOP;

public class Anonomous {

    public static void main(String[] args) {

        Order order = new Order();

        order.getOrder();

        Order order1 = new Order(){

            void getOrder(){

                System.out.println("I am another Anonomous class");
            }
        };

        order1.getOrder();

    }
}


class Order{

    void getOrder(){

        System.out.println("I am Anonomous class");


    }


}
