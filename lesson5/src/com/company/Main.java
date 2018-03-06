package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*User u = new User();
	u.id=1;
	u.login= "tery";
	System.out.println(u);
        User u2 = new User();
        u2.id=1;
        u2.login= "tery";
        if (u.equals(u2)){
            System.out.println("объекты равны");// write your code here
        }else {
            System.out.println("объекты не равны");
        }
        if (u==u2){
            System.out.println("u=u2");

        }else {
            System.out.println("u!=u2");
        }
        User u3 = new User();

                u2.login=u2.login;
        u3.id=100;
        System.out.println(u2);
        System.out.println(u3);
        User u4 = new User(10,"some@user");// свойство айди для айди, воспроизведение
            System.out.println(u4);
         int a= 10/0;*/

        Scanner s= new Scanner(System.in); //сканер, ввод исключения
	while (true){
        System.out.print("ввести целое число");
	   try {
	       int number= s.nextInt();// переменная номер бесполезна, можно удалить
	       System.out.println("вы ввели все правильно");
	       break;
       } catch (Exception e1){
	       System.out.println("НЕ ВЕРНЫЙ ВВОД, ПОВТОРИТЕ ПОПЫТКУ");
	       System.out.println(e1.getMessage());// подробная информация об исключении
	       s.nextLine();//сбрасывает буфер и начинает заново
       }
    }
    }
}
