
package week2;

/**
 *
 * @author andre
 */
public class advance {
    public static void main(String[] args) {
        int balance = 1000;
        balance += 100;
        System.out.println("Your step 1 balance: " + balance);
        balance += 150;
        System.out.println("Your step 2 balance: " + balance);
        balance *= 2;
        System.out.println("Your step 3 balance: " + balance);

        
      int count = 5;
        System.out.println(count++);
        System.out.println(count);
        /*
        kaya 5 at 6 ang output nito kasi po sa count++ ipprint muna niya ang 
        current value ng count bago ito mag add ng 1
        */
        
        count = 5;
        System.out.println(++count);
        System.out.println(count);
        /*
        dito naman sa ++count mag aadd ka muna ng 1 bago iprint. Yung 
        pangalawang sout na count naman ay ipprint na lang ang bagong value ng 
        count
        */
        
        
    }
    
}
