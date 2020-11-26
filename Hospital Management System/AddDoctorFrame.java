/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



/**
 *
 * @author Ammar Ahmed
 */
public class AddDoctorFrame extends JFrame {
    
     JLabel label1, label2, label3, label4, label5, label6, label7, label8;
    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11,field12, field13, field14;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9, panel10;
    JButton button1, button2;
    
    AddDoctorFrame(){
        
        setSize(1000, 230);
        setLayout(new GridLayout(5,2));  //Grid layout 1 row 8 col
        setTitle("Add Doctor");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(0));

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(0));

        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(0));

        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(0));

        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(0));

        panel6 = new JPanel();
        panel6.setLayout(new FlowLayout(0));

        panel7 = new JPanel();
        panel7.setLayout(new FlowLayout(0));

        panel8 = new JPanel();
        panel8.setLayout(new FlowLayout(0));

        panel9 = new JPanel();
        panel9.setLayout(new FlowLayout());

        panel10 = new JPanel();
        panel10.setLayout(new FlowLayout());

        label1 = new JLabel("Enter Full Name");
         label2 = new JLabel("Gender");
        label3 = new JLabel("Enter Age");
        label4 = new JLabel("Enter Address");
        label5 = new JLabel("Enter ID");
        label6 = new JLabel("Speciality");
        label7 = new JLabel("Department");
        label8 = new JLabel("Enter Joined Date");
        
        
        field1 = new JTextField(15);
        field2 = new JTextField(5);
        field3 = new JTextField(4);
        
        //tool tip
        field3.setToolTipText("Years");
        
        field4 = new JTextField(5);
        field5 = new JTextField(5);
        field6 = new JTextField(5);
        field7 = new JTextField(5);
        field8 = new JTextField(5);
        
        //tooltip
        field4.setToolTipText("Enter House No");
        field5.setToolTipText("Enter Street No");
        field6.setToolTipText("Enter City");
        field7.setToolTipText("Enter State");
        field8.setToolTipText("Contact");
        field9 = new JTextField(4);
       
      
        field10 = new JTextField(15);
        field11 = new JTextField(15);
        field12 = new JTextField(4);
        field13 = new JTextField(4);
        field14 = new JTextField(4);
        
        //tool tip
        field12.setToolTipText("Enter Date");
        field13.setToolTipText("Enter Month");
        field14.setToolTipText("Enter Year");
        
        button1 = new JButton("ADD");
        button2 = new JButton("Cancel");

        

        MyActionListener a = new MyActionListener();
        field1.addActionListener(a);
        field2.addActionListener(a);
        field3.addActionListener(a);
        field4.addActionListener(a);
        field5.addActionListener(a);
        field6.addActionListener(a);
        field7.addActionListener(a);
        field8.addActionListener(a);
        field9.addActionListener(a);
        field10.addActionListener(a);
        field11.addActionListener(a);
        field2.addActionListener(a);
        field13.addActionListener(a);
        field14.addActionListener(a);
      
        button1.addActionListener(a);
        button2.addActionListener(a);

        //Name
        panel1.add(label1);
        panel1.add(field1);
        //Gender
        panel2.add(label2);
        panel2.add(field2);
        //Age
        panel3.add(label3);
        panel3.add(field3);
       
        //Adress
        panel4.add(label4);
        panel4.add(field4);
        panel4.add(field5);
        panel4.add(field6);
        panel4.add(field7);
        panel4.add(field8);
        // ID
        panel5.add(label5);
        panel5.add(field9);

        //speciality
        panel8.add(label6);
        panel8.add(field10);
        //department
        panel6.add(label7);
        panel6.add(field11);
        
        //Enter Date
        panel7.add(label8);
        panel7.add(field12);
        panel7.add(field13);
        panel7.add(field14);
        
 
        panel9.add(button1);
        panel10.add(button2);

        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        add(panel7);
        add(panel8);
        add(panel9);
        add(panel10);

        setVisible(true);
    }
        
        public class MyActionListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent ae){
                if(ae.getActionCommand().equals("ADD")){
                String fullName = field1.getText();
                String gender = field2.getText();
                int age = Integer.parseInt(field3.getText());
                
                int houseNo = Integer.parseInt(field4.getText());
                int streetNo = Integer.parseInt(field5.getText());
                
                String city = field6.getText();
                String state = field7.getText();
                double contact = Double.parseDouble(field8.getText());
                
                int ID = Integer.parseInt(field9.getText());
                String speciality = field10.getText();
                
                String department = field11.getText();
                
                int day = Integer.parseInt(field12.getText());
                int month = Integer.parseInt(field13.getText());
                int year = Integer.parseInt(field14.getText());
                
                Date date = new Date(day,month,year);
                
                Address add = new Address(houseNo,streetNo,city,state,contact);
                Doctor doctor = new Doctor(fullName,gender,age,add,ID,speciality,department,date);
                OperationsDoctor.addDoctors(doctor);
                
                
                }
                
                else if(ae.getActionCommand().equals("Cancel")){
                    System.exit(0);
                }
                
                
                }
            
            
        }
    }
    
    

