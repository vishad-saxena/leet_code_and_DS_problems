public class FlowerBoxProblemHouseRobber {
    public static void main(String[] args) {
        int [] flowerSpots={20,5,1,13,6,40};
        int max=getHelper(flowerSpots);
        System.out.println(max);

    }

    private static int getHelper(int[] flowerSpots) {
        int max=0;
        int sow=0;
        int notSow=0;
        for (int i = 0; i < flowerSpots.length; i++) {
            max=Math.max(flowerSpots[i]+sow,notSow);
            sow=notSow;
            notSow=max;
        }
        return max;
    }
}
