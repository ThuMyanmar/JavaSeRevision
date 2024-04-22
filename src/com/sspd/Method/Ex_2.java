package com.sspd.Method;

public class Ex_2 {

    public static void main(String[] args) {

        System.out.println(getSum());

        System.out.println(getSum("Thu"," Thu ","Zin"));

        System.out.println(getSum(213,45,34));

        System.out.println(getConverse('B'));

        System.out.println(getConverse(70));

    }

   static int getSum(){

        int x = 12 + 4;

        return x;

    }


    static String getSum(String st1,String st2,String st3){

        return st1 + st2 + st3;

    }

    static int getSum(int c,int y,int w){

        return c + y + w;

    }

    static int getConverse(char ch){

        int c = ch;

        return c;
    }

    static char getConverse(int i){

        char st = (char) i;

        return st;

    }

}
