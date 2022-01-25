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
public class Order {
    private int quantity;
    private int orderId;
    private int customerId;
    private String notes;
    private String orderDate;    // momken nstkhdm function sysdate (database) ...w negyb date w el time bta3 el order
    private Meal orderedMeal;
    private String customerAddress;
    private String customerName;
    static int counter = 0;

    public Order(){}
    
    public Order(int quantity, String notes){
        this.quantity = quantity;
        this.notes = notes;
        
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Meal getOrderedMeal() {
        return orderedMeal;
    }

    public void setOrderedMeal(Meal orderedMeal) {
        this.orderedMeal = orderedMeal;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public void displayOrder(){
        System.out.println("Customer Name :"+getCustomerName());
        System.out.println("Customer address :"+getCustomerAddress());
        System.out.println("Customer Id :"+getCustomerId());
        System.out.println("Order Id :"+getOrderId());
        System.out.println("Order Meals :"+getOrderedMeal());
        System.out.println("Order Quantity :"+getQuantity());
        System.out.println("Order time and date: "+getOrderDate());
        System.out.println("Additional Notes: "+ getNotes());
    }
}
