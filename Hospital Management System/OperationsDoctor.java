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

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class OperationsDoctor implements Serializable{
    
    
    
    
    public static void addDoctors(Doctor d){
              ObjectOutputStream outputStream = null;
try{ 
       ArrayList<Doctor> DoctorList = readAllData();
       
       DoctorList.add(d);
        
        outputStream = new ObjectOutputStream(new FileOutputStream("Doctor.txt"));
        System.out.println("File Opened");

// Write all objects (old and new one) into the file
        for(int i = 0 ; i<DoctorList.size() ; i++)
 {
	outputStream.writeObject(DoctorList.get(i));
}

}

     catch(IOException exp)
 {
        
System.out.println("IO Exception while opening file");
}

 finally { 
// cleanup code which closes output stream if its object was created
try {
	if(outputStream != null) {
		outputStream.close();
		// flag of success
		
	}

} catch (IOException exp)
{
       
	System.out.println("IO Exception while closing file");
}

   
    }
    
    }
    

    
    
    public static ArrayList<Doctor> readAllData(){
        ArrayList<Doctor>DoctorList = new ArrayList<Doctor>();
        ObjectInputStream inputStream = null;
       try{
        inputStream = new ObjectInputStream(new FileInputStream("Doctor.txt"));
        boolean EOF = false;
        while(!EOF){
            try{
                Doctor myObject = (Doctor)inputStream.readObject();
                DoctorList.add(myObject);
            }
        
        catch (ClassNotFoundException e) {
//System.out.println("Class not found");
} 
        catch (EOFException end) {
// EOFException is raised when file ends
// set End Of File flag to true so that loop exits
            EOF = true;
        }

        }
       }
        catch(FileNotFoundException e) {
//System.out.println("Cannot find file");
        } 
       catch (IOException e) {
        System.out.println("IO Exception while opening stream");
        e.printStackTrace();
    } 
       finally { // cleanup code to close stream if it was opened
        try {
            if(inputStream != null)
                inputStream.close( );
                } catch (IOException e) {
// TODO Auto-generated catch block
        System.out.println("IO Exception while closing file");
}
}
// returns ArrayList
        return DoctorList;
}

    
    public static Doctor searchByName(String name){
        ArrayList<Doctor> DoctorList = readAllData();
        for(int i = 0; i<DoctorList.size(); i++){
            if(DoctorList.get(i).getFullName().equalsIgnoreCase(name)){
                return DoctorList.get(i);
            }
            
            
        }
        return null;
    }
    
    
    
    
    public static String deleteDoctor(String fullName){
        
         ArrayList<Doctor> DoctorList = readAllData();
          ObjectOutputStream outputStream = null;
          Doctor a = null;
            for(int i = 0 ; i < DoctorList.size(); i++) {
                a = DoctorList.get(i);
                if (a.getFullName().equalsIgnoreCase(fullName)) {
                    DoctorList.remove(a);
                    
                }
           
    }
            
                 for(int i = 0 ; i<DoctorList.size() ; i++)
 {
     try{
         outputStream = new ObjectOutputStream(new FileOutputStream("Doctor.txt"));
	outputStream.writeObject(DoctorList.get(i));
}



     catch(IOException exp)
 {
System.out.println("IO Exception while opening file");
}

 finally { 
// cleanup code which closes output stream if its object was created
try {
	if(outputStream != null) {
		outputStream.close();
		// flag of success
		
	}

} catch (IOException exp)
{
	System.out.println("IO Exception while closing file");
}

   
    }
 }
      return "Record Deleted Successfully ";
    }
    
    
    
    
    public static String updateByName (String fullName){
        ArrayList<Doctor> DoctorList = readAllData();
         
        Doctor a = null;
        for(int i = 0 ; i < DoctorList.size(); i++){
            a = DoctorList.get(i);
            if(a.getFullName().equalsIgnoreCase(fullName)){
             DoctorList.remove(a);
            }
        }

 
       return null;
             
    }
   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void displayAllData(){
        ArrayList<Doctor> DoctorList = readAllData();
        for(int i=0; i<DoctorList.size();i++)
           DoctorList.get(i).display();
    }
    
    }



