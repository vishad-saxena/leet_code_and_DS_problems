import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java14 {
    boolean isOdd=true;
    int count=1;
    public void printEven() throws InterruptedException {
        synchronized (this) {
            while (count<=100) {
                if (isOdd){
                    this.wait();
                }
                System.out.println(count + " " + Thread.currentThread().getName());
                isOdd = true;
                count++;
                this.notifyAll();
            }
        }
    }
    public void printOdd() throws InterruptedException {
        synchronized (this) {
            while (count<=100) {
                if (!isOdd){this.wait();}
                System.out.println(count + " " + Thread.currentThread().getName());
                isOdd = false;
                count++;
                this.notifyAll();
                this.wait();
            }

        }

    }

    public static void main(String[] args) {
        Java14 obj=new Java14();
        Runnable r=()->{
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable r2=()->{
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread t1=new Thread(r);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
//        String str="hello";
//        StringBuilder sb=new StringBuilder();
//        Character c=str.chars().mapToObj(e->Character.valueOf((char)e)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e->e.getValue()==1)
//                .findFirst()
//                .get()
//                .getKey();
//
//        System.out.println(c);

//        String str2=str.chars().mapToObj(e->Character.valueOf((char)e)).forEach(StringBuilder::reverse);
//        System.out.println(sb.reverse());


    }

}
