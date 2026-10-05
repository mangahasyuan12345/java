
package week3;

/**
 *
 * @author andre
 */
public class intermediate {
    public static void main(String[] args) {
        double pa = 3000;
        double discount;
        double total;
        
        if (pa <= 1500){
            discount = 0;
        } else if (pa <= 3000){
            discount = 0.05;
        } else if (pa <= 4000){
            discount = 0.10;
        } else {
            discount = 0.15;
            
        }
        total = pa - (pa * discount);
        
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final discounted price: " + total);
        
    }
}
