/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HU
 */
public class BankAccountDirectory {
    
    ArrayList<BankAccount> bankAccountList;
    
    public BankAccountDirectory(){
        
        this.bankAccountList = new ArrayList<BankAccount>();
    
    
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(ArrayList<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public BankAccount addNewBankAccount(){
        BankAccount newBankAccount = new BankAccount();
        bankAccountList.add(newBankAccount);
        return newBankAccount;
    } 
    
    public void deleteHomeAddress(BankAccount ba){
        bankAccountList.remove(ba);
    
    
    }
    
    
      
    
}
