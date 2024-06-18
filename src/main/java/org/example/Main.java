package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op= new AtmOperationImpl();
        int atmNumber=12345;
        int atmPin=123;

        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.println("Enter ATM Number : ");
        int atmnumber= in.nextInt();
        System.out.println("ATM pin: ");
        int pin= in.nextInt();
        if ((atmnumber == atmNumber) && (atmPin==pin)) {
            while (true){

                System.out.println("1.View Available Balance\\n2.Withdraw Amount\\n3.Deposit Amount\\n4.View Ministatement\\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch= in.nextInt();

                if (ch == 1) {
                    op.viewBalance();


                } else if (ch==2) {
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount= in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.println("Enter amount to deposit ");
                    double depositAmount= in.nextDouble();
                    op.depositAmount(depositAmount);


                } else if (ch==4) {
                    op.viewMiniStatement();

                } else if (ch==5) {
                    System.out.println("Collect your ATM card\n Thank you for using ATM machine ");
                    System.exit(0);
                } else {
                    System.out.println("Please enter correct choice");
                }


            }

        }else {
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }


    }
}