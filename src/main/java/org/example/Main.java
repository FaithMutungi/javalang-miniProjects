package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    EmployeeService service= new EmployeeService();
    static boolean ordering= true;
    public static void menu(){
        System.out.println("""
                ... Welcome To Employee Management System.....\

                1. Add Employee\

                2.View Employee\

                3.Update Employee\

                4. Delete Employee\

                5.View All Employee\

                6. Exist\s""");

    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        EmployeeService service= new EmployeeService();

        do{

            menu();
            System.out.println("Enter your choice");
            int choice= sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add employee");
                    service.addEmp();
                    break;

                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;

                case 3:
                    System.out.println("update employee");
                    service.updateEmployee();
                    break;

                case 4:
                    System.out.println("Delete employee");
                    service.deleteEmp();
                    break;

                case 5:
                    System.out.println("view all employees");
                    service.viewAllEmployees();
                    break;

                case 6:
                    System.out.println("Thank you for using application");
                    System.exit(0);

                default:
                    System.out.println("please enter a valid choice");

            }




        }while (ordering);



    }
}