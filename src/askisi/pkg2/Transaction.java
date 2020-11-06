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
public class Transaction {
    private int date;
    private Client client;
    private double amount;
    private String description;
    //private Account account;
   


public Transaction(int date, Client client, double amount, String description/*, Account account*/){
    this.date = date;
    this.client = client;
    this.amount = amount;
    this.description = description;
    //this.account = account;
}
public Client getClient(){
    return client;
}
public void setCient(Client x){
    client =x;
}
public double getAmount(){
    return amount;
}
public void setAmount(double x){
    amount=x;
}
public int getDate(){
    return date;
}
public void setDate(int x){
    date=x;
}
/*
public Account getAccount(){
    return account;
}
public void setAccount(Account x){
    account=x;
}
*/
}