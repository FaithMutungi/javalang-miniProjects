package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empset=new HashSet<Employee>();

    Employee emp1= new Employee(101, "precious", 26, "developer", "IT", 40.33);
    Employee emp2=new Employee(102, "Meena", 26, "Tester","CO", 57000);
    Employee emp3=new Employee(103, "Bob", 20, "DevOps Eng","Admin", 5000);
    Employee emp4=new Employee(104, "Max", 27, "System Eng","CO",  70000);


    Scanner scanner= new Scanner(System.in);
    boolean found=false;
    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double sal;


    public EmployeeService() {
       empset.add(emp1);
       empset.add(emp2);
       empset.add(emp3);
       empset.add(emp4);
    }
    //view all employees
    public  void  viewAllEmployees(){
        for (Employee emp:empset){
            System.out.println(emp);

        }

    }
    //get employee based on id
   public void viewEmp(){
       System.out.println("enter id: ");
       id= scanner.nextInt();

       for (Employee emp:empset){

           if (emp.getId() == id) {
               System.out.println(emp);
               found= true;
           }
       }
       if (!found) {
           System.out.println("Employee with this id is not found");
       }

   }

   //update employee
    public  void  updateEmployee(){

        System.out.println("enter id: ");
        id= scanner.nextInt();

        for (Employee emp:empset){

            if (emp.getId() == id) {
                System.out.println("Enter name: ");
                name=scanner.next();
                System.out.println("Enter new Salary ");
                sal= scanner.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated details of the employee are: ");
                System.out.println(emp);
                found= true;
            }
        }
        if (!found) {
            System.out.println("Employee with this id is not found");
        }
        else {
            System.out.println("Employee details are updated successfully");
        }

    }

    //delete employee

    public void  deleteEmp(){

        System.out.println("enter id: ");
        id= scanner.nextInt();
        Employee empdelete= null;

        for (Employee emp:empset){

            if (emp.getId() == id) {
                //empset.remove(emp);
                empdelete=emp;
                found= true;
            }
        }
        if (!found) {
            System.out.println("Employee with this id is not found");
        }
        else {
            empset.remove(empdelete);
            System.out.println("Employee deleted successfully");
        }
    }
    //add emp

    public void  addEmp(){
        System.out.println("Enter id: ");
        id= scanner.nextInt();

        System.out.println("Enter name: ");
        name= scanner.next();

        System.out.println("Enter age: ");
        age= scanner.nextInt();

        System.out.println("Enter designation: ");
        desiganation= scanner.next();

        System.out.println("Enter Department");
        department= scanner.next();

        System.out.println("Enter salary:  ");
        sal=scanner.nextDouble();

        Employee emp= new Employee(id, name, age, desiganation, department, sal);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");

    }



}

