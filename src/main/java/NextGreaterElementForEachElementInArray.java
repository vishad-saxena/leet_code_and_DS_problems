import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//NGE for each Element in an array using Stack and Map
public class NextGreaterElementForEachElementInArray {
    public static void main(String[] args) {
        int[] input={4,5,2,25};
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < input.length; i++) {
            while (!stack.isEmpty() && input[stack.peek()]<input[i]){
                map.put(stack.pop(),input[i]);
            }
            stack.push(i);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            input[entry.getKey()]= entry.getValue();
        }
        while (!stack.isEmpty()){
            input[stack.pop()]=-1;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }// TC(O(n)) , SC(O(n))
}
