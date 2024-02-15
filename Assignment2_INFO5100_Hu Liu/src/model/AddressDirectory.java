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
public class AddressDirectory {
    
    ArrayList<Address> addressList;
    
   public AddressDirectory(){
        
        this.addressList = new ArrayList<Address>();
    
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void seteAddressList(ArrayList<Address> homeAddressList) {
        this.addressList = homeAddressList;
    }

    public Address addNewAddress(){
        Address newAddress = new Address();
        addressList.add(newAddress);
        return newAddress;
    } 
    
    public void deleteAddress(Address address){
        addressList.remove(address);
    
    
    }
 
}