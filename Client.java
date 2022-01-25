/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.talabat;

/**
 *
 * @author Manar Elbagoury
 */
public class Client extends User {

    private int mobileNumber;
    private String address;

    

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }
   
}
