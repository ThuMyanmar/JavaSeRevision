package com.sspd.OOP;

public class Car {

    static String name1 ="Truck";

  static  String getName(){


        return name1;

    }

    void setName(String name){

       this.name1=name;
    }


}

class App{

    public static void main(String[] args) {

        Car ca = new Car();

        ca.getName();

       // ca.setName("Thu Thu Zin");
        //System.out.println(ca.getName());

        System.out.println(Car.getName());





    }


}

