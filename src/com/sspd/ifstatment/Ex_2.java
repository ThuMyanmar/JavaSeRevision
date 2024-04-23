package com.sspd.ifstatment;

import javax.swing.*;

public class Ex_2 {

    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter Your Name");

        String pass= JOptionPane.showInputDialog("Enter Your Pass");

        String result = (name.equals("May") && pass.equals("hello"))? "Correct":"Try";

        JOptionPane.showMessageDialog(null,result);
    }
}
