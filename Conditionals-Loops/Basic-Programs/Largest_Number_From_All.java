import java.io.*;

/**
 * Take integer inputs till the user enters 0 and print the largest number from
 * all.
 */

public class Largest_Number_From_All {
    public static void main(String[] args) throws IOException {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(IS);
        System.out.print("Enter the number: ");
        int number;
        int largestValue = 0;
        int previousValue;
        while ((number = Integer.parseInt(input.readLine())) != 0) {
            previousValue = number;
            if (number > previousValue) {
                largestValue = number;
            } else {
                largestValue = previousValue;
            }
        }
        System.out.println("The largest number =" + largestValue);

    }
}
