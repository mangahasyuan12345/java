
package week4;

/**
 *
 * @author andre
 */
import java.util.Scanner;
public class intermediate {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int total = 0;
        int num = 0;

        while (num != -1) {
           
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num != -1) {
                total += num;
            }
        }

        System.out.println("FINAL TOTAL: " + total);
    }
}
