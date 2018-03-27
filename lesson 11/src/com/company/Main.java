package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//загрузка библиотеки
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }//  подключение к базе данных
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "admin", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            PreparedStatement ps= conn.prepareStatement("SELECT*FROM user");
            ResultSet result = ps.executeQuery(); // создаем объект в котором будет сохр результат команды
            while (result.next()){
                System.out.println(result.getInt("id"));// выводим столбик айди тип указываем инт
                System.out.println(result.getString("login"));// выводим столбик логин тип указываем  стринг
                System.out.println(result.getString("reg_date"));

            }

            ps.executeQuery();// отправляет запрос на выполнение, executeQuery возвращает данные(где есть селект), если executeapdate не возвращает данные

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
           PreparedStatement ps = conn.prepareStatement("INSERT INTO user ( login, reg_date, password) VALUES (?, NOW(),?)");//запрос
        ps.setString(1, "грклл");// вставляем значения в предыд запрос, 1 номер ? в запросе
        ps.setString(2, "1258j");
        ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
