public class PrintEvenAndOddNumbersUsing2Threads {
    int count=1;
    private void printNumbers(int remainder){
        synchronized (this){
            while (count%3==remainder){

            }
        }

    }

    private void printOddNumbers() throws InterruptedException {
        synchronized (this) {
            while (count != 100) {
                if (count % 2 == 0) {
                    this.wait();
                }
                System.out.println(count + " " + Thread.currentThread().getName());
                count++;
                this.notify();
            }
        }
    }
    private void printEvenNumbers() throws InterruptedException {
        synchronized (this) {
            while (count != 100) {
                if (count % 2 != 0) {
                    this.wait();
                }
                System.out.println(count + " " + Thread.currentThread().getName());
                count++;
                this.notify();
            }
        }
    }
    public static void main(String[] args) {
        PrintEvenAndOddNumbersUsing2Threads obj = new PrintEvenAndOddNumbersUsing2Threads();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    obj.printOddNumbers();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                try {
                    obj.printEvenNumbers();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(r);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();

    }


}
