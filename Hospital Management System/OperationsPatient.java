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

import java.util.*;

public class OperationsPatient implements Serializable{
    
    
    
    
    public static void addPatients(Patient s){
              ObjectOutputStream outputStream = null;
try{ 
       ArrayList<Patient> PatientList = readAllData();
       
       PatientList.add(s);
        
        outputStream = new ObjectOutputStream(new FileOutputStream("Patient.txt"));
        System.out.println("File Opened");

// Write all objects (old and new one) into the file
        for(int i = 0 ; i<PatientList.size() ; i++)
 {
	outputStream.writeObject(PatientList.get(i));
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
    

    
    
    public static ArrayList<Patient> readAllData(){
        ArrayList<Patient>PatientList = new ArrayList<Patient>();
        ObjectInputStream inputStream = null;
       try{
        inputStream = new ObjectInputStream(new FileInputStream("Patient.txt"));
        boolean EOF = false;
        while(!EOF){
            try{
                Patient myObject = (Patient)inputStream.readObject();
                PatientList.add(myObject);
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
        return PatientList;
}

    
    public static Patient searchByName(String name){
        ArrayList<Patient> PatientList = readAllData();
        for(int i = 0; i<PatientList.size(); i++){
            if(PatientList.get(i).getFullName().equalsIgnoreCase(name))
                return PatientList.get(i);
            
       
        }
        return null;
    }
    
    
    
    
    public static String deletePatient(String fullName){
        
         ArrayList<Patient> PatientList = readAllData();
          ObjectOutputStream outputStream = null;
          Patient a=null;
            for(int i = 0 ; i < PatientList.size(); i++) {
                a = PatientList.get(i);
                if (a.getFullName().equalsIgnoreCase(fullName)) {
                    PatientList.remove(a);
                 //   return "Record Deleted Successfully";
                }
                else{
                    return "No Patient Found";
                }
            
    }
            
                 for(int i = 0 ; i<PatientList.size() ; i++)
 {
     try{
         outputStream = new ObjectOutputStream(new FileOutputStream("Patient.txt"));
	outputStream.writeObject(PatientList.get(i));
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
            
       return "Record Deleted Successfully";
    }
    
    
    
    
    public static String updateByName (String fullName){
        ArrayList<Patient> PatientList = readAllData();
         
        Patient a = null;
        for(int i = 0 ; i < PatientList.size(); i++){
            a = PatientList.get(i);
            if(a.getFullName().equalsIgnoreCase(fullName)){
             PatientList.remove(a);
            }
        }

 
       return null;
             
    }
   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void displayAllData(){
        ArrayList<Patient> PatientList = readAllData();
        for(int i=0; i<PatientList.size();i++)
           PatientList.get(i).display();
    }
    
    }

