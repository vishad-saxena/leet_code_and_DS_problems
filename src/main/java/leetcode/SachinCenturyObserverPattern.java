package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SachinCenturyObserverPattern {
    public static void main(String[] args) throws InterruptedException {
        SachinCentury sachin=new SachinCentury();
        sachin.register("vishad");
        sachin.register("vishesh");
        sachin.register("Honey");
        sachin.register("Devarshi");

        Runnable r1=()->{
            int i=0;
            while(true){
                i++;
                System.out.println(i);
                System.out.println();
                if (i==1000000){
                    sachin.notifier();
                    break;
                }
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
        t1.join();
    }

}
class SachinCentury{
    ArrayList<String> fans=new ArrayList<>();
    public void register(String name){
        fans.add(name);
    }
    public void notifier(){
        for (String name:fans) {
            System.out.println(name+" notified");
        }
    }
}
