package com.example.backend_sol_y_luna.arso;

public class DataProperties {
    private final String host;
    private final int port;
    private final String db;
    private final String username;
    private final String password;

    public DataProperties(){
        this.host = System.getenv("RDS_HOSTNAME");
        this.db = System.getenv("RDS_DB_NAME");
        this.username = System.getenv("RDS_USERNAME");
        this.password = System.getenv("RDS_PASSWORD");
        this.port = Integer.parseInt("RDS_PORT");
    }

    public DataProperties(String host, int port, String db, String username, String password) {
        this.host = host;
        this.port = port;
        this.db = db;
        this.username = username;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getDb() {
        return db;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
