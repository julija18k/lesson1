package com.company;

import java.io.Serializable;

public class Settings implements Serializable {
    public int posX;
    public int posY;
    public boolean fullScreen;
    @Override ///  переопределяем класс для удобства вывода в мэйне
    public String toString(){
        return String.format("%d, %d, %b", posX, posY, fullScreen);//Д целое число, Б число булеан

    }

}
