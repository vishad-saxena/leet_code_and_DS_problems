import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomThread{
    public static Map<String,String> map=new HashMap<>();
    public static void main(String[] args) throws InterruptedException {

        System.out.println(map.put("a","a"));
        System.out.println(map.put(null,null));
        System.out.println(map.put(null,"null1"));
//        Runnable r1=()->{
//                try {
//                    Thread.sleep(1000);
//                    map.put("e",null);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//        };
//        Runnable r2=()->{
//                try {
//                    Thread.sleep(1000);
//                    map.put("d","d");
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//        };
//        Thread t1=new Thread(r1);
//        Thread t2=new Thread(r2);
//        t1.start();
//        t2.start();
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry);
            Thread.sleep(1000);
        }
        System.out.println(map);
    }
}
