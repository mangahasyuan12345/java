
package week3;

/**
 *
 * @author andre
 */
public class expert {
    public static void main(String[] args) {
        String username = "Yuan";
        String pin = "1234";
        double balance = 100000.75;
        double withdraw = 40000.55;
        double dailylimit;
        String tier;
        double feepercentage;
        double fee;
        double total;
        double remaining;
        
                
        
        if (username.equals("Yuan")){
        if (pin.equals("1234")) {
            System.out.println("Login Successful");
            
        
        if (balance <= 20000){
            tier = "Bronze";
            System.out.println("Your tier: Bronze"); 
        } else if (balance <=50000){
            tier = "Silver";
            System.out.println("Your tier: Silver");
        } else if (balance <=80000){
            tier = "Gold";
            System.out.println("Your tier: Gold");
        } else {
            tier = "Platinum";
            System.out.println(" Your tier: Platinum");
        }
        
        
        if (tier.equals("Bronze")){
            dailylimit = 10000;
        } else if (tier.equals("Silver")){
            dailylimit = 25000;
        } else if (tier.equals("Gold")){
            dailylimit = 50000;
        } else { 
            dailylimit = 75000;         
        }
        
        
        System.out.println("Your daily limit is: " + dailylimit);
            
            
        switch (tier){
            case "Bronze":
                feepercentage = 0.02;
                break;
            case "Silver":
                feepercentage = 0.015;
                break;
            case "Platinum":
                feepercentage = 0.01;
                break;
            default:
                feepercentage = 0.005;
        }
        
        
             fee = withdraw * feepercentage;
             total = withdraw + fee;
             remaining = balance - total; 
             
           
        if (withdraw <= balance){      
        if(withdraw <= dailylimit){
            System.out.println("APPROVE");
            System.out.println("Balance: " + balance);
            System.out.println("Withdrawal: " + withdraw);
            System.out.printf("Transaction Fee: %.2f%n", fee);
            System.out.printf("Total: %.2f%n", total);
            System.out.printf("Remaining Balance: %.2f%n", remaining);
        }else {
                System.out.println("DENIED: Withdrawal exceeds the daily limit.");
            }
        
        } else {
            System.out.println("DENIED: Insufficient balance.");
        }
        
       
        } else { 
            System.out.println("Login Failed: Incorrect Pin");
        }
        } else {
            System.out.println("Login Failed: Incorrect username");
         }  
        

        }
    
}

