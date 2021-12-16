/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import model.Client;
import model.Pay;
import model.Trainer;
import model.TrainingPlan;

import view.graphicInterface;
import java.sql.PreparedStatement;

public class Querys {

    public static void setClientQuery(ArrayList<Client> clientQuery) {
        Querys.clientQuery = clientQuery;
    }

    public static void setTrainingPlanQuery(ArrayList<TrainingPlan> trainingPlanQuery) {
        Querys.trainingPlanQuery = trainingPlanQuery;
    }

    public static void setPayQuery(ArrayList<Pay> payQuery) {
        Querys.payQuery = payQuery;
    }

    public static void setTrainerQuery(ArrayList<Trainer> trainerQuery) {
        Querys.trainerQuery = trainerQuery;
    }

    private static ArrayList<Client> clientQuery = new ArrayList();
    private static ArrayList<TrainingPlan> trainingPlanQuery = new ArrayList();
    private static ArrayList<Pay> payQuery = new ArrayList();
    private static ArrayList<Trainer> trainerQuery = new ArrayList();

    public static int logInQuery(String username, String password) {

        int num = 0;

        try {
            Connection con = ConnectionBD.getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM TRAINER WHERE USERNAME = ? AND PASSWORD = ?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet reSet = stmt.executeQuery();
            reSet.next();
            num = Integer.parseInt(reSet.getString(1));
            
            
            reSet.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return num;

    }

    public static ArrayList<String> codesAvailables(String query) {

        ArrayList<String> allCodes = new ArrayList();
        Connection con = ConnectionBD.getConnection();

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                allCodes.add(rs.getString(1));
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return allCodes;
    }

    public static ArrayList<Pay> queryJList(String query, int codCli) {

        payQuery.clear();

        Pay p = new Pay();

        try {

            Connection con = ConnectionBD.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, codCli);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                p = new Pay();
                p.setClientCode(rs.getInt(2));
                p.setPayCod(rs.getInt(1));
                p.setTrainingPlanCode(rs.getInt(3));
                p.setMonthlyPayment(rs.getInt(4));

                payQuery.add(p);

            }
            
            rs.close();
            stmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return payQuery;

    }

    public static int queryGenerateNewPaymentId(String query, int trainingPlanCode, int clientCode) {

        int newCod = 0;

        Connection con = ConnectionBD.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, trainingPlanCode);
            ps.setInt(2, clientCode);

            ResultSet rs = ps.executeQuery();

            rs.next();
            newCod = Integer.parseInt(rs.getString(1));
            
            rs.close();
            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return newCod;
    }

    public static int queryGetClientAge(String query, int clientCode) {

        int clientAge = 0;

        Connection con = ConnectionBD.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, clientCode);

            ResultSet rs = ps.executeQuery();

            rs.next();

            clientAge = rs.getInt(1);
            
            
            rs.close();
            ps.close();

        } catch (SQLException sqe) {
            sqe.printStackTrace();
        }

        return clientAge;

    }

    public static int queryGetPriceMonthTrainingPlan(String query, int trainingPlanCode) {

        int priceMonth = 0;

        Connection con = ConnectionBD.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, trainingPlanCode);

            ResultSet rs = ps.executeQuery();

            rs.next();

            priceMonth = rs.getInt(1);
            
            rs.close();
            ps.close();

        } catch (SQLException sqe) {
            sqe.printStackTrace();
        }

        return priceMonth;

    }

    public static Trainer queryReturnTrainerInfo(String query, String username, String password) {

        Trainer t = new Trainer();

        Connection con = ConnectionBD.getConnection();

        try {
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            rs.next();

            String photoTitle = rs.getString(1);
            String NID = rs.getString(2);
            String date = rs.getString(5);
            String[] dateStructure = new String[3];

            dateStructure = date.split("-");

            int year, month, day;

            year = Integer.parseInt(dateStructure[0]);
            month = Integer.parseInt(dateStructure[1]);
            month--;
            day = Integer.parseInt(dateStructure[2]);

            Date d = new Date(year, month, day);
            
            t = new Trainer(photoTitle, username, d, NID, password);
            
            
            rs.close();
            ps.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return t;

    }
    
    public static int queryCheckNidTrainer(String query,String nid){
        
        int rows = 0;
        
        Connection con = ConnectionBD.getConnection();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nid);    
            ResultSet rs = ps.executeQuery();    
            rs.next();    
            rows = rs.getInt(1);
            
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {ex.printStackTrace();}
        
        return rows;
        
    }

}
