
import java.util.Scanner;

class InvalidMarksException extends Exception {
    {
        System.out.println("Enter the Valid Numbers i.e not greater than the 100");
    }
}

public class CheckingTheMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Marks To Be Checked");
            int marks = sc.nextInt();
            if (marks > 100) {
                throw new InvalidMarksException();
            } else {
                System.out.println("Your marks seems fine");
            }
        } catch (InvalidMarksException e) {
            // Exception message is already printed in the exception's instance initializer block
        } finally {
            sc.close(); // Close the scanner to prevent resource leak
        }
    }
}
