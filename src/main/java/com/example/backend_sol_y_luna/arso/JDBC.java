package com.example.backend_sol_y_luna.arso;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class JDBC {
    private List<String> users = new ArrayList<>();
    private final DataProperties db;
    public JDBC(){
        this.db=new DataProperties();
    }
    public JDBC(DataProperties db){
        this.db=db;
    }
    public List<String>handleRequest(){

        String url = "jdbc:mysql://database-proyecto.cvegua2ek8g0.us-east-2.rds.amazonaws.com:3306/arso";
        try(Connection connx = DriverManager.getConnection(url, "root", "mysql123")){
            if(!connx.isValid(0)){
                System.out.println("No es posible conectar a : "+url);
                System.exit(0);
            }
            PreparedStatement selectStatement = connx.prepareStatement("SELECT * FROM USUARIO");
            ResultSet rs = selectStatement.executeQuery();
            while (rs.next()){
                String email = rs.getString("email");
                System.out.println(email);
                users.add(email);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
