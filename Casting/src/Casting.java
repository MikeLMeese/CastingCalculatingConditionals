public class Casting {

    public static void main(String[] args) throws Exception {

        // Part 1
        double dbl = 112.35;
        System.out.println("Double: " + dbl);
        int num = (int)dbl;
        System.out.println("int: " + num);

        // Part 2
        String someNum = "49";
        System.out.println("The string value is: " + someNum);
        int stringNum = Integer.parseInt(someNum);
        System.out.println("The integer value is: " + stringNum);
    }
}