import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeToSeconds {
    public static void main(String[] args) {
        List<String> timings= Arrays.asList("28 minutes","2 hours");
        List<String> newTimings=new ArrayList<String>();
        int newTime=0;
        for (String time:timings) {
            String[] timeArr=time.split(" ");
        switch (timeArr[1]){
            case "minutes":
                newTime=Integer.parseInt(timeArr[0])*60;
                break;

            case "hours":
                newTime=Integer.parseInt(timeArr[0])*3600;
                break;

            case "days":
                newTime=Integer.parseInt(timeArr[0])*86400;
        }
        newTimings.add(newTime+"seconds");

        }
        System.out.println(newTimings);















//        String time="28 minutes";
//        int newValue;
//        int newTime=0;
//        String[] timeArr=time.split(" ");
//        switch (timeArr[1]){
//            case "minutes":
//                newTime=Integer.parseInt(timeArr[0])*60;
//                break;
//
//            case "hours":
//                newTime=Integer.parseInt(timeArr[0])*3600;
//                break;
//
//            case "days":
//                newTime=Integer.parseInt(timeArr[0])*86400;
//        }
//        newValue=newTime;
////        if (timeArr[1].equals("minutes")){
////            newTime=Integer.parseInt(timeArr[0])*60;
////        }
//        System.out.println(newValue);
    }
}
