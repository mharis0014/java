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

public class DeletePatientFrame extends JFrame implements Serializable {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



    JLabel label1;
    JTextField field1;
    JButton button1;
    JPanel panel1,panel2;
    
    DeletePatientFrame(){
        setSize(500,500);
        setTitle("Delete");
        setLayout(new BorderLayout() );
        label1 = new JLabel("Eneter the Name");
        field1 = new JTextField(10);
        button1 = new JButton("Delete");
        MyActionListener a = new MyActionListener();
        button1.addActionListener(a);
        field1.addActionListener(a);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel1.add(label1);
        panel1.add(field1);
        
        panel2.add(button1);
 
        add(panel1,BorderLayout.NORTH);
        add(panel2,BorderLayout.CENTER);
        setVisible(true);
    }
    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
          String  fullName = field1.getText();
          String s = OperationsPatient.deletePatient(fullName);
               System.out.println(s);
            }
            
        }
    }



