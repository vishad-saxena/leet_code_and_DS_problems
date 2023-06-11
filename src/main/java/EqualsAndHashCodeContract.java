import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class EqualsAndHashCodeContract {


    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();
        Student s1= new Student("ashish","23");
        Student s2= new Student("ashish","23");
        Student s3= new Student("swati","32");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }

}
class Student {
    String name;
    String id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public void setId(String id) {
        this.id = id;
    }


//    @Override
//    public int compareTo(Student s) {
//        if (id==s.getId())return name.compareTo(s.getName());
//        if (id>s.getId()) return 1;
//        else return -1;
//    }
}
