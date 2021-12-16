/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Onio
 */
public class Trainer {
    
    private String photoTitle;
    private String username;
    private Date dischargeDate;
    private String NID;
    private transient String password;

    public Trainer(String photoTitle, String username, Date dischargeDate, String NID, String password) {
        this.photoTitle = photoTitle;
        this.username = username;
        this.dischargeDate = dischargeDate;
        this.NID = NID;
        this.password = password;
    }

    public Trainer() {
    }

    @Override
    public String toString() {
        return "Trainer{" + "photoTitle=" + photoTitle + ", username=" + username + ", dischargeDate=" + dischargeDate + ", NID=" + NID + ", password=" + password + '}';
    }
    
    
    

    public String getPhotoTitle() {
        return photoTitle;
    }

    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
