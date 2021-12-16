package control;

import java.sql.*;
import model.Client;
import view.Window;
import java.sql.PreparedStatement;
/**
 *
 * @author Onio
 */
public class ClientQuery {

    private static ResultSet rs;
    private static Client c = new Client();

    public static boolean executeQuery(String query,String username,String password) {

        boolean next;
        
        try {
            
            Connection con = ConnectionBD.getConnection();
            PreparedStatement s = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            s.setString(1, username);
            s.setString(2, password);
            
            rs = s.executeQuery();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            
            next = rs.next();
            rs.previous();
            
            return next;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    
    public static Client goToEnd(){
        try {
            if(!rs.isLast())
                try {
                    rs.last();
                    buildClientObject();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return c;
    }
    
    
    public static Client goToBeginning(){
        
        try {
            if(!rs.isFirst())
                try {
                    rs.first();
                    buildClientObject();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return c;
    }
    
    public static Client moveForward() {
        
      
        try {
            checkEnd();    
        } catch (ExceptionError ex) {
            e.endQueryMessage(400);
        
        }
        
        return c;
    }
    
    
    private static ExceptionError e = new ExceptionError();
    
    public static void checkEnd() throws ExceptionError{
        try {
            if(!rs.isLast()){
                rs.next();
                buildClientObject();
            }else{
                throw e;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
     public static Client moveBackward() {
        
        
        try {
            checkBeginning();
        } catch (ExceptionError ex) {
            e.beginningQueryMessage(300);
        }


        return c;

    }

    public static void checkBeginning() throws ExceptionError{
        try {
            if (!rs.isFirst()) {
                rs.previous();
                buildClientObject();
            } else {
                 throw e;
                
            }
        } catch (SQLException ex) {
           
        }
    }

    public static void buildClientObject() throws SQLException, NumberFormatException {
        
        String[] date;
        int year;
        int month;
        int day;
        
        date = rs.getString(2).split("-");
        year = Integer.parseInt(date[0]);
        month = Integer.parseInt(date[1]);
        day = Integer.parseInt(date[2]);
        
        c.setClientCode(rs.getInt(1));
        month--;
        c.setDischargeDate(new java.util.Date(year, month, day));
        c.setFullName(rs.getString(3));
        c.setAge(rs.getInt(4));
        c.setTrainerNID(rs.getString(5));
        
    }

}
