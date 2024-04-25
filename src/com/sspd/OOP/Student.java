package com.sspd.OOP;

public class Student {


    private String name;
    private int age;
    private String gender;
    private String phone;

    Student(String name,int age,String gender){

        this.name = name;
        this.age = age;
        this.gender=gender;


    }

    Student (String phone){

        this.phone=phone;
    }

   public String getName(){

        return name;
    }

   public void setName(String name){

        this.name = name;

    }

    public int getAge(){

        return age;
    }

    public void setAge(){

        this.age=age;
    }

    public String getGender(){

        return gender;
    }

    public void setGender(String gender){

        this.gender=gender;
    }

    public String getPhone(){

        return phone;
    }

    public void setPhone(String phone){

        this.phone=phone;
    }


}

class Main{


    public static void main(String[] args) {

        Student st = new Student("Nyine",20,"Male");

        System.out.println( st.getAge());

        Student stu = new Student("09966965182");
        System.out.println(stu.getPhone());

    }
}
