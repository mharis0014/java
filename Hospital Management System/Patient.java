/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.io.Serializable;

public class Patient extends Person implements Serializable{

    protected int ID;
    protected int wardNo;
    protected String disease;
    protected Date admissionDate;


    public Patient(String fN, String g,int aG,Address aD,int id,int wN,String dS,Date adD){
        super(fN,g,aG,aD);
        ID=id;
        wardNo = wN;
        disease = dS;
        admissionDate = adD;
       
        
    }
    
    public void setID(int id){
        ID = id;
    }
    public void setWardNo(int wN){
        wardNo = wN;
    }
    public void setDisease(String d){
        disease = d;
    }
    public void setAdmissionDate(Date aD){
        admissionDate = aD; 
    }
    public int getID(){
        return ID;
    }
    public int getWardNo(){
        return wardNo;
    }
    public String getDisease(){
        return disease;
    }
    public Date getAdmissionDate(){
        return admissionDate;
    }
    
    public void display(){
       // System.out.println("Full Name  Gender\t    Age\t  Home No\t Street No\t City\t  State\t Contact");
        //System.out.println("\n"+super.getFullName()+"\t    "+super.getGender()+"\t   "+super.getAge()+"\t    "
          //      +super.getAddress().getHome()+"\t           "+super.getAddress().getStreet()+"\t     "+super.getAddress().getCity()+"\t     "+super.getAddress().getState()+"\t  "+super.getAddress().getContact());
        //System.out.println("\nID\t Ward No\tDisease\t Admission Date");
       // System.out.println("\n"+getID()+"\t  "+getWardNo()+"\t       "+getDisease()+"\t       "+getAdmissionDate().getDay()+"/"+getAdmissionDate().getMonth()+"/"+getAdmissionDate().getYear());
  
        System.out.printf("\n%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-15s\t%-15s","Full Name","Gender","Age","House No","Street No","City","State","Contact");
        
        System.out.printf("\n%-15s\t%-15s\t%-15d\t%-15d\t%-15d\t%-15s\t%-15s\t%-15f",super.getFullName(),super.getGender(),super.getAge(),getAddress().getHome(),super.getAddress().getStreet(),super.getAddress().getCity(),super.getAddress().getState(),super.getAddress().getContact());
        
        System.out.printf("\n%-15s\t%-15s\t%-15s\t%-15s","ID","Ward No","Disease","Admission Date");
        System.out.printf("\n%-15d\t%-15d\t%-15s\t%-1d\t%-1d\t%-1d",getID(),getWardNo(),getDisease(),getAdmissionDate().getDay(),getAdmissionDate().getMonth(),getAdmissionDate().getYear());
        
        }
}


















