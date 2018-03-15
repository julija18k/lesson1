package com.company;

public class User implements Cloneable{
@Override
public User clone() throws CloneNotSupportedException {
    return (User)super.clone();//скопировали объект
}
    public Message message;
    public String name;
    public  String login;
    public User (String name, String login){
        this.name=name;
        this.login=login;

    }
    public User(User u){
       this(u.name, u.login);// this.name=u.name;

    }
}
