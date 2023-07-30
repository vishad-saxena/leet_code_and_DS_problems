package LLDS.LogDesign.models;

public class InfoHandler extends RequestHandler{

    public InfoHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }
    public void log(String level,String message){
        if (level=="INFO"){
            System.out.println("INFO "+"Info "+message);
        }
        else {
            super.log(level,message);
        }
    }
}
