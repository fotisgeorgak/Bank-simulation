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
public class WithdrawException extends Exception{
    public WithdrawException(){
        
    }
    
    public WithdrawException(String msg){
        super(msg);
    }
}
