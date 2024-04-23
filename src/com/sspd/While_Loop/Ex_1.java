package com.sspd.While_Loop;

import javax.swing.*;

public class Ex_1 {
    public static void main(String[] args) {

        int pass = 2020;

        String name = "null";

        int result = 0;


        while(result != pass || !(name.equals("Thu"))){

            JOptionPane.showMessageDialog(null,"Try");

            name = JOptionPane.showInputDialog("Enter your name");

            result = Integer.parseInt(JOptionPane.showInputDialog("Enter your pass"));



        }

        JOptionPane.showMessageDialog(null,"Correct");


    }


}
