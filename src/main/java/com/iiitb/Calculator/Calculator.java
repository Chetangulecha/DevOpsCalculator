
package com.iiitb.Calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    public Calculator()
    {

    }
    public static void main(String[] args)  {
        Calculator calC = new Calculator();
        calC.mainMenu();
    }
    public void mainMenu() {
        Calculator calculator = new Calculator();
        Logger log = LogManager.getLogger(Calculator.class.getName());
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Following operations are available");
            System.out.print("1. Square root\n" +
                    "2. Factorial\n" +
                    "3. Natural Log\n" +
                    "4. Power\n" +
                    "0. Exit\n" +
                    "\nEnter your choice: ");
            int ch;
            double num = 0.0, num1= 0.0, num2= 0.0;
            int number = 0;

            try {
                ch = scanner.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Please provide correct input option");
                log.warn("[InvalidOption] - " + "Wrong input option provided");
                mainMenu();
                return;
            }
            switch (ch) {
                case 1:
                    System.out.print("Enter number : ");
                    try {
                        num = scanner.nextDouble();
                    }
                    catch(InputMismatchException e){
                        System.out.println("Provide valid input");
                        log.error("[InvalidInput] - " + "Invalid input value");
                        mainMenu();
                        return;
                    }
                    if(num < 0){
                        System.out.println("Square root of negative value not possible, provide valid input");
                        log.error("[NegativeValueInput] - " + "Negative value input");
                    }
                    else {
                        double ans = calculator.sqrt(num);
                        System.out.println("Square root of " + num + " = " + ans);
                        log.info("[SquareRoot] - " + num + " Result " + ans);
                    }
                    break;
                case 2:
                    System.out.print("Enter number : ");
                    try {
                        number = scanner.nextInt();
                    }
                    catch(InputMismatchException e) {
                        System.out.println("Provide valid input");
                        log.error("[InvalidInput] - " + "Invalid input value");
                        mainMenu();
                        return;
                    }
                    if(number < 0){
                        System.out.println("Factorial of negative value not possible, provide valid input");
                        log.error("[NegativeValueInput] - " + "Negative value input");
                    }
                    else {
                        int ans = calculator.fact(number);
                        System.out.println("Factorial of " + number + " = " + ans );
                        log.info("[Factorial] - " + number + " Result " + ans);
                    }break;
                case 3:
                    System.out.print("Enter number : ");
                    try {
                        num = scanner.nextDouble();
                    }
                    catch(InputMismatchException e){
                        System.out.println("Provide valid input");
                        log.error("[InvalidInput] - " + "Invalid input value");
                        mainMenu();
                        return;
                    }
                    if(num < 0){
                        System.out.println("Log of negative value not possible, provide valid input");
                        log.error("[NegativeValueInput] - " + "Negative value input");
                    }
                    else {
                        double ans = calculator.nlog(num);
                        System.out.println("Natural Log of " + num + " = " +  ans);
                        log.info("[Log] - " + num + " Result " + ans);
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Enter number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter power number : ");
                        num2 = scanner.nextDouble();
                    }
                    catch(InputMismatchException e){
                        System.out.println("Provide valid input");
                        log.error("[InvalidInput] - " + "Invalid input value");
                        mainMenu();
                        return;
                    }
                    double ans = calculator.power(num1, num2);
                    System.out.println(num1 + " to the power " + num2 + " = " + ans );
                    log.info("[Power] - " + num1 + " " + num2 + " Result " + ans);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Please provide correct input option");
                    log.warn("[InvalidOption] - " + "Wrong input option provided");
            }
            System.out.println();
        }
    }
    public double sqrt(double num)
    {
        return Math.sqrt(num);
    }

    public int fact(int num) {
        if(num == 0) return 1;
        int ans = 1;
        for(int i=1;i<=num;i++)
            ans = ans * i;
        return ans;
    }

    public double nlog(double num)
    {
        return Math.log(num);
    }

    public double power(double num1, double num2)
    {
        return Math.pow(num1, num2);
    }
}

