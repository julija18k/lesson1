package com.company;

import com.company.collections.ItemCollection;
import com.company.models.Item;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            AppConnection.createConnection();// write your code here
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(ItemCollection.getItems());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Item item=new Item();
        item.image = "kkk11";
        item.description ="jfgjutf";
        item.name= "number";
        item.price=3541;
        item.id=2;
        try {
            ItemCollection.updateItem(item);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ItemCollection.deleteItem(3);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
