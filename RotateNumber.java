
import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();
        System.out.print("Enter direction (L for Left, R for Right): ");
        char direction = sc.next().charAt(0);
        sc.close();

        // Convert number to string to work with digits
        String numStr = Integer.toString(num);
        int len = numStr.length();

        // Ensure k is within range
        k = k % len;

        // Perform rotation
        String rotated;
        if (direction == 'L' || direction == 'l') {
            // Left Rotate
            rotated = numStr.substring(k) + numStr.substring(0, k);
        } else if (direction == 'R' || direction == 'r') {
            // Right Rotate
            rotated = numStr.substring(len - k) + numStr.substring(0, len - k);
        } else {
            System.out.println("Invalid direction! Please enter 'L' or 'R'.");
            return;
        }

        // Display the rotated number
        System.out.println("Rotated Number: " + rotated);
    }
}
