import java.util.stream.Collectors;

public class Java18 {
    static int a;
    static int b;
    static int c;
    static int fact=1;
    public static void main(String[] args) {
//        list.stream().collect(Collectors.toMap(e->e.getName(),e.getAge()));
//
//        list.stream().map(e->e.getAge()).ifPresent().orElseThrow();
//
////        prototype
//
//        Runnable r=()->{
//          a=1;
//          b=2;
//          c=3;
//        };
//
//        Thread thread=new Thread(r);
//        Thread thread1=new Thread(r);
//        Thread thread2=new Thread(r);
//        Thread thread3=new Thread(r);
//        Thread thread4=new Thread(r);
        int n=7;
        int value=getFactorial(n);
        int value1=getFibonacci(n);
        System.out.println(value1);
    }

    private static int getFactorial(int n) {
        if (n>0){
            fact=fact*n;
            getFactorial(n-1);
        }
        return fact;
    }private static int getFibonacci(int n) {
        if (n>0){
            fact=n+(n-1);
            System.out.println(fact);
            getFibonacci(n-1);
        }
        return fact;
    }
}
