package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Settings s = new Settings();
        s.posX= 100;
        s.posY= 200;
        s.fullScreen=false;
        User u = new User();
        u.name= "Georg";
        u.avatar = "img/1.png";
        System.out.println(s);
        System.out.println(u);
        //сиреализация
	 FileOutputStream fos = new FileOutputStream("app.bin");//  пишем любую информацию(в данном случае объект)
        ObjectOutputStream oos = new ObjectOutputStream(fos); // способ реализациии в каком файле
        oos.writeObject(s);
        oos.writeObject(u); // записваем объекты,   затем закрываем все потоки в обратной последовательности
        oos.close();
        fos.close();
        // дисиреализация
        FileInputStream fit = new FileInputStream("app.bin");
        ObjectInputStream ois = new ObjectInputStream(fit);
        // записываем сразу сэттинг, т к  в  мэйне мы писали его первым
        Settings ss= (Settings) ois.readObject();//(Settings)  преобразовываем выводимый файл в строку,
        User u1 = (User) ois.readObject();
        // закрываем все потоки:
        ois.close();
        fit.close();
        System.out.println(ss);
        System.out.println(u1);
         //(считаем текущее время работы программы процесса)
      Long t= System.currentTimeMillis();// возвращаем время работы оперативной системы в милисек
       /* for(int i =0; i<100000000; i++){
            double d = Math.sin(i*2)+Math.pow(i,3)-Math.sqrt(i/2);
        }*/


        // Потоки
       /* Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<10000; i++){
                    double d = Math.sin(i*2)+Math.pow(i,3)-Math.sqrt(i/2);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =50000000; i<100000000; i++){
                    double d = Math.sin(i*2)+Math.pow(i,3)-Math.sqrt(i/2);
                }
            }
        });
        t1.start();
        t2.start();// ачало работы потока
        t1.join();
        t2.join();// поток продолжает работать независимо
        System.out.println(System.currentTimeMillis()-t);*/


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<1000000000; i++){
                    update(1);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0; i<1000000000; i++){
                    update(-1);
                }
            }
        });
        t1.start();
        t2.start();// ачало работы потока
        t1.join();
        t2.join();
        System.out.println(n);

    }
    public static int n = 0;
    public  static synchronized void update(int d) {
      n+=d;

    }
}
