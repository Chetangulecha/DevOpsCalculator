
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
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Logger log = LogManager.getLogger(Calculator.class.getName());
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Following operations are availale");
            System.out.print("1. Square root\n" +
                            "2. Factorial\n" +
                            "3. Natural Log\n" +
                            "4. Power\n" +
                            "0. Exit\n" +
                            "\nEnter your choice: ");
            int ch;
            double num, num1, num2;
            int number;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (ch) {
                case 1:
                    System.out.print("Enter number : ");
                    num = scanner.nextDouble();
                    System.out.println("Square root of " + num + " = " + calculator.sqrt(num));
                    log.info("[SquareRoot]" + num);
                    break;
                case 2:
                    System.out.print("Enter number : ");
                    number = scanner.nextInt();
                    System.out.println("Factorial of " + number + " = " + calculator.fact(number));
                    log.info("[Factorial]" + number);
                    break;
                case 3:
                    System.out.print("Enter number : ");
                    num = scanner.nextDouble();
                    System.out.println("Natural Log of " + num + " = " + calculator.nlog(num));
                    log.info("[Log]" + num);
                    break;
                case 4:
                    System.out.print("Enter number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter power number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1 + " to the power " + num2 + " = " + calculator.power(num1, num2));
                    log.info("[Power]" + num1 + " " + num2);
                    break;
                default:
                    System.out.println("Exiting...");
                    return;
            }
            System.out.println();
        } while (true);
    }

    public double sqrt(double num)
    {
        return Math.sqrt(num);
    }

    public int fact(int num) {
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

