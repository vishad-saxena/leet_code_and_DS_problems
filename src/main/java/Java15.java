public class Java15 {
    public static void main(String[] args){

        int[][] input= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int value=48;

        int[] cordinates=getCoordinatesForValue(input,value);
    }

    private static int[] getCoordinatesForValue(int[][] input,int value){
        int i=0;
        int j=0;
        int k=0;
        int l=input[0].length-1;
        int c1=input[i][j];
        int c2=input[k][l];

        while(input[i][j]<=value && value<input[k][l]){
            l--;
        }
        if(input[k][l]<value){
            for(int m=k;m<=input[0].length;m++){
                if(input[m][l]==value){
                    return new int[]{m,l};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
