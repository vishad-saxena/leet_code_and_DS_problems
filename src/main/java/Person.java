import java.util.Collection;
import java.util.stream.Collectors;

public final class Person {

//    private final Address address;
//
//    public Person(Address address) {
//        this.address = address;
//    }

//    public Address getAddress(){
////        return new Address().setStreet(this.getAddress().getStreet());
//        retu
//    }

    public static void main(String[] args) {
        String hello = "Hello";
        String hi = new String("Hello").intern();
        String howdy = new String("Hello");
        System.out.println(hello == howdy); // false
        System.out.println(hi == hello); //false // with intern() -> true

//        WAP to pring hello in every 2 sec for infintie time using lmbda

//        Person person=new Person();
//        Person person2=new Person();
//        Runnable r =()->{
//            while(true){
//                System.out.println("hello");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread t1=new Thread(r);
//        t1.start();

    }
}

//create CSV

//class Address {
//    private String street;
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//}

//public class Employee {
//    private String name;
//    private String salary;
//    private String department;
//}
//public String createCSV(Collection<Employee> employees) {
//    return employees.stream().filter(e->e.getdepartment().equals("Finance")).map(e->e.getSalary()).collect(Collectors.joining(","));
////   //return salary as a comma separated string of only those employees whose department is 'Finance'
////    return null;
//}

//























