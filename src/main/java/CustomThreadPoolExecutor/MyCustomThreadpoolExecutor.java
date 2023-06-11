package CustomThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyCustomThreadpoolExecutor {
    public static void main(String[] args) {
        MyExecutorService service=new MyThreadPool(4);
        while (true) {
            service.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}

interface MyExecutorService{
    void submit(Runnable runnable);
}
class MyThreadPool implements MyExecutorService{
    static int capacity;
    static int current_capacity;
    static ArrayBlockingQueue<Runnable> workerQueue;
    Execution e;

    MyThreadPool(int capacity){
        this.capacity=capacity;
        current_capacity=0;
        workerQueue=new ArrayBlockingQueue<>(4);
        e=new Execution();
    }

    @Override
    public void submit(Runnable r) {
        try {
            workerQueue.put(r);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        e.executeMyTask();
    }
}

class Execution{
    public void executeMyTask(){
        if (MyThreadPool.current_capacity<MyThreadPool.capacity){
            MyThreadPool.current_capacity++;
            Thread t1=new Thread(()->{
                while (true){
                    if (MyThreadPool.workerQueue.size()!=0){
                        try {
                            MyThreadPool.workerQueue.take().run();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
            }
            });
            t1.start();
        }
    }
}















































//class MyTask implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() +"vishad");
//        }
//    }
//}
//
//interface MyExecutorService{
//    void submit(Runnable r);
//}
//class MyThreadPool implements MyExecutorService{
//    static int capacity;
//    static int currentCapacity;
//    static LinkedBlockingQueue<Runnable> workerQueue;
//    Execution e;
//
//    MyThreadPool(int capacity){
//        MyThreadPool.capacity=capacity;
//        currentCapacity=0;
//        workerQueue=new LinkedBlockingQueue<Runnable>();
//        e=new Execution();
//    }
//    @Override
//    public void submit(Runnable r) {
//        workerQueue.add(r);
//        e.executeMyTask();
//    }
//}
//class Execution implements Runnable{
//    public void executeMyTask(){
//        if (MyThreadPool.currentCapacity<MyThreadPool.capacity){
//            MyThreadPool.currentCapacity++;
//            Thread t1=new Thread(new Execution());
//            t1.start();
//        }
//    }
//
//    @Override
//    public void run() {
//        while(true) {
//            if (MyThreadPool.workerQueue.size() != 0) {
//                MyThreadPool.workerQueue.poll().run();
//            }
//        }
//    }
//}
