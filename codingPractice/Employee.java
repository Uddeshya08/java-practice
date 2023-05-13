package codingPractice;

import java.util.ArrayList;
import java.util.List;

public class Employee {

  public int salary;
  public String name;

    public Employee (int salary, String name){
        this.salary=salary;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }


    public static void main(String[] args) {

        List<Employee> empList= new ArrayList<>();

        empList.add(new Employee(10000, "Uddeshya"));
        empList.add(new Employee(2000, "Adarsh"));
        empList.add(new Employee(45000, "Jeevan"));
        empList.add(new Employee(10000, "Ashok"));
        empList.add(new Employee(1000000, "Shiva"));



    }
}
