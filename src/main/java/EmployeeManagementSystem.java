//`Employee` that represents an employee with the following properties:
//
//
//
//- `id` (integer): unique identifier for each employee.
//
//- `name` (String): the name of the employee.
//
//- `department` (String): the department the employee belongs to.
//
//- `salary` (double): the monthly salary of the employee.
//
//
//
//The class should include the following methods:
//
//
//
//- `getDetails()`: A method that returns a string representation of the employee's details in the following format:
//
// Employee ID: <id>, Name: <name>, Department: <department>, Salary: <salary>
//
//- `getAnnualSalary()`: A method that calculates and returns the employee's annual salary based on their monthly salary.
//
//================================================
//EmployeeManagementSystem Class**
//
//
//
//Create a class called `EmployeeManagementSystem`, which will be responsible for managing a collection of employees. The class should include the following properties:
//
//- `employees` (ArrayList<Employee>): A collection to store employee objects.
//
//The class should have the following methods:
//
//- `addEmployee(Employee emp)`: A method that adds a new employee to the collection.
//
//- `removeEmployee(int employeeId)`: A method that removes an employee from the collection based on their ID. If the employee with the given ID is not found, throw a custom exception called `EmployeeNotFoundException`.
//
//- `getEmployeeCount()`: A method that returns the total number of employees in the collection.
//
//- `getAllEmployees()`: A method that returns an ArrayList containing all the employee objects.
//
//- `getEmployeesByDepartment(String department)`: Print all the employees belonging to a particular dept using stream api, sort by lowest to highest salary.
//
//
//
//**Exception Handling: EmployeeNotFoundException**
//
//
//
//Create a custom exception class called `EmployeeNotFoundException`, which should extend the `Exception` class. This exception will be used in the `EmployeeManagementSystem` class when an employee with a specific ID is not found during removal.
//


import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee {
    Integer id;

    public Employee(Integer id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    String department;
    Double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getDetails(Employee employee){
        return this.toString();
    }
    public Double getAnnualSalary(Double salary){
        return 12*salary;
    }

}
public class EmployeeManagementSystem{
    ArrayList<Employee> list=new ArrayList<>();

    public boolean addEmployee(Employee employee){
        list.add(employee);
        return true;
    }
    public boolean removeEmployee(Integer emplyeeId){
        for (Employee employee:list) {
            if (employee.getId().equals(emplyeeId)){
                list.remove(employee);
                return true;
            }
        }
        return false;
    }

    public int getEmployeeCount(){
        return list.size();
    }

    public void getEmployeesByDepartment(String department){
        list.stream().filter(e1->e1.getDepartment().equals(department)).sorted((e1,e2)->e1.getSalary().compareTo(e2.getSalary())).forEach(System.out::println);
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems=new EmployeeManagementSystem();
        ems.addEmployee(new Employee(1,"vishad","tech",20000d));
        ems.addEmployee(new Employee(2,"saxena","tech",10000d));
        ems.addEmployee(new Employee(3,"pragati","tech",40000d));
        ems.addEmployee(new Employee(4,"arindam","tech",30000d));

//        ems.removeEmployee(1);
//        System.out.println(ems.getEmployeeCount());
        ems.getEmployeesByDepartment("tech");
        String str="vishad";

    }

}
