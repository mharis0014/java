/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author Ammar Ahmed
 */
public class Doctor extends Person {

    protected int doctorID;
    protected String speciality;
    protected String department;
    protected Date joinedDate;

    Doctor(String fN,String g,int aG,Address aD,int dID,String sP,String dP,Date d){
        super(fN,g,aG,aD);
        doctorID = dID;
        speciality = sP;
        department = dP;
        joinedDate = d;
        
    }
    
    public void setDoctorID(int id){
        doctorID = id;
    }
    public void setSpeciality(String sP){
        speciality = sP;
    }
    public void setDepartment(String dP){
        department = dP;
    }
    public void setJoinedDate(Date d){
        joinedDate = d;
    }
    public int getDoctorID(){
        return doctorID;
    }
    public String getSpeciality(){
        return speciality;
    }
    public String getDepartment(){
        return department;
    }
    public Date getJoinedDate(){
        return joinedDate;
    }
    
    public void display(){
        
        System.out.println("Full Name\t   Gender\t   Age\t   Home No\t   Street No\t   City\t   State\t   Contact");
        System.out.println("\n"+super.getFullName()+"\t"+super.getGender()+"\t"+super.getAge()+"\t"
                +super.getAddress().getHome()+"-"+super.getAddress().getStreet()+"-"+super.getAddress().getCity()+"-"+super.getAddress().getState()+"-"+super.getAddress().getContact());
        System.out.println("\nID\t Speciality\t Department\t Joining Date");
        System.out.println("\n"+getDoctorID()+"\t "+getSpeciality()+"\t "+getDepartment()+"\t "+getJoinedDate().getDay()+"-"+getJoinedDate().getMonth()+"-"+getJoinedDate().getYear());
        
    }
    
}

