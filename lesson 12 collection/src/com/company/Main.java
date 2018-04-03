package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args){
    ArrayList <Integer> list = new ArrayList <Integer>();
    list.add(20);//добавляем элемент в коллекцию// write your code here
   list.add(15);
   list.add(45);
   System.out.println(list.get(1));// выводим элемент из коллекции с индексом 1
        System.out.println(list);
       list.remove(0); // удаляем элемент
        System.out.println(list);
//удаляем конкретное число
        Integer a = 15;
        list.remove(a);
        list.set(0,52);
        list.add(48);

        System.out.println(list);
        for (int i=0; i<list.size(); i++){
            int c = list.get(i);
            System.out.println(c);
        }
        HashMap <Integer, String > contacts = new HashMap<>();
        contacts.put(256341, "anna s");
        contacts.put(456987, "gerom");
        System.out.println(contacts);
        System.out.println(contacts.get(456987));
        contacts.remove(456987);
        System.out.println(contacts);
    }
}
