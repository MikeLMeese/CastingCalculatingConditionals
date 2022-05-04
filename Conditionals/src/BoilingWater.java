import java.util.Scanner;

public class BoilingWater {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number greater than 212:");
        int num = Integer.valueOf(scanner.nextLine());
        if (num > 212) {
            System.out.println("Water is boiling!");
        }
    }
}