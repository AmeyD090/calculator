package com.example.demo;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result is: " + result);
    }
}
	


