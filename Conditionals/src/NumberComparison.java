import java.util.Scanner;

public class NumberComparison {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        if (firstNum == secondNum) {
            System.out.println("Both numbers are the same");
        } else if (firstNum > secondNum) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}