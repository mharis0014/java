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

public class PatientDoctorFrame extends JFrame implements Serializable {

    JButton button1 ,button2;
    JPanel panel1,panel2;
    PatientDoctorFrame(){
        setSize(500,500);
        setLayout(new BorderLayout());
        setTitle("Admin");
        
        button1 = new JButton("Doctors");
        button2 = new JButton("Patients");
        panel1 = new JPanel();
        panel2 = new JPanel();
        MyActionListener a = new MyActionListener();
        button1.addActionListener(a);
        button2.addActionListener(a);
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel1.add(button1);
        panel2.add(button2);
        add(panel1,BorderLayout.CENTER);
        add(panel2,BorderLayout.NORTH);
    }
    public class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
           if(ae.getActionCommand().equals("Doctors")){
               DoctorFrame d = new DoctorFrame();
               d.setVisible(true);
           }
           else if(ae.getActionCommand().equals("Patients")){
               PatientFrame p = new PatientFrame();
               p.setVisible(true);
           }
            
        }
    }
}
