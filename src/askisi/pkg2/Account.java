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
        
public abstract class Account {
    private int accountNumber;
    private double balance;
    private double rate;
    private ArrayList<Client> owners;
    private ArrayList<Transaction> transactions;
    private static int f=1;
    
     public Account(Transaction transaction, float rate){
                owners = new ArrayList();
                transactions = new ArrayList();

                owners.add(transaction.getClient()) ;
                transactions.add(transaction);

                balance = transaction.getAmount();
                this.rate = rate;

                accountNumber = f++;

                
        }

    
    public void addOwner(Client client){
        
        owners.add(client);
        client.addAccount(this);
    }
    

    
    
    
    public void setclient(int x){
        
        
        
    
}
    
 public int getAccountNumber(){
     return accountNumber;
 }
    
      
    
    public void showOwners(){
        for (Client c : owners){
            System.out.println(" --> " + c.getId() + ". " + c.getName());
        }
    }
        
   
    public boolean isOwner(int oid){
        for (Client owner: owners){
            if (owner.getId() == oid) return true;
        }
        return false;
    }

    public double getBalance(){
        return balance;
    }
    
    public abstract void deposit(Transaction t) throws DepositException;
    public abstract void withdraw(Transaction t) throws WithdrawException;
    
}
 