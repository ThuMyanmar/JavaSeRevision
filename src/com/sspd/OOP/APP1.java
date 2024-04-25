package com.sspd.OOP;

public class APP1 {

    public static void main(String[] args) {

        Person person = new Person();

        Person.Inner inner = new Person().new Inner();

        inner.getInner();
        System.out.println(inner.getInner2());

        Person.Outer out = new Person.Outer();
        out.getOutetr();


        new Person().new Inner().getInner2();

        new Person.Outer().getOutetr();


    }
}


class Person{

    class Inner{

        void getInner(){

            System.out.println("Inner class");

        }




        String getInner2(){

            String str = "Inner class2";

            return str;

        }

    }

    static class Outer{

        void getOutetr(){

            System.out.println("Outer class");
        }


    }



}
