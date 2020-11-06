/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fotis
 */
public class Bank {
    private ArrayList<Client> clients;
    private ArrayList<Account> accounts;
    private Scanner input = new Scanner(System.in);

    
    public Bank(){
        clients = new ArrayList();
        accounts = new ArrayList();
    }
    
    public void addClient(Client client){
        clients.add(client);
    }
    
    public void addAccount(Account account){
        accounts.add(account);
    }
    
    public void showClients(){
        System.out.println("The clients of the bank areι:");
        for (Client client: clients){
            System.out.println(client.getId() + ". " + client.getName());
        }
    }
    
    public void createNewClient(){
        System.out.println("Input the new client's name");
        String name = input.next();
        
        Client client = new Client(name);
        clients.add(client);
        
        System.out.println("A new client was created with the ID number " + client.getId());
    }
    
    public void createNewAccount(int imera){
        showClients();
        Client client = null;
        int clientID;
          
        
        do{
            System.out.println("Input the ID number of the first owner of the bank account");
            clientID = input.nextInt();


            for (Client cl: clients){
                if (cl.getId() == clientID){
                    client = cl;
                    break;
                }                
            }
        } while (client == null);
        
        
        System.out.println("1. Simple savings bank account");
        System.out.println("2. Hyper savings bank account");
        System.out.println("3. Time limit bank account");
        System.out.print("Input the type of the new account: ");
        int accountType = input.nextInt();
        
        System.out.println("Input the deposit sum");
        float sum = input.nextFloat();
        
        input.nextLine();
        
        System.out.println("Input comments");
        String sxolio = input.nextLine();
        
        Transaction transaction = new Transaction(imera, client, sum, sxolio);
        
        if (accountType == 1){
            SimpleCreditAccount a = new SimpleCreditAccount(transaction);
            accounts.add(a);
            client.addAccount(a);
        }
        else if (accountType == 2){
            SuperCreditAccount b= new SuperCreditAccount(transaction);
            accounts.add(b);
            client.addAccount(b);
        }
        else {
            System.out.println("Input the time limit of the time limit bank account (3, 6, 9 or 12 months)");
            int mines = input.nextInt();
            
            float rate = 0.04f;
            rate += 0.001f * (mines-3)/3;
                        // int limit, double per, float rate
            ReserveAccount c = new ReserveAccount(transaction, mines * 30, (double)rate, rate);
            accounts.add(c);
            client.addAccount(c);
        }
        
        System.out.println("The bank account was created ");
    }
    
    
    public void manageAccount(){
        int accountID;
        Account account = null; 
        System.out.println("The bank accounts are:");
        for (Account a : accounts){
            System.out.println(" Bank account ID number: " + a.getAccountNumber() + "which is owned by:");
            a.showOwners();
        }
        System.out.println("Choose the bank account: ");
        accountID = input.nextInt();
        
        for (Account ac: accounts){
            if (ac.getAccountNumber() == accountID){
                account = ac;
                break;
            }
        }
        
        if (account == null){
            System.out.println("No bank account was found with this ID number");
            return;
        }
        
        showClients();
        System.out.println("Input the client's ID number that you wish to add as an owner to this bank account");
        int clientID = input.nextInt();
        
        if (account.isOwner(clientID) == true){
            System.out.println("This client is already an owner of this bank account");
            return;
        }
        
        for (Client owner: clients){
            if (owner.getId() == clientID) {
                account.addOwner(owner);
                System.out.println("The client was added as an owner of this bank account");
                return;
            }
        }
        
        System.out.println("No client with this ID numer was found");
        
    }
    
    public void connectAccounts(){
        System.out.println("The bank accounts are:");
        for (Account a : accounts){
            if (a instanceof SimpleCreditAccount){
                System.out.print(" Simple savings bank account with the ID number: ");
            }
            else if (a instanceof SuperCreditAccount){
                System.out.print(" Hyper savings account with the ID number: ");
            }
            else if (a instanceof ReserveAccount){
                System.out.print(" Time limit bank account with the ID number: ");
            }
            
            System.out.println(a.getAccountNumber() + " and the remaining total " + a.getBalance());
        }
        
        System.out.println("Input the bank's ID numbers that you wish to connect:");
        int accNum1 = input.nextInt();
        int accNum2 = input.nextInt();
        
        if (accNum1 == accNum2){
            System.out.println("A bank account cannot connect to itself");
            return;
        }
        
        ReserveAccount reserveAccount = null;
        CreditAccount creditAccount = null;
        
        for (Account a : accounts){
            if (a instanceof CreditAccount && (accNum1 == a.getAccountNumber() || accNum2 == a.getAccountNumber())){
                creditAccount = (CreditAccount)a;
            }            
            else if (a instanceof ReserveAccount && (accNum1 == a.getAccountNumber() || accNum2 == a.getAccountNumber())){
                reserveAccount = (ReserveAccount)a;
            }
        }
        
        if (reserveAccount == null || creditAccount == null){
            System.out.println("No bank account you inputed was found");
            return;
        }
        
        reserveAccount.connectAccount(creditAccount);
        System.out.println("The bank accounts were connected succesfully");
    }
}

