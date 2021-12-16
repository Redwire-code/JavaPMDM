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
public class Update {

    public static void updateOrder(String query) {

        Connection con = ConnectionBD.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement(query);

        

            ps.executeUpdate();
            
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateClients(String query,String currentDNI, String previousDNI) {

        Connection con = ConnectionBD.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, currentDNI);
            ps.setString(2, previousDNI);

            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
