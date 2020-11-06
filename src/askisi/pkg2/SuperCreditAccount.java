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
public class SuperCreditAccount extends CreditAccount{
    private final static int maxWithDrawNumber = 3;


    
    public SuperCreditAccount(Transaction transaction){
        super(transaction, 0.02f);
    }
    
    public  void deposit(Transaction t) throws DepositException{
    
}
    public  void withdraw(Transaction t) throws WithdrawException{
        
    }

//    public void addOwner(Transaction current){
//        ArrayList<Client>owners = new ArrayList<Client>();
//        owners.add(current.getClient());
//
//
//    }
}