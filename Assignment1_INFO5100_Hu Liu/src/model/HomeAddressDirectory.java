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
public class HomeAddressDirectory {
    
    ArrayList<HomeAddress> homeAddressList;
    
    public HomeAddressDirectory(){
        
        this.homeAddressList = new ArrayList<HomeAddress>();
    
    }

    public ArrayList<HomeAddress> getHomeAddressList() {
        return homeAddressList;
    }

    public void setHomeAddressList(ArrayList<HomeAddress> homeAddressList) {
        this.homeAddressList = homeAddressList;
    }

    public HomeAddress addNewHomeAddress(){
        HomeAddress newHomeAddress = new HomeAddress();
        homeAddressList.add(newHomeAddress);
        return newHomeAddress;
    } 
    
    public void deleteHomeAddress(HomeAddress ha){
        homeAddressList.remove(ha);
    
    
    }
 
}
