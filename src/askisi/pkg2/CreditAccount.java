/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi.pkg2;

/**
 *
 * @author fotis
 */
import java.util.ArrayList;
public abstract class CreditAccount extends Account {
    private int withdraw;
    private double perCent;
    private int times;
    private int interestTime;
    private int inside;

    public CreditAccount(Transaction transaction, float rate){
        super(transaction, rate);
    }
public void addOwner(Transaction current){
    ArrayList<Client>owners = new ArrayList<Client>();
    owners.add(current.getClient());
    
    
}

public abstract void deposit(Transaction t) throws DepositException;
    public abstract void withdraw(Transaction t) throws WithdrawException;
    
//    public CreditAccount(int withdraw, double perCent, int times, int interestTime, int inside){
//        this.inside = inside;
//        this.interestTime = interestTime;
//        this.perCent = perCent;
//        this.withdraw = withdraw;
//        this.times = times;
//    }
}