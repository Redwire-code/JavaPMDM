/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Onio
 */
public class WriteLogs {
    
    public static void write(String message,int error){
        
        FileWriter fw = null;
        BufferedWriter bf = null;
        try {
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            
            String date = dtf.format(now);
            
            String log = "Error code:  "+error+"  "+message+"  "+date+"\n";
            
            File f = new File("./log/errors.log");
            
            if(!f.exists()){
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } 
            
            fw = new FileWriter(f.getAbsoluteFile(),true);
            
            bf = new BufferedWriter(fw);
            
            bf.write(log);
            
            
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(bf != null)
                    bf.close();
                
                if(fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    
}
