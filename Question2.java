//Given a list of employees, each with a name, age, and salary, write a Java program using the Streams API to:
 
//Filter employees who are older than 30.
//Find the average salary of employees who meet the age condition.
//Collect the names of these employees into a List.
//Print the list of employee names and the average salary.
//Hint: Use filter(), map(), collect(), and average() methods from Streams


import java.util.*;
import java.util.stream.Collectors;
class Employee
{
    String name;
    int age;
    double salary;

    Employee(String name, int age,double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;


    }
}
public class Question2
{
    public static void main(String[] args) {
        
        List<Employee> employees = Arrays.asList(
            new Employee("piku",23,60000.0),
            new Employee("chiku",33,50000.0),
            new Employee("gudu",20,45000.0),
            new Employee("papun",31,100000.0)
        );

        List<String> names = employees.stream() // lists into stream for processing
        .filter(e->e.age>30)
        .map(e->e.name)
        .collect(Collectors.toList()); // collects the items into list 

        double avgSalary = employees.stream() // lists into stream for processing
            .filter(e -> e.age > 30)
            .mapToDouble(e -> e.salary)
            .average()
            .orElse(0.0);

        System.out.println("Employees older than 30: " + names);
        System.out.println("Average Salary: $" + avgSalary);
    }
}
