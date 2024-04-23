package com.sspd.do_WhileLoop;

import javax.swing.*;

public class EX_1 {

    public static void main(String[] args) {

        int pass = 100;
        String name;
        int result;

        do {

            name = JOptionPane.showInputDialog("Enter Your name");

            result = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Pass"));

            if (!(result == pass && name.equals("Thu"))) {

                JOptionPane.showMessageDialog(null, "Try again");
            }
        }while ( result != pass || !(name.equals("Thu")));

            JOptionPane.showMessageDialog(null,"Correct");
        }

    }


