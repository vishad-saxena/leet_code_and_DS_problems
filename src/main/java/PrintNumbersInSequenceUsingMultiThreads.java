import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumbersInSequenceUsingMultiThreads implements Runnable {
    int remainder;
    static int count = 1;
    final int limit = 100;
    static Object lock = new Object();

    public PrintNumbersInSequenceUsingMultiThreads(int remainder) {
        this.remainder = remainder;
    }

    @Override
    public void run() {
        while (count < limit - 1) {
            synchronized (lock) {
                while (count % 10 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(count + " " + Thread.currentThread().getName());
                count++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbersInSequenceUsingMultiThreads p1 = new PrintNumbersInSequenceUsingMultiThreads(0);
        PrintNumbersInSequenceUsingMultiThreads p2 = new PrintNumbersInSequenceUsingMultiThreads(1);
        PrintNumbersInSequenceUsingMultiThreads p3 = new PrintNumbersInSequenceUsingMultiThreads(2);
        PrintNumbersInSequenceUsingMultiThreads p4 = new PrintNumbersInSequenceUsingMultiThreads(3);
        PrintNumbersInSequenceUsingMultiThreads p5 = new PrintNumbersInSequenceUsingMultiThreads(4);
        PrintNumbersInSequenceUsingMultiThreads p6 = new PrintNumbersInSequenceUsingMultiThreads(5);
        PrintNumbersInSequenceUsingMultiThreads p7 = new PrintNumbersInSequenceUsingMultiThreads(6);
        PrintNumbersInSequenceUsingMultiThreads p8 = new PrintNumbersInSequenceUsingMultiThreads(7);
        PrintNumbersInSequenceUsingMultiThreads p9 = new PrintNumbersInSequenceUsingMultiThreads(8);
        PrintNumbersInSequenceUsingMultiThreads p10 = new PrintNumbersInSequenceUsingMultiThreads(9);

//        FOR threadpoolexecutor
        ExecutorService threadpool = Executors.newFixedThreadPool(10);
        threadpool.submit(p1);
        threadpool.submit(p2);
        threadpool.submit(p3);
        threadpool.submit(p4);
        threadpool.submit(p5);
        threadpool.submit(p6);
        threadpool.submit(p7);
        threadpool.submit(p8);
        threadpool.submit(p9);
        threadpool.submit(p10);




//        FOR customized threads
//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        Thread t3 = new Thread(p3);
//        Thread t4 = new Thread(p4);
//        Thread t5 = new Thread(p5);
//        Thread t6 = new Thread(p6);
//        Thread t7 = new Thread(p7);
//        Thread t8 = new Thread(p8);
//        Thread t9 = new Thread(p9);
//        Thread t10 = new Thread(p10);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//        t9.start();
//        t10.start();

    }
}
