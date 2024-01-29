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
public class LocalAddressDirectory {
    
    ArrayList<LocalAddress> localAddressList;
    
    public LocalAddressDirectory(){
        
        this.localAddressList = new ArrayList<LocalAddress>();
    
    }

    public ArrayList<LocalAddress> getLocalAddressList() {
        return localAddressList;
    }

    public void setLocalAddressList(ArrayList<LocalAddress> localAddressList) {
        this.localAddressList = localAddressList;
    }

    public LocalAddress addNewLocalAddress(){
        LocalAddress newLocalAddress = new LocalAddress();
        localAddressList.add(newLocalAddress);
        return newLocalAddress;
    } 
    
    public void deleteLocalAddress(LocalAddress la){
        localAddressList.remove(la);
    
    
    }
 
}
