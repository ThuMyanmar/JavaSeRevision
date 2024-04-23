package com.sspd.ifstatment;

import javax.swing.*;

public class Ex_1 {

    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter Your Name");

        String pass= JOptionPane.showInputDialog("Enter Your Pass");

        if(name.equals("Min Min")&& pass.equals("55") ){

            JOptionPane.showMessageDialog(null,"Correct");

        }else{

            JOptionPane.showMessageDialog(null,"Try");
        }

    }

}
