package com.company;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
      /*//  enum Month {

        //}

    Book b1 = new Book();
    b1.setAuthor(" jj");
    b1.setBookName("Love");// write your code here
        Book b2 = new Book();
        b2.setBookName("hjj");
        b2.setAuthor("juh");
        EBook b3= new EBook();
        b3.setAuthor("ghjj");
        b3.setBookName("fjjh");
        showAuthor(b1);
        showAuthor(b2);
        showAuthor(b3);
        int a=1;
        int b = a++ + ++a + a++;
        System.out.println(b);
       b1.author.setName("book4");
       System.out.println(b1.getBookName());*/

        Date  d = new Date();

        System.out.println(d.getTime());
        Calendar  e = Calendar.getInstance();
        System.out.println(e.get(Calendar.DAY_OF_YEAR));
        e.set (Calendar.MONTH, 6);// изменили месяц на 6
        System.out.println(e);
        e.add(Calendar.YEAR,-5);
        System.out.println(e);
        e.getTime();// получаем объект типа дэйт
        GregorianCalendar ge = (GregorianCalendar) GregorianCalendar.getInstance();
        if (ge.isLeapYear(2020)){
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }
        System.out.println(ge.getGregorianChange());

    }
    public static void showAuthor(IBook b){
        System.out.println(b.getAuthor()) ;// переименов книгу 1, через вложенный класс
    }

}
