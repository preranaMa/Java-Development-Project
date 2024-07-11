import java.util.Scanner;

public class AddBinaryNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Clear the input buffer
        sc.nextLine();

        System.out.println("Enter two characters:");
        String character1 = sc.nextLine();
        String character2 = sc.nextLine();

        System.out.println("Enter two binary numbers:");
        char binary1 = sc.next().charAt(0);
        char binary2 = sc.next().charAt(0);

        // Calculate sum of numbers
        int sum = num1 + num2;

        // Concatenate characters
        int concatenatedCharacters = character1 + character2;
       char sumchar=(char)concatenatedCharacters;

        // Add binary numbers (as strings)
        String addSum = addBinary(binary1, binary2);

        System.out.printf("The addition of numbers is %d%nBinary sum is %s%nConcatenated characters are %c%n", sum, addSum, sumchar);

        // Close scanner
        sc.close();
    }

    // Function to add two binary strings
    public static String addBinary(String binary1, String binary2) {
        // Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the numbers
        int sum = num1 + num2;

        // Convert sum back to binary string
        return Integer.toBinaryString(sum);
    }
}
