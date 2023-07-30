package LLDS.LogDesign.models;

public class DebugLogger extends RequestHandler{
    public DebugLogger(RequestHandler nextHandler) {
        super(nextHandler);
    }
    public void log(String level,String message){
        if (level.equals("DEBUG")){
            System.out.println("DEBUG "+" debug"+message);
        }
        else{
            super.log(level,message);
        }
    }
}
