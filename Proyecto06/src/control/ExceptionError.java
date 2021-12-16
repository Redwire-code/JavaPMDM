
package control;

import view.Window;


public class ExceptionError extends Exception{
    
    public static void emptyQuery(int error){ //100
        ManageError.switchError(error, "");
    }
    
    public static void logInIncorrect(int error){//200
        ManageError.switchError(error, "");
    }
    
    public static void beginningQueryMessage(int error){//300
        ManageError.switchError(error, "");
    }
    
    public static void endQueryMessage(int error){//400
        ManageError.switchError(error, "");
    }
    
    public static void repeatedNID(int error){//500
        ManageError.switchError(error, "");
    }
    
    public static void emptyDate(int error){//600
        ManageError.switchError(error, "");
    }
    
    public static void NIDNotValid(int error){//700
        ManageError.switchError(error, "");
    }
    
    public static void dateGreaterThanCurrentDate(String currentDate,int error){//800
        ManageError.switchError(error, currentDate);
    }
    
}
