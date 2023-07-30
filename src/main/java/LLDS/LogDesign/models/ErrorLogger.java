package LLDS.LogDesign.models;

import java.util.Random;

public class ErrorLogger extends RequestHandler{
    public ErrorLogger(RequestHandler nextHandler) {
        super(nextHandler);
    }
    public void log(String level,String message){
        if (level.equals("ERROR")){
            System.out.println("ERROR "+"error "+message);
        }
        else {
            super.log(level, message);
        }

    }
}
