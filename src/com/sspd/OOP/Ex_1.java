package com.sspd.OOP;

public class Ex_1 {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.getInfo("Jack Jack","3","dog");

        animal.dogmakeSound();
    }


}
class Animal{

    String name;
    String age;
    String type;

    void getInfo(String name,String age,String type){

        System.out.println(name);
        System.out.println(age);
        System.out.println(type);

    }

    void dogmakeSound(){


        System.out.println("dog make sound is Wolf! Wolf! ");

    }

}
