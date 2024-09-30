package com.pluralsight;

import java.util.*;

public class PayrollCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = promptForName();
        double hoursWorked = promptForHoursWorked();
        double payRate = promptForPayRate();

        double grossPay = calculateGrossPay(hoursWorked, payRate);
        displayResults(name, grossPay);
    }

    public static String promptForName() {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static double promptForHoursWorked() {
        return promptForDouble("Enter hours worked: ");
    }

    public static double promptForPayRate() {
        return promptForDouble("Enter pay rate: ");
    }

    private static double promptForDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double calculateGrossPay(double hoursWorked, double payRate) {
        return hoursWorked * payRate;
    }

    public static void displayResults(String name, double grossPay) {
        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
    }
}
