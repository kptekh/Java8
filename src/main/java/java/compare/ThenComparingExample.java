package src.main.java.java.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThenComparingExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Mark",46,"Computers");
        Employee e2 = new Employee(2,"John",65,"Maths");
        Employee e3 = new Employee(3,"Luke",75,"Electranics");
        Employee e4 = new Employee(4,"Peter",89,"Physics");
        Employee e5 = new Employee(5,"David",66,"Computers");
        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
        List<Employee> afterCompEmpList = employeeList.stream().sorted(Comparator.comparing(Employee::getMarks).reversed().thenComparing(Employee::getName)).collect(Collectors.toList());
        afterCompEmpList.forEach(System.out::println);
        System.out.println();
        Comparator<Employee> marksComp = Comparator.comparing(Employee::getMarks);
        Comparator<Employee> nameComp = Comparator.comparing(Employee::getName);
        List<Employee> twoCompsList = employeeList.stream().sorted(marksComp.thenComparing(nameComp).reversed()).collect(Collectors.toList());
        twoCompsList.forEach(System.out::println);
    }
}
