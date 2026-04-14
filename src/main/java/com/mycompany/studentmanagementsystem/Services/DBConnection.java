
package com.mycompany.studentmanagementsystem.Services;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection implements DBConnectionService {

    @Override
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";
        
        try {
            return DriverManager.getConnection(url, user, password);
            //input some indicator that is already connected to the dstabase.
        } catch (Exception e) {
            e.printStackTrace();
           return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
