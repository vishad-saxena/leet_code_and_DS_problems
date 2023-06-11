import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCompare {

    public static void main(String[] args) {
        List<Student> l=new ArrayList<>();

        Student s1= new Student("ashish","29");
        Student s2= new Student("devarshi","29");
        Student s3= new Student("swati","27");

        l.add(s2);
        l.add(s3);
        l.add(s1);
        System.out.println(l);
//        Collections.sort(l,new IdComparator());
//        System.out.println(l);
//        Collections.sort(l,new NameComparator());
//        System.out.println(l);
        Collections.sort(l,new IdComparator());
        System.out.println(l);
//        Collections.sort(l,new NameComparator());
//        System.out.println(l);

    }

}
class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId().equalsIgnoreCase(o2.getId())) return o1.getName().compareTo(o2.getName());
        return o1.getId().compareTo(o2.getId());

    }
}
class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

