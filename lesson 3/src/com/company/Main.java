package com.company;

import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* дом задание- Scanner s = new Scanner(System.in);
        System.out.println("введите год");
        int year = s.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("год високосный ");
        } else {
            System.out.println("год не високосный");
        }*/
       float sum =0;
       float ages[] = new float[5];
       ages[0]=15.5f;
        ages[1]=19.5f;
        ages[2]=17.5f;
        ages[3]=13.5f;
        ages[4]=11.5f;
      // float agv =(ages[0]+ages[1]+ages[2]+ages[3]+ages[4])/2;
       for (int i=0; i<ages.length; i=i+1){
       sum= sum + ages[i];
       }
       float agv = sum/ages.length;
        System.out.println(agv);
        String fruits[]={"appel", "orange", "banana", "lemon"};
        for (int i=0; i<fruits.length; i=i+1){
            System.out.println(fruits[i]);
        }
        //System.out.println(fruits);
        int matrix[][]=new int[3][2];
        matrix[0][1]=10;

        User u1= new User();
        u1.age=20;
        u1.name="petya";
        u1.male=true;
        u1.Say();
        u1.WhatisYourName();
        User u2 = new User();
        u2.name="Viki";
        u2.WhatisYourName();
        String s;
        
    }
}
/*class Human{
    int age;
    String name;
     boolean male;
     void Say(){
         System.out.println("hello");
     }
}*/
