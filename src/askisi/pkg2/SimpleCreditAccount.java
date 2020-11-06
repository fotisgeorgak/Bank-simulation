/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi.pkg2;

import java.util.ArrayList;

/**
 *
 * @author fotis
 */
public class SimpleCreditAccount extends CreditAccount {
    private static final int maxWithdraw = -1000;

    
    
    public SimpleCreditAccount(Transaction transaction){
        super(transaction, (float)0.01);
        //this.maxWithdraw = maxWithdraw;
    }


public void createAccount(Transaction current){
        ArrayList<Client>owners = new ArrayList<Client>();
        owners.add(current.getClient());
    }

public  void deposit(Transaction t) throws DepositException{
    
}
    public  void withdraw(Transaction t) throws WithdrawException{
        
    }

//public void addOwner(Transaction current){
//    ArrayList<Client>owners = new ArrayList<Client>();
//    owners.add(current.getClient());
//    
//    
//}
}
