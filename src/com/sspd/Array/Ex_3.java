package com.sspd.Array;

public class Ex_3 {

    public static void main(String[] args) {

        int[][]number ={


                {34,232,55,80},
                {98,56,34,16},
                {66,89,39,32}




        };

        for(int u = 0;u<=number.length-1;u++){

            for(int y =0;y<=3;y++){

                number[2][y] = 1;

                System.out.println(number[u][y]);


            }

                    }


    }
}
