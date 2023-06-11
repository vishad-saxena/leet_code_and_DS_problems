public class CallingAddingMethods {
    int a,b,c,d;
    private void addCounterNumbers(int e,int f,int g,int h){
        a=a+e;
        b=b+f;
        c=c+g;
        d=d+h;
    }
    public static void main(String[] args) {

        CallingAddingMethods cam=new CallingAddingMethods();
        cam.addCounterNumbers(2,3,4,5);
        cam.addCounterNumbers(3,4,5,6);
        System.out.println(cam.a+ " "+ cam.b+" "+cam.c+ " "+ cam.d);
    }
}
