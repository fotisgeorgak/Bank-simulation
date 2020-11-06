/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi.pkg2;

import java.util.Scanner;

/**
 *
 * @author fotis
 */
public class Askisi2 {
    private static Scanner input = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        int meres, c;
        
        System.out.println("Input the simulation days number");
        meres = input.nextInt();
        
        for (int imera = 1 ; imera <= meres ; imera++){
            System.out.println("New day start " + imera);
            do{
                System.out.println("1. Client creation ");
                System.out.println("2. New Bank account creation ");
                System.out.println("3. Management of the bank account's owners ");
                System.out.println("4. Deposit ");
                System.out.println("5. Withdraw ");
                System.out.println("6. Connect saving's bank account to time limit bank account ");
                System.out.println("7. Termination of the bank account ");
                //System.out.println("8.  ");
                System.out.println("9. End of the day");
                System.out.print("Choose: ");
                c = input.nextInt();
                
                if (c == 1) bank.createNewClient();
                else if (c == 2) bank.createNewAccount(imera);
                else if (c == 3) bank.manageAccount();
                else if (c == 6) bank.connectAccounts();
            }while (c != 9);
        }
        
        
    }
    
}
