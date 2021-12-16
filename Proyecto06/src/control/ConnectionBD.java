/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Onio
 */
public class ConnectionBD {

    private static Connection con;

    public static void Connect() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (Exception e) {
            System.out.println("JDBC driver falied to load.");
            return;
        }

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Gym", "Antonio", "netbeans");
        } catch (Exception e) {
        }

    }

    public static Connection getConnection() {
        return con;
    }

}


