import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        System.out.println("Enter your age");

        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        if (age > 18) {
            System.out.println("Your age is 18+");
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("Your age is not 18+");
            System.out.println("You are not eligible to vote");
        }
    }
}
