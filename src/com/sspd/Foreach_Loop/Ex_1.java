package com.sspd.Foreach_Loop;

import java.util.LinkedList;
import java.util.List;

public class Ex_1 {

    public static void main(String[] args) {

        int[]i={4,3,6,3};

        for(int y:i){

            System.out.println(y);
        }

        ////////////////


        List<Integer> numberlist = new LinkedList<>();

        numberlist.add(22);
        numberlist.add(90);
        numberlist.add(66);
        numberlist.add(77);

            for(int u:numberlist){

                System.out.println(u);


        }
    }
}
