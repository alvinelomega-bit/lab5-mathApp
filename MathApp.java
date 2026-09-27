/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template 
 */ 
package MathApp.java; 
 
import java.util.Scanner; 

/** 
 * 
 * @author Alvin E. Omega 
 */ 
public class MathApp { 
 
    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int choice; 
 
        do {
            System.out.println("!! MATH APP MENU !!");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("9. Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers (stored in an array)");
            System.out.println("12. Maximum of N numbers (stored in an array)");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    // Addition 
                    System.out.println("Enter first number:");
                    double a = input.nextDouble();

                    System.out.println("Enter second number:");
                    double b = input.nextDouble();

                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    // Subtraction 
                    System.out.println("Enter first number:");
                    a = input.nextDouble();

                    System.out.println("Enter second number:");
                    b = input.nextDouble();

                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    // Multiplication 
                    System.out.println("Enter first number:");
                    a = input.nextDouble();

                    System.out.println("Enter second number:");
                    b = input.nextDouble();

                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    // Division 
                    System.out.println("Enter first number:");
                    a = input.nextDouble();

                    System.out.println("Enter second number:");
                    b = input.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }

                    break;

                case 5:
                    // Factorial 
                    System.out.println("Enter a number:");
                    int n = input.nextInt();

                    if (n < 0) {
                        System.out.println("Error: Factorial cannot be negative.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= n; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Result: " + factorial);
                    }

                    break;

                case 6:
                    // Power 
                    System.out.println("Enter base (x):");
                    double x = input.nextDouble();

                    System.out.println("Enter exponent (y):");
                    double y = input.nextDouble();

                    System.out.println("Result: " + Math.pow(x, y));

                    break;

                case 7:
                    // Sum of numbers 1 to N 
                    System.out.println("Enter N:");
                    n = input.nextInt();

                    if (n < 1) {
                        System.out.println("Error: N must be at least 1.");
                    } else {
                        int sum = 0;

                        for (int i = 1; i <= n; i++) {
                            sum = sum + i;
                        }
                        System.out.println("Result:" + sum);
                    }
                    break;

                case 8:
                    // Check if a number is prime
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();

                    boolean isPrime = true;

                    if (number < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println(number + " is a prime number.");
                    } else {
                        System.out.println(number + " is not a prime number.");
                    }

                    break;

                case 9:
                    // GCD
                    System.out.print("Enter first number: ");
                    int gcdA = input.nextInt();

                    System.out.print("Enter second number: ");
                    int gcdB = input.nextInt();

                    gcdA = Math.abs(gcdA);
                    gcdB = Math.abs(gcdB);

                    while (gcdB != 0) {
                        int remainder = gcdA % gcdB;
                        gcdA = gcdB;
                        gcdB = remainder;
                    }

                    System.out.println("GCD: " + gcdA);

                    break;

                // 10. Absolute value
                case 10:
                    System.out.print("Enter a number: ");
                    double absoluteNumber = input.nextDouble();

                    System.out.println("Absolute value: "
                            + Math.abs(absoluteNumber));
                    break;

                // 11. Average of N numbers
                case 11:
                    System.out.print("Enter N: ");
                    int averageN = input.nextInt();

                    if (averageN <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] numbers = new double[averageN];
                        double total = 0;

                        for (int i = 0; i < averageN; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            numbers[i] = input.nextDouble();
                            total += numbers[i];
                        }

                        double average = total / averageN;

                        System.out.println("Average: " + average);
                    }
                    break;

                // 12. Maximum of N numbers
                case 12:
                    System.out.print("Enter N: ");
                    int maxN = input.nextInt();

                    if (maxN <= 0) {
                        System.out.println("Error: N must be greater than 0.");
                    } else {
                        double[] values = new double[maxN];

                        for (int i = 0; i < maxN; i++) {
                            System.out.print("Enter number " + (i + 1) + ": ");
                            values[i] = input.nextDouble();
                        }

                        double maximum = values[0];

                        for (int i = 1; i < maxN; i++) {
                            if (values[i] > maximum) {
                                maximum = values[i];
                            }
                        }

                        System.out.println("Maximum: " + maximum);
                    }
                    break;

                // Exit
                case 0:
                    System.out.println("Thank you for using the Math App!");
                    break;

                // Invalid choice
                default:
                    System.out.println("Invalid choice. Please select 0-12.");
            }

        } while (choice != 0);

        input.close();
    }
}
