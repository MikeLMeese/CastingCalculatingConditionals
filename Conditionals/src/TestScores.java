import java.util.Scanner;

public class TestScores {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Name a number between 0 and 100");
        int score = Integer.valueOf(scanner.nextLine());
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is an A. Well done!");
        } else if (score >= 80 && score < 90) {
            System.out.println("Your grade is a B. Keep trying!");
        } else if (score >= 70 && score < 80) {
            System.out.println("Your grade is a C. C's don't get degrees.");
        } else if (score >= 60 && score < 70) {
            System.out.println("Your grade is a D. Bruh.");
        } else if (score < 60) {
            System.out.println("Your grade is an F. WHAT IS YOU DOING FAM?!");
        } else {
            System.out.println("Please input a number between 0 and 100");
        }
    }
}