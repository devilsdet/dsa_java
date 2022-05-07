package dsa_java.newfeature.lexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String ename;
    int eno;

    Employee(String ename, int eno) {
        this.ename = ename;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return this.ename + ":" + this.eno;
    }
}
public class Test_03 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Durga", 430));
        employeeList.add(new Employee("Sunny", 435));
        employeeList.add(new Employee("Binny", 432));
        employeeList.add(new Employee("Chinny", 431));
        System.out.println(employeeList);
        Collections.sort(employeeList, Comparator.comparing(o -> o.ename));
        System.out.println(employeeList);

    }

}
