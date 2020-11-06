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
public class ReserveAccount extends Account {
    private int limit;
    private double per;
    private Account connectedAccount;
    


public ReserveAccount(Transaction transaction, int limit, double per, float rate){
    super(transaction, rate);
    this.limit = limit;
    this.per = per;
}

public void connectAccount(Account account){
    connectedAccount = account;
}

public  void deposit(Transaction t) throws DepositException{
    throw  new DepositException("You can't deposit to a time limit bank account");
}
    public  void withdraw(Transaction t) throws WithdrawException{
        throw  new WithdrawException("You can't withdraw from a time limit bank account");
    }
//public void addOwner(Transaction current){
//    ArrayList<Client>owners = new ArrayList<Client>();
//    owners.add(current.getClient());
//    
//    
//}
}