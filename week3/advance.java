
package week3;

/**
 *
 * @author andre
 */
public class advance {
    public static void main(String[] args) {
        String username = "Yuan";
        String password = "123";
        int attempt = 4;
        
        if (username.equals ("Yuan")){
        if (password.equals ("123")) {
           
       if (attempt <= 3 ) {
            System.out.println("Login successful");
        }else {
            System.out.println("Login Failed: Too many attempts. Please Try "
                    + "Again Later");
        }
        }else {
            System.out.println("Login Failed: Incorrect Password");
        }
        } else {
            System.out.println("Login Failed: Incorrect Username");
        }
        
        
            
        
    }
        
}
