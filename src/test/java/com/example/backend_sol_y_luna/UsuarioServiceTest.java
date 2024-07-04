package com.example.backend_sol_y_luna;

import com.example.backend_sol_y_luna.arso.DataProperties;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import com.example.backend_sol_y_luna.arso.JDBC;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UsuarioServiceTest{
    private JDBC sut;
    private DataProperties db;
    @BeforeEach
    void setUp(){
        db = new DataProperties("database-proyecto.cvegua2ek8g0.us-east-2.rds.amazonaws.com",
                3306,
                "arso",
                "root",
                "mysql123");
        sut = new JDBC(db);
    }
    @Test
    void listaUsuarios(){
        List<String> emails = sut.handleRequest();
        assertEquals(35, emails.size());
    }
}

