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
public class Restaurant {
    private String name;
    private String address;
    private String category;
    private double delivery_fees;
    private int working_hours;
    private Meal menu[];
    private Order orders[];
    private int counter = 0;

    public Restaurant(){}

    public Restaurant (String name,String address,String category,double delivery_fees,int working_hours) {
        this.name = name;
        this.address = address;
        this.category = category;
        this.delivery_fees = delivery_fees;
        this.working_hours = working_hours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDelivery_fees() {
        return delivery_fees;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }

    public void setDelivery_fees(double delivery_fees) {
        this.delivery_fees = delivery_fees;
    }

    public Meal[] getMenu() {
        return menu;
    }

    public void setMenu(Meal[] menu) {
        this.menu = menu;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public void display_info(){
        System.out.println("Restaurant name: " + getName());
        System.out.println("Restaurant address: " + getAddress());
        System.out.println("Food category: " + getCategory());
        System.out.println("Delivery fees: " + getDelivery_fees());
        System.out.println("Working hours: " + getWorking_hours());
    }

    public void getOrderedMeal() {
    }

}
