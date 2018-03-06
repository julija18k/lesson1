package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat();
	cat.name = "Vasya";
	cat.sleep(4);
    cat.sleep(10,15);
	cat.color= "green";
	cat.Voice();
	cat.Voice();
	System.out.println(cat);// write your code here
    String s = "one Day";//приведение к нижнему регистру
        s.toLowerCase();//копирует и приводит к нижнему регистру
        String lc=s.toLowerCase();// скопированно
        System.out.println(lc);// вывод скопированного
        System.out.println(s.toUpperCase());//сразу копирует и выводит в верхний регистр
        System.out.println(s.indexOf("D"));
        System.out.println(s.lastIndexOf("ay"));
        System.out.println(s.substring(0,1));
        if (s.equalsIgnoreCase("one daY")){
            System.out.println("строки равны");
        }
        System.out.println(s.length());
        String f = String.format("\tМеня зовут %s.\n\tя сплю %d часов в сутки ", "Yuliya", 7);
        System.out.println(f);
    }

}
