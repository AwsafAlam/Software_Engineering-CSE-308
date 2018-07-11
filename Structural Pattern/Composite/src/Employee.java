import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String Name;
    private String Dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String Name, String Position, int salary) {
        this.Name = Name;
        this.Dept = Position;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public List<Employee> getSubOrdinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee : "+Name+", dept :"+Dept+", Salary: "+salary);
    }
}
