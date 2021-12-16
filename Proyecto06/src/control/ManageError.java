/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.Window;

/**
 *
 * @author Onio
 */
public class ManageError {

    private static String errorMessage = "";

    public static void switchError(int error, String currentDate) {
        switch (error) {

            case 100:
                Window.showMessage("There's no client with this trainer");
                errorMessage = "There's no client with this trainer";
                break;

            case 200:
                Window.showMessage("ERROR: username or password are incorrect, try again please");
                errorMessage = "ERROR: username or password are incorrect, try again please";
                break;

            case 300:
                Window.showMessage("Error, you are at the beginning of the query");
                errorMessage = "Error, you are at the beginning of the query";
                break;

            case 400:
                Window.showMessage("Error, you are at the end of the query");
                errorMessage = "Error, you are at the end of the query";
                break;

            case 500:
                Window.showMessage("Error, The nid already exists in DataBase");
                errorMessage = "Error, The nid already exists in DataBase";
                break;

            case 600:
                Window.showMessage("Error, you dont selected any date");
                errorMessage = "Error, you dont selected any date";
                break;

            case 700:
                Window.showMessage("Error, The NID is not valid.");
                errorMessage = "Error, The NID is not valid.";
                break;

            case 800:
                Window.showMessage("Error, the date is greater than the current date: \n\n" + currentDate);
                errorMessage = "Error, the date is greater than the current date: \n\n" + currentDate + "";
                break;

        }
        

        WriteLogs.write(errorMessage, error);
    }

}
