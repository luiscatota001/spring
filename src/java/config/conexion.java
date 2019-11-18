/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author luisc
 */
public class conexion {
    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.56.104:3306/db_catola_luis");
        dataSource.setUsername("curso");
        dataSource.setPassword("java");
        return dataSource;
    }
    
}
