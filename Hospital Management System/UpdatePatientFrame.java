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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
public class UpdatePatientFrame extends JFrame implements Serializable {
    
    JButton button1;
    JTextField field1;
    JLabel label1;
    JPanel panel1,panel2;
UpdatePatientFrame(){
    setSize(500,500);
    setLayout(new BorderLayout());
    setTitle("Update Patient");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    panel1 = new JPanel();
    panel2 = new JPanel();
    panel1.setLayout(new FlowLayout());
    panel2.setLayout(new FlowLayout());
    button1 = new JButton("Update");
    
    label1 = new JLabel("Enter Patient Name");
    
    field1 = new JTextField(20);
    
    MyActionListener a = new MyActionListener();
    
    button1.addActionListener(a);
    field1.addActionListener(a);
    
    panel1.add(label1);
    panel1.add(field1);
    panel2.add(button1);
    
    add(panel1,BorderLayout.NORTH);
    add(panel2,BorderLayout.CENTER);
    
    setVisible(true);
    
    
}
public class MyActionListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getActionCommand().equals("Update")){
            ArrayList<Patient> PatientList = OperationsPatient.readAllData();
            for(int i=0; i<PatientList.size(); i++){
            if(PatientList.get(i).getFullName().equals(field1.getText())){    
            String s = (field1.getText().toString());
            OperationsPatient.deletePatient(s);
            AddPatientFrame a = new AddPatientFrame();
                    a.setVisible(true);            }
           
            else{
                System.out.println("Patient Not Found");
            }
            }
            }
        }
    }
}
