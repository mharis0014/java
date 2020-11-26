/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.io.Serializable;

public class Address implements Serializable {

    private int home;
    private int street;
    private String city;
    private String state;
    private double contact;

    public Address(int h, int st, String c, String s, double cN){
        home = h;
        street = st;

        city = c;
        state = s;
        contact = cN;
    }

    public void setHome(int home) {
        this.home = home;
    }
    public void setStreet(int street) {
        this.street = street;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public int getHome() {
        return home;
    }

    public int getStreet() {
        return street;
    }


    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public double getContact() {
        return contact;
    }
}


