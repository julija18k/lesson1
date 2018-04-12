package com.company.collections;

import com.company.AppConnection;
import com.company.models.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemCollection {
    public static ArrayList <Item> getItems() throws SQLException {
        PreparedStatement ps = AppConnection.conn.prepareStatement("SELECT*FROM items");
        ResultSet result = ps.executeQuery();
        ArrayList<Item> items= new ArrayList<>();
        while(result.next()){
          Item item = new Item();// все данные преобразовываем в строки
            item.name= result.getString("name");
            item.id=result.getInt("id");
            item.description= result.getString("description");
            item.image= result.getString("image");
            item.price = result.getFloat("price");
            items.add(item);

        }return items;
    }
        public static long addItem(Item item) throws SQLException {
            PreparedStatement ps = AppConnection.conn.prepareStatement("INSERT INTO items(name,description, price, image ) VALUES(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, item.name);
            ps.setString(2, item.description);
            ps.setFloat(3, item.price);
            ps.setString(4, item.image);
            ps.executeUpdate();
            ResultSet result = ps.getGeneratedKeys();
            if (result.next()) {
                return result.getLong(1);
            }
            return -1;
        }

            public static boolean updateItem (Item item) throws SQLException {
                PreparedStatement ps = AppConnection.conn.prepareStatement("UPDATE items SET name=?,description=?, price=?, image=?  WHERE id=?");
                ps.setString(1,item.name);
                ps.setString(2, item.description);
                ps.setFloat(3, item.price);
                ps.setString(4, item.image);
                ps.setInt(5,item.id);
                return ps.executeUpdate()==1;
            }
   public static boolean deleteItem (int id) throws SQLException {
       PreparedStatement ps = AppConnection.conn.prepareStatement("DELETE FROM items WHERE id=?");
       ps.setInt(1,id);
       return ps.executeUpdate()==1;

   }
}
