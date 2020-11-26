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
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DoctorFrame extends JFrame {
    JButton button1,button2,button3,button4,button5;
    
    DoctorFrame(){
        setSize(500,500);
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Patient");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    button1 = new JButton("Add Doctor");
    button2 = new JButton("Update Doctor");
    button3 = new JButton("Search Doctor");
    button4 = new JButton("Delete Doctor");
    button5 = new JButton("View Doctors");
    MyActionListener a = new MyActionListener();
    
    button1.addActionListener(a);
    button2.addActionListener(a);
    button3.addActionListener(a);
    button4.addActionListener(a);
    button5.addActionListener(a);
     
    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);
    setVisible(true);
    }
    public class MyActionListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getActionCommand().equals("Add Doctor")){
            AddDoctorFrame d = new AddDoctorFrame();
            d.setVisible(true);
        }
        else if(ae.getActionCommand().equals("Update Doctor")){
            UpdateDoctorFrame u = new UpdateDoctorFrame();
            u.setVisible(true);
        }
        else if(ae.getActionCommand().equals("Search Doctor")){
            
            SearchByNameDoctorFrame s = new SearchByNameDoctorFrame();
            s.setVisible(true);
        }
        else if(ae.getActionCommand().equals("Delete Doctor")){
            DeleteDoctorFrame d= new DeleteDoctorFrame();
            d.setVisible(true);
        }
        else if(ae.getActionCommand().equals("View Doctors")){
            OperationsDoctor.displayAllData();
            
        }
    }
}
    }

