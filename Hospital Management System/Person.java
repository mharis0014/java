/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.io.Serializable;

public class Person implements Serializable {
    private String fullName;
    private String gender;
    private int age;
    private Address address;

    
    
  
    
    
    
    Person(String fN, String g, int aG,Address aD ){
        fullName = fN;
        
        gender = g;
        age = aG;
        address = aD;
        
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public String getFullName() {
        return fullName;
    }
    
    public String getGender() {
        return gender;
    }
    public int getAge(){
        return age;
    }
    public Address getAddress() {
        return address;
    }
   
}
