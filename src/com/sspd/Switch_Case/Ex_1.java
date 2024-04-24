package com.sspd.Switch_Case;

import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {

            String [] day ={"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

            int[] count = {1,2,3,4,5,6,7};

            String result = JOptionPane.showInputDialog("Enter Day");

            int result1 =0;

            for(int u = 0;u<=day.length-1;u++){

                if (result.equals(day[u])){

                    JOptionPane.showMessageDialog(null,count[u]);

                    result1 = count[u];
                }

                switch (result1){

                    case 1:JOptionPane.showMessageDialog(null,day[0]) ; break;
                    case 2:JOptionPane.showMessageDialog(null,day[1]) ; break;

                    case 3:JOptionPane.showMessageDialog(null,day[2]) ; break;

                    case 4:JOptionPane.showMessageDialog(null,day[3]) ; break;

                    case 5:JOptionPane.showMessageDialog(null,day[4]) ; break;

                    default:JOptionPane.showMessageDialog(null,"Can not found");


                }




            }



            }

        }




