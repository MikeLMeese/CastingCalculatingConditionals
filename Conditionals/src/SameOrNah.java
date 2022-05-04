import java.util.Scanner;

public class SameOrNah {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a word:");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another word:");
        String secondWord = scanner.nextLine();
        if (firstWord.equals(secondWord)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}