import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        int first_number;
        int second_number;
        int result;

        Scanner in = new Scanner(System.in);

        System.out.println("Hi! I can multiply 2 numbers. Wanna check?" +
                "\nEnter the first number:");
        first_number = in.nextInt();
        System.out.println("Enter the second number:");
        second_number = in.nextInt();
        result = first_number*second_number;

        System.out.println("The result: "+first_number+" * "+second_number+" = "  + result +
                        "\nSee? I'm smart!");
    }
}
