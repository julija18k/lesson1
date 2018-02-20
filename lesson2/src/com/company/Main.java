package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //class Main {

        // public static void main(String[] args) {
       /* int age =17;
        if (age>=16){
            System.out.println("Вы можете сдать на права");
        }
        else{
            System.out.println("Вы не можете сдать на права");
        }*/
      int month=13;
      switch (month){
          case 1: System.out.println("январь");
          break;
          case 2: System.out.println("февраль");
              break;
          case 3: System.out.println("март");
              break;
          case 4: System.out.println("апрель");
              break;
          case 5: System.out.println("май");
              break;
          case 6: System.out.println("июнь");
              break;
          case 7: System.out.println("июль");
              break;
          case 8: System.out.println("август");
              break;
          default: System.out.println("такого месяца не существует");
      }
      int i=0;
      while (i<10){
          i=i+1;
          System.out.println(i);
          if (i==5){
              break;
          }
      }
      int a=12;
      do {
          System.out.println("hello");
      } while (a<10);

      for (int j=0; j<10; j=j+1){
          System.out.println(Math.pow(j,3));
      }
      //далее чтение данных
        Scanner s = new Scanner(System.in);
      System.out.println("введите ваш рост  в метрах");
      float height = s.nextFloat();
      System.out.print("ваш рост в дюймах: ");
      System.out.println(height/2.54*100);
     float usd = convertBYNtoUSD(10.5f);
     System.out.println(usd);
    }
    static float convertBYNtoUSD(float sum){
        float usd =sum/1.96f;
        return usd;
    }
}// write your code here


