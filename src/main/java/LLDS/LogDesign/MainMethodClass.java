package LLDS.LogDesign;

import LLDS.LogDesign.models.DebugLogger;
import LLDS.LogDesign.models.ErrorLogger;
import LLDS.LogDesign.models.InfoHandler;
import LLDS.LogDesign.models.RequestHandler;

public class MainMethodClass {
    public static void main(String[] args) {
        RequestHandler logRef=new InfoHandler(new DebugLogger(new ErrorLogger(null)));
        logRef.log("ERROR","message");
        logRef.log("DEBUG","message");
        logRef.log("INFO","message");
    }
}
