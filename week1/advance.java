
package week1;

/**
 *
 * @author andre
 */
public class advance {
    public static void main(String[] args) {
        double cm = 155.55;
        int meters = (int) (cm / 100);
        double remainingcm = cm % 100;
        
        System.out.println("Centimeters: " + cm);
        System.out.println("Whole number: " + meters);
        System.out.println("Remaining centimeters: " + remainingcm);
        
        System.out.println("---------------------------------------");
        
        int number = 56;
        double widening = number; /* no cast needed po kasi automatic na po sya 
        and safe naman po iconvert sya into double
        */
        
        System.out.println("Implicit Widening: " + widening);
        
        double num = 56.66;
        int narrow = (int) num; /* kaya po nawala yung decimal is because cinonvert
        po natin si double into int
        */
        System.out.println("Explicit Narrowinf: " + narrow);
        
    }
}
