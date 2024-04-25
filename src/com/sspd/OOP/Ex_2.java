package com.sspd.OOP;

public class Ex_2 {

    public static void main(String[] args) {

        Machine machine =new Machine();

        machine.getInfo("Trucks","Black","Driving");
        machine.getStart();
        machine.getRun();
        machine.getBreak();
        machine.getBroke();

    }

}

class Machine{


    String type;
    String colour;
    String useful;



    void getInfo(String type,String colour,String useful){


        System.out.println(type);
        System.out.println(colour);
        System.out.println(useful);

        }

        void getStart(){

            System.out.println("Machine is Stating");

    }

    void getRun(){

        System.out.println("The Car is Running");

    }

    void getBreak(){


        System.out.println(" The Car is Stop");
    }

    void getBroke(){

        System.out.println("The Car broken down");
    }


}