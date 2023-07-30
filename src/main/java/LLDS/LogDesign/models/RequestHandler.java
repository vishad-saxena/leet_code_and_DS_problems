package LLDS.LogDesign.models;

public class RequestHandler {
    RequestHandler nextLogHandler;
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    public RequestHandler(RequestHandler nextHandler) {
        nextLogHandler=nextHandler;
    }
    public void log(String level,String message){
        if (nextLogHandler!=null){
            nextLogHandler.log(level,message);
        }
    }

}
