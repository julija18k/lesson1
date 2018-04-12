package com.company.models;

import org.json.simple.JSONObject;

public class Item {
// var user = SSon.parse(response);
// user.name="f";
// Spring, MVC: Model viev Controller
    //          объект, вывод, запрос в сервере
    public int id;
    public String name;
    public  float price;
    public String image;
    public String description;
    public JSONObject toJSON(){
        JSONObject obj = new JSONObject();
        obj.put("id", id);
        obj.put("name", name);
        obj.put("price", price);
        obj.put("image", image);
        obj.put("description", description);
        return  obj;
    }

}
