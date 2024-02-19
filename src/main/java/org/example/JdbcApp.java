package org.example;

import java.sql.*;

public class JdbcApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/students";
        String username = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            while (resultSet.next()){
                System.out.println("Student id : " + resultSet.getInt("st_id"));
                System.out.println("Student name : " + resultSet.getString("st_name"));
                System.out.println("Student Course : " + resultSet.getString("st_course"));
                System.out.println("-------------------------");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
