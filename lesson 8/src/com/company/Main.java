package com.company;

import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    	File f= new File("1.txt");
    	if (!f.exists()) {// (!) значит если этоt файл либо путь  не существует, to создать
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (f.isHidden()){//если файл скрыт
		System.out.println(" файл скрыт");
    	}
    	if (!f.canWrite()){
			System.out.println("файл доступен ттолько для чтения");
		}

		//f.setWritable(false);// возможность писать в файле не верна
		f.setLastModified(0);
		//f.delete();//файл удаляется
		File f2= new File ("2.txt");
		f.renameTo(f2);
		File dir = new File ("test\\");
		if (!dir.exists()){//если папки не существует ее нужно создать
			dir.mkdirs();
		}
		dir.list();
		String files[]=dir.list();
		for (int i=0; i<files.length; i++){
			System.out.println(files[i]);
		}
		try {
			PrintWriter pw= new PrintWriter("1.txt", "UTF-8");
			//pw.write("Hello");
			pw.append(" world");
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		System.out.println(f.lastModified());//показывает сколько милисек прошло с 1970 по время создания, изменения файла
	/*User u1=new User("user", "user@mail.ru");
	u1.message=new Message();
	u1.message.text= "Hello";
	u1.message.time=new Date();

	User u2 = new User(u1);// копирование
	System.out.println(u2.login+" "+u2.name);

	User u3= null;//клонирование
	try {
			 u3= u1.clone();// write your code here
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} System.out.println(u3.login+" "+u3.name+" "+ u3.message.text);*/
	}
}
