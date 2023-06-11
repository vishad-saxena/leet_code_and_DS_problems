package leetcode;

public class PersonFactory {
   public static Person getPerson(String name,String gender){
       if (gender.equalsIgnoreCase("m")){
           return new Male(name);
       }else if(gender.equalsIgnoreCase("f")){
           return new Female(name);
       }
       else return null;
   }

    public static void main(String[] args) {
        Person p=PersonFactory.getPerson("vishad","M");
        p.display();
        Person p2=PersonFactory.getPerson("Devarshi","f");
        p2.display();
    }
}
abstract class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    public abstract String getSalutation();
    public void display(){
        System.out.println("Hello "+this.getSalutation()+" "+ this.name);
    }
}
class Male extends Person{

    Male(String name){
        super(name);
    }
    @Override
    public String getSalutation() {
        return "Mr.";
    }
}
class Female extends Person{

    Female(String name){
        super(name);
    }
    @Override
    public String getSalutation() {
        return "Mrs./Miss";
    }
}