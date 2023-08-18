package CustomThreadPoolExecutor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPoolExecutorPart2 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(5);
        service.shutdown();
        MyThreadpool2 obj=new MyThreadpool2(4);
        for(int i=0;i<10;i++){
           obj.execute(()->{
               System.out.println(Thread.currentThread().getName()+" abc");
           });
        }
    }
}

interface MyExecutorService2{
    void execute(Runnable runnable);
}

class MyThreadpool2 implements MyExecutorService2{
    static int capacity;
    static int currentCapacity;
    static Queue<Runnable> queue;
    static Execution2 execution2;

    public MyThreadpool2(int capacity) {
        this.capacity=capacity;
        currentCapacity=0;
        queue= new LinkedList<>();
        this.execution2 = new Execution2();
    }

    @Override
    public void execute(Runnable runnable) {
        queue.add(runnable);
        execution2.executeMyPool();
    }
}
class Execution2{
    public void executeMyPool(){
        if (MyThreadpool2.currentCapacity<MyThreadpool2.capacity){
            MyThreadpool2.currentCapacity++;
            Thread t=new Thread(()->{
               while(true){
                   if (MyThreadpool2.queue.size()!=0){
                       MyThreadpool2.queue.poll().run();
                   }
               }
            });
            t.start();
        }

    }
}
