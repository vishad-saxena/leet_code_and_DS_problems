import java.util.Comparator;
import java.util.PriorityQueue;

public class Java17 {
    PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
    public void consume(int input){
        queue.add(input);
    }
//    get
    public int[] getHighestTenValues(){
        int[] response=new int[10];
        int i=0;
        if (queue.size()<10){
            while (!queue.isEmpty()) {
                response[i]= queue.poll();
            }
        }
        else {
            for (int j = 0; j < 10; j++) {
                response[j]= queue.poll();
            }
        }
        return response;
    }

    public static void main(String[] args) {
        Java17 obj=new Java17();
        obj.consume(9);
    }
}
