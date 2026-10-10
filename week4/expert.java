
package week4;

/**
 *
 * @author andre
 */
import java.util.Scanner;
public class expert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] inventory = {
            {10, 10, 9}, 
            {10, 10, 6}, 
            {-1, 2, 10}};
        int row = 0; 
        int column = 0; 
        int choice = 0; 
        int total = 0;
        int amount = 0; 
        int low = 0;
                
                
         do {
            System.out.println("\n1. Total Inventory");
            System.out.println("2. Find Low Shelf");
            System.out.println("3. Restock");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                total = 0;

                for (row = 0; row < inventory.length; row++) {
                    for (column = 0; column < inventory[row].length; column++) {

                        if (inventory[row][column] == -1) { // basa if may -1
                            continue; // continuw
                        }

                        total = total + inventory[row][column];// add lahat maliban sa -1
                    }
                }

                System.out.println("Total Inventory: " + total);

            } else if (choice == 2) {

                search: //to find FIRST CRITICALLY
                for (row = 0; row < inventory.length; row++) {
                    for (column = 0; column < inventory[row].length; column++) {

                        if (inventory[row][column] != -1 &&
                            inventory[row][column] <= 5) {//if may mas mababa 

                            System.out.println("Low Shelf: Row "
                                    + (row) + ", Column " + (column));
                              
                            low = 1; //value goes 1 kapag may nahanap na lowshelf
                            break search;
                        }
                    }
                    
                }
                    if (low == 0){ // pag wla print no shelf
                        System.out.println("No ow shelf:");
                        
                    }   
                    
                    
            } else if (choice == 3) {

                restock(inventory, input);//  method

            } else if (choice == 4) {

                System.out.println("Thank you!<3");

            } else {

                System.out.println("Invalid choice.");
            }

        } while (choice != 4);// if d 4 ang pinili uulit lang ulit hanggang sa mag
                             // enter na si user ng ==4

        input.close();
    }

    static void restock(int[][] inventory, Scanner input) { // dto mapunta if pinili 3

        int row = 0;
        int column = 0;
        int amount = 0;

        System.out.print("Enter row: ");
        row = input.nextInt();

        System.out.print("Enter column: ");
        column = input.nextInt();

        if (row < 0 || row >= inventory.length || //<0 at >=2 
            column < 0 || column >= inventory[row].length || //<0 at >=2
            inventory[row][column] == -1) { // == -1 

            System.out.println("Invalid or damaged shelf."); //pag ung mga sinabe ko
                                                              //tinype is eto ung ipprint
            return;// stop the method tapos pili ulit si user ng number sa menu
        }

        while (amount <= 0) { //<0 ulit ulit lg hanggang mag >=1

            System.out.print("Enter restock amount: ");
            amount = input.nextInt();
        }

        inventory[row][column] = inventory[row][column] + amount;

        System.out.println("Restocked!");
    }
}