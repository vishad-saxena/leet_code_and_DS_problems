package practice;

import leetcode.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Usecases {
    public static void main(String[] args) {
//  1.    Given a list of integers, find out all the even numbers
//        that exist in the list using Stream functions?
//        findAllEvenerNumbersThatExistsinList();

//  2.    Given a list of integers, find out all the numbers
//        starting with 1 using Stream functions?
//        findAllBumbersStartingWith1();

//  TODO:IMPORTANT CONCEPT INSIDE 3.    How to find duplicate elements in a given integers
//  list in java using Stream functions?
//        findDuplicatesFromListUsingStream();

//   4.   Given the list of integers, find the first element of the list using Stream functions
//        findFirstElementFromList();

//   5.   Given a list of integers, find the total number of elements present in the list using Stream functions?
//        findTotalElementsInList();

//   6.   Given a list of integers, find the maximum value element present in it using Stream functions?
//          findMaxFromListOfIntegers();

//   7.   Given a String, find the first non-repeated character in it using Stream functions?
//        findFirsNonRepeatedCharacter();

//   8.   Given a String, find the first repeated character in it using Stream functions?
//        findFirstRepeatedCharacterInString();

//   9.    Find second highest salary of employees
        fndSecondHighestSalary();
   }

    private static void fndSecondHighestSalary() {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"vishad"));
        list.add(new Employee(3,"vishad"));
        list.add(new Employee(2,"vishad"));
        list.add(new Employee(4,"vishad"));
        Employee e=list.stream().sorted((e1,e2)->Integer.compare(e2.getAge(),e1.getAge())).skip(1).findFirst().get();
        System.out.println(e.getAge());
    }

    private static void findFirstRepeatedCharacterInString() {
        String input = "Java Articles are Awesome";

        List<Map.Entry<Character,Long>>list=input.chars()
                .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1l)
                .collect(Collectors.toList());
        System.out.println(list);

//                .findFirst()
//                .ifPresent(System.out::println);
    }

    private static void findFirsNonRepeatedCharacter() {
        String input = "Java articles are Awesome";
        Set<Integer> set=new HashSet<>();
        Character c=input.chars()
                .mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(c);
    }

    private static void findMaxFromListOfIntegers() {
        List<Long> myList = Arrays.asList(10l,15l,8l,49l,25l,98l,98l,32l,15l);
        myList.stream().max((o1, o2) -> o1.compareTo(o2)).ifPresent(System.out::println);
    }

    private static void findTotalElementsInList() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Long count=myList.stream().count();
        System.out.println(count);
    }


    private static void findFirstElementFromList() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);
    }

    private static void findDuplicatesFromListUsingStream() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer>set=new HashSet<>();
        myList.stream().filter(n-> !set.add(n)).forEach(System.out::println);
    }

    private static void findAllBumbersStartingWith1() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(s->s.toString()).filter(s -> s.startsWith("1")).forEach(System.out::println);
    }

    private static void findAllEvenerNumbersThatExistsinList() {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
    }


}
class Student {
    int rollNo;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}
