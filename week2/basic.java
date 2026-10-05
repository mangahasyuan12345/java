
package week2;

/**
 *
 * @author andre
 */
public class basic {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 6;
        
        System.out.println(" Addition: " + (num1 + num2));
        System.out.println(" Subtraction: " + (num1 - num2));
        System.out.println(" Multiplication: " + (num1 * num2));
        System.out.println(" Division: " + (num1 / num2));
        System.out.println(" Modulus: " + (num1 % num2));
                
        /*
        ang / ay may behave different kapag negative operand dahil tinatanggal 
        nito ang decimal papunta sa zero since int ang gamit natin
        
        ang modulus din dahil kapag -25 ang unang number ay gagayahin nya
        ito at magiging -1 ang sagot
        */
    }
}
