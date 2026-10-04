
package week1;

/**
 *
 * @author andre
 */
public class expert {
    public static void main(String[] args) {
        byte num = 127;
        num++;
        System.out.println("Result: " + num);
        
        String s1 = new String("Yuan");
        String s2 = new String("Yuan");
        String s3 = "Yuan";
        
        System.out.println("\ns1 == s2: " + (s1 == s2));
        /*false po dahil different string sila created using new pero kapag yung string is 
        created using literal kapag cinompare mo sya using == ay magiging true
        ang output
        */
        System.out.println("s1.euals(s2): " + s1.equals(s2));
        /*true po ang output dahil yung .equals po is cinocompare yung actual 
        text na nakalagay
        */
        
        System.out.println("\ns1 == s3: " + (s1 == s3));
        /*false po dahil different string sila created using new pero kapag yung string is 
        created using literal kapag cinompare mo sya using == ay magiging true
        ang output
        */
        System.out.println("s.equals(s3): " + s1.equals(s3));
        /*true po ang output dahil yung .equals po is cinocompare yung actual 
        text na nakalagay
        */
        
        System.out.println("\ns2 == s3: " + (s2 == s3));
        /*false po dahil different string sila created using new pero kapag yung string is 
        created using literal kapag cinompare mo sya using == ay magiging true
        ang output
        */
        System.out.println("s2.equals(s3): " + s2.equals(s3));
        /*true po ang output dahil yung .equals po is cinocompare yung actual 
        text na nakalagay
        */
        
        
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        
        arr2[0] = 55;
        
        System.out.println("\narr1[0]: " + arr1[0]);
        System.out.println("arr2[0]: " + arr2[0]);

    }
    
}
