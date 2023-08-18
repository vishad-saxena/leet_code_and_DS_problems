import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Java12 {
    public static void main(String[] args) {
        NodeTree root=new NodeTree(4);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair1> queue=new ArrayDeque<>();
        queue.add(new Pair1(0,root));
        while(!queue.isEmpty()){
            Pair1 pair1=queue.poll();
            if (!map.containsKey(pair1.horizontalDistance)){
                map.put(pair1.horizontalDistance, pair1.nodeTree.val);
            }
            if (pair1.nodeTree.right!=null){
                queue.add(new Pair1(pair1.horizontalDistance+1,pair1.nodeTree.right));
            }

        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}

class Pair1{
    int horizontalDistance;
    NodeTree nodeTree;
    public Pair1(int horizontalDistance,NodeTree nodeTree){
        this.horizontalDistance=horizontalDistance;
        this.nodeTree=nodeTree;
    }
}
class NodeTree {
    int val;
    NodeTree left;
    NodeTree right;
    public NodeTree(int val){
        this.val=val;
    }
}
