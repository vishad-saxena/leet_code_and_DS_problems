public class AdapterDesignPattern {
    public static void clientCode(NewPrinter adapter){
        adapter.printNew("This is new"," printer text");
    }

    public static void main(String[] args) {
        OldPrinter oldPrinter=new OldPrinter();
        NewPrinter adapter=new Adapter(oldPrinter);
        clientCode(adapter);


    }
}

class Adapter implements NewPrinter{
    OldPrinter oldPrinter;
    public Adapter(OldPrinter oldPrinter){
        this.oldPrinter=oldPrinter;
    }

    @Override
    public void printNew(String text1,String text2) {
        oldPrinter.printOld(text1+text2);
    }
}
class OldPrinter{
    public void printOld(String text){
        System.out.println("Old Printer: "+text);
    }
}
interface NewPrinter{
    void printNew(String text1,String text2);
}
