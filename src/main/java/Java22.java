import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// list of employee(name,salary and age) secondlargest salary of employee details using java8
public class Java22 {
    public static void main(String[] args) {
        List<Employee123> list=new ArrayList<>();
        list.add(new Employee123("vishad",2000l,28));
        list.add(new Employee123("vishad",5000l,28));
        list.add(new Employee123("vishad",1000l,28));
        list.add(new Employee123("vishad",8000l,28));
        Employee123 employee123=list.stream().sorted((e1,e2)->e2.getSalary().compareTo(e1.getSalary())).skip(1).findFirst().get();
        System.out.println(employee123);

    }
}
class Employee123{
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee123{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Long salary;
    int age;
    public Employee123(String name, Long salary,int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }
}
