import java.util.Scanner;

public class Calculations {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int secondNum = Integer.valueOf(scanner.nextLine());

        // Addition
        int addTotal = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + addTotal);

        // Subtraction
        int subtractTotal = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + subtractTotal);

        // Multiplication
        int multiplyTotal = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + multiplyTotal);

        // Division
        double divideTotal = (float)firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + divideTotal);

        // Modulus
        int remainder = firstNum % secondNum;
        System.out.println(firstNum + " % " + secondNum + " = " + remainder);
    }
}