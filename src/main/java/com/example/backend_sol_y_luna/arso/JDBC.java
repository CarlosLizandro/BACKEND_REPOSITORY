package com.example.backend_sol_y_luna.arso;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://database-proyecto.cvegua2ek8g0.us-east-2.rds.amazonaws.com:3306/arso";
        String name = "root";
        String password = "mysql123";

        try {
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USUARIO");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " | " + resultSet.getString("nombre")+ " | "+ resultSet.getString("apellido"));
            }
            connection.close();
            statement.close();
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
