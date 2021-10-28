package tech.pantheon.lubomirgabris;

import java.util.Objects;
import java.util.Scanner;

public class SimpleCalculation {

    private static Scanner scanner = new Scanner(System.in);
    private static SimpleCalculator calculator = new SimpleCalculator();
    private static KaratsubaString karatsubaString = new KaratsubaString();

    public static void main(String[] args) {
        calculatorOptions();
    }

    /**
     * The method provides a menu for entering and changing multiplied numbers,
     * selecting an algorithm for multiplication and terminating the program.
     */
    public static void calculatorOptions() {
        boolean quit = false;
        int choice;

        System.out.println("\nWelcome to my solution of \"Calculate multiplication\" task.");
        printInstructions();

        while (!quit) {
            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    numbersBigInteger();
                    printInstructions();
                    break;
                case 1:
                    if (!Objects.equals(calculator.getFirstNumber(), null) && !Objects.equals(calculator.getSecondNumber(), null)) {
                        multiplication(1);
                        printInstructions();
                    } else {
                        System.out.println("In order to see the result of multiplication, please enter both numbers.");
                    }
                    break;
                case 2:
                    if (!Objects.equals(calculator.getFirstNumber(), null) && !Objects.equals(calculator.getSecondNumber(), null)) {
                        multiplication(2);
                        printInstructions();
                    } else {
                        System.out.println("In order to see the result of multiplication, please enter both numbers.");
                    }
                    break;
                case 3:
                    changeNumber(1);
                    printInstructions();
                    break;
                case 4:
                    changeNumber(2);
                    printInstructions();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Please choose from available options.");
                    printInstructions();
                    break;
            }
        }
    }

    /**
     * The method prompts user to enter the value of two numbers.
     */
    public static void numbersBigInteger() {
        System.out.println("Please enter the first number: ");
        calculator.setFirstNumber(scanner.nextBigInteger());
        System.out.println("Please enter the second number: ");
        calculator.setSecondNumber(scanner.nextBigInteger());
    }


    /**
     * Calculates the product of two numbers
     * @param algorithmSelection Parameter for choosing between different multiplication algorithms.
     *                           Passed as a "choice" form calculatorOptions() method.
     */
    public static void multiplication(int algorithmSelection) {
        switch (algorithmSelection) {
            case 1:
                System.out.println("Result of multiplication is \n" + calculator.getSimpleMultiplication());
                break;
            case 2:
                String num1 = calculator.getFirstNumber().toString();
                String num2 = calculator.getSecondNumber().toString();
                System.out.println("Result of multiplication is \n" + karatsubaString.multiply(num1, num2));
                break;
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To enter the numbers you want to multiply.");
        System.out.println("\t 1 - To multiply two numbers using BigInteger implementation.");
        System.out.println("\t 2 - To multiply two numbers using implementation of algorithm from scratch.");
        System.out.println("\t 3 - To change the first number.");
        System.out.println("\t 4 - To change the second number.");
        System.out.println("\t 5 - To quit the application.");
    }

    /**
     * Changes one of the multiplied numbers.
     * @param number Passed as a "choice" form calculatorOptions() method.
     */
    public static void changeNumber(int number) {
        switch (number) {
            case 1:
                if (!Objects.equals(calculator.getFirstNumber(), null)) {
                    System.out.println("Current value of first number: " + calculator.getFirstNumber());
                    System.out.println("New value of first number: ");
                    calculator.setFirstNumber(scanner.nextBigInteger());
                } else {
                    System.out.println("You need to enter the first number before changing it.");
                }
                break;
            case 2:
                if (!Objects.equals(calculator.getSecondNumber(), null)) {
                    System.out.println("Current value of second number: " + calculator.getSecondNumber());
                    System.out.println("New value of second number: ");
                    calculator.setSecondNumber(scanner.nextBigInteger());
                } else {
                    System.out.println("You need to enter the second number before changing it.");
                }
                break;
        }
    }



}
