package com.sspd.OOP;

public class Ex_2MethodLocalInnerClass {

    public static void main(String[] args) {

      Local local = new Local();


        local.getLocal();

    }
}


class Local{

    void getLocal(){

        System.out.println("I am local class");

        class Inner{

            void getInner(){

                System.out.println("I am inner class");
            }


        }

        Inner inner=new Inner();

          inner.getInner();

        }
    }



