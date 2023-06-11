package leetcode;

public class StrategyPatternComplexClass {
    Sorter sorter;
   public StrategyPatternComplexClass(Sorter sorter){
       this.sorter=sorter;
   }
   public void displaySortedData(int []data){
       int[]sortedData= sorter.sort(data);
       for (int arr:sortedData) {
           System.out.println(arr);
       }
   }

    public static void main(String[] args) {
        int[] data={9,2,1};
        StrategyPatternComplexClass obj=new StrategyPatternComplexClass(new BubbleSort());
        obj.displaySortedData(data);
    }
}
interface Sorter{
    public int[] sort(int[]data);
}
class BubbleSort implements Sorter{

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i]>data[j]){
                    int temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
        return data;
    }
}