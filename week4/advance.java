
package week4;

/**
 *
 * @author andre
 */
import java.util.Scanner;
public class advance {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();

        for (int down = 1; down <= size; down++) { //outer

            if (down == 5) {
                continue; // kapag na reach na po ung 5 is iiskip nya lang
                // kaya pag input mo is 6 yung pang 5 is skip nya and then yung
                // pang 6 is ipprint nya bali ang output is 5
                
            }

            for (int side = 1; side <= size; side++) {//inner

                if (side == 5) {
                    break; // hhinto po yung inner loop sa pang 5 so magiging 
                    //apat lang po ang mapprint nya
                }

                System.out.print("*");/* additionaly, print lg po ang dineclare
                 kaya pagigilid po ang print nya hindi sa new line. 
              
                  */
            }
            

            System.out.println();
        }
    }
}   

