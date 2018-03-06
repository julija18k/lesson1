package com.company;

public class User {
    public int id;
    public String login;

    @Override
    public String toString (){
        String userInfo=String.format("User id:%d, login:%s", id, login);
        return userInfo;
    }
    @Override
    public boolean equals(Object obj){// сопостовление, перепрограмирование obgect
        User user = (User)obj;
        if (user.id ==id&&user.login==login){
            return true;
        } return false;

    }
    @Override
    public int hashCode(){
        return 12;
    }
    public User (){// конструктор
        System.out.println(12345);
    }
    public User (int id, String login){
        this.id = id;//свойство ай ди для переменной ай ди
        this.login=login;

    }
}
