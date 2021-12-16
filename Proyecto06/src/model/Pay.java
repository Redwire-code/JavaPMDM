/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Onio
 */
public class Pay {
    
    private int clientCode;
    private int payCod;
    private int trainingPlanCode;
    
    private int monthlyPayment;

    public Pay() {
    }

    @Override
    public String toString() {
        return "Pay Info: " + " Client Code: " + clientCode + " Pay Code: " + payCod + ", Training Plan Code: " + trainingPlanCode + ", MonthlyPayment: " + monthlyPayment;
    }

    public Pay(int clientCode, int payCod, int trainingPlanCode, int monthlyPayment) {
        this.clientCode = clientCode;
        this.payCod = payCod;
        this.trainingPlanCode = trainingPlanCode;
        this.monthlyPayment = monthlyPayment;
    }

    public int getClientCode() {
        return clientCode;
    }

    public void setClientCode(int clientCode) {
        this.clientCode = clientCode;
    }

    public int getPayCod() {
        return payCod;
    }

    public void setPayCod(int payCod) {
        this.payCod = payCod;
    }

    public int getTrainingPlanCode() {
        return trainingPlanCode;
    }

    public void setTrainingPlanCode(int trainingPlanCode) {
        this.trainingPlanCode = trainingPlanCode;
    }

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(int monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
    
    
    
    
}
