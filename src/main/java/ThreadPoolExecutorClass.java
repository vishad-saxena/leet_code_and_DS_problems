import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadPoolExecutorClass {
    public static void main(String[] args) {
        int count =0;
        Executors.newFixedThreadPool(5);
//        we can provide inbuilt new task abort policy as well using new ThreadPoolExecutor.AbortPolicy()/new ThreadPoolExecutor.CallerRunsPolicy()/new ThreadPoolExecutor.DiscardPolicy()/new ThreadPoolExecutor.DiscardOldestPolicy()
        ExecutorService service=new ThreadPoolExecutor(0, 2, 2, TimeUnit.SECONDS, new LinkedBlockingDeque<>(), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println("Task rejected");
            }
        });
        List<Future> arrList=new ArrayList<Future>();
        while(count <10) {
            count++;
            Future<Integer>future=service.submit(() -> {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println("Thread Name: " + Thread.currentThread().getName());
                return new Random().nextInt(10);
            });
            arrList.add(future);

        }
        for (Future f:arrList) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
