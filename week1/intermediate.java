
package week1;

/**
 *
 * @author andre
 */
public class intermediate {
    public static void main(String[] args) {
        int qty = 10;
        double up = 37.77;
        String sname = "DALIAN MO";
        
        double tcost = qty * up;
        
        /* bawal po maging int because may decimal po ang value ng unitprice so
        kapag minultiply natin si unitprice and quantity is mag kakaroon talaga
        ng decimal
        */
        
     
        System.out.println("Store Name: " + sname);
        System.out.println("Unit Price; " + up);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + tcost);

        
        

    }
    
}
