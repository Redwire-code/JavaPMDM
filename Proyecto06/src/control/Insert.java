/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.sql.*;
/**
 *
 * @author Onio
 */
public class Insert {
    
    public static void insertInto(String insertOrder){
        
        
        Connection con = ConnectionBD.getConnection();
        
        try {
            Statement s = con.createStatement();
            s.executeUpdate(insertOrder);
            
        } catch (SQLException ex) {ex.printStackTrace();}
        
    }
    
    
}
