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

public class SearchByNameDoctorFrame extends JFrame implements Serializable {
    

    JLabel label1;
    JTextField field1;
    JButton button1;
    JPanel panel1,panel2;
    
    SearchByNameDoctorFrame(){
        setSize(500,500);
        setTitle("Search");
        setLayout(new BorderLayout() );
        label1 = new JLabel("Eneter the Name");
        field1 = new JTextField(10);
        button1 = new JButton("Search");
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
         Doctor d =  OperationsDoctor.searchByName(fullName);
           if(d!= null)
               d.display();
           else
                System.out.println("Doctor Not Found");
                
            }
            
        }
}
