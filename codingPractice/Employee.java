package codingPractice;

import java.util.*;

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


        System.out.println("Emp with Salary greater then 10000 and starts with A");
        for(Employee emp: empList){

            if(emp.getSalary()>=10000 && emp.getName().startsWith("A")){
                System.out.println(emp.getName()+" "+emp.getSalary());
            }

        }

        List<Employee> filterList=new ArrayList<>();
        for(Employee emp: empList){

            if(emp.getSalary()>=10000){
               filterList.add(emp);
            }
        }

        Collections.sort(filterList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Employee with salary greater then 10,000");

        for (Employee emp: filterList){
            System.out.println(emp.getName());
        }


    }
}
