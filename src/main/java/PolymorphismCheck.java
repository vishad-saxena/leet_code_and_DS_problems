class A{
    void m1(){
        System.out.println("A");
    }
}
class B extends A{
//    void m1(){
//        System.out.println("B");
//    }
}
public class PolymorphismCheck {
    public static void main(String[] args) {
        B a=new B();
        a.m1();
    }
}
