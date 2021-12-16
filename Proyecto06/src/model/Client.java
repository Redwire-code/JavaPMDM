/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Onio
 */
public class Client {
    
    
    private int clientCode;
    private int age;
    private String fullName;
    private Date dischargeDate;
    private String trainerNID;

    public String getTrainerNID() {
        return trainerNID;
    }

    public void setTrainerNID(String trainerNID) {
        this.trainerNID = trainerNID;
    }

    public Client() {
    }

    public Client(int clientCode, int age, String fullName, Date dischargeDate,String trainerNID) {
        this.clientCode = clientCode;
        this.age = age;
        this.fullName = fullName;
        this.dischargeDate = dischargeDate;
        this.trainerNID = trainerNID;
    }

    @Override
    public String toString() {
        
        SimpleDateFormat sfd;
        
        sfd = new SimpleDateFormat("yyyy-MM-dd");
        
       
        
        return "Client{" + "clientCode=" + clientCode + ", age=" + age + ", fullName=" + fullName + ", dischargeDate=" +  sfd.format(dischargeDate) + '}';
    }
    
    

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }
    
    
    
    
    
}
