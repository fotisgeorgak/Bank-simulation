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
public class Client {
    private String name;
    private int id;
    private ArrayList<Account> accounts;
    private static int g = 1;
    
    
    public Client(String name){
        this.name = name; 
        accounts=new ArrayList();        
        id = g++;              
    }
    
    public void addAccount(Account account){
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    
    
    
}

