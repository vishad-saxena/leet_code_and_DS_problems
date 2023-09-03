import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDeepCopyTest {
    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<>();
//        map.put("one",1);
//        map.put("two",2);
//        map.put("three",3);
//        map.put("four",4);
//        map.put("five",5);
//        System.out.println(map);
//        Map<String,Integer> temp=new HashMap<>(map);
//        System.out.println("====");
//        for (Map.Entry<String,Integer> entry: temp.entrySet() ) {
//            temp.put(entry.getKey(), entry.getValue()+1);
//        }
//        System.out.println("after temp change");
//        System.out.println(temp);
//        System.out.println("map original");
//        System.out.println(map);

//        ======== Storing EMP OBJ to MAP==============
//        case 1 without Equals and Hascode,
//        case 2 after implementing equals and hashcode
        Map<EmployeeMapObj,Integer> map=new HashMap<>();
        EmployeeMapObj obj=new EmployeeMapObj(1,"raj");
        map.put(obj,1);
        System.out.println(map.get(obj));

//        obj.setName("abc");
        obj.setId(2);
        System.out.println(map.get(obj));

    }

}
class EmployeeMapObj{
    int id;
    String name;

    public EmployeeMapObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeMapObj)) return false;
        EmployeeMapObj that = (EmployeeMapObj) o;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
