package hospitalmanagementsystem;

/**
 *
 * @author Ammar Ahmed
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientFrame extends JFrame{
    
    JButton button1,button2,button3,button4,button5;

PatientFrame(){
    setSize(500,500);
    setLayout(new GridLayout(3,2));
    setTitle("Patient");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    button1 = new JButton("Add Patient");
    button2 = new JButton("Update Patient");
    button3 = new JButton("Search Patient");
    button4 = new JButton("Delete Patient");
    button5 = new JButton("View Patients");
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
        
        if(ae.getActionCommand().equals("Add Patient")){
            AddPatientFrame p = new AddPatientFrame();
            p.setVisible(true);
        }
        else if(ae.getActionCommand().equals("Update Patient")){
            UpdatePatientFrame u = new UpdatePatientFrame();
            u.setVisible(true);
        }
        else if(ae.getActionCommand().equals("Search Patient")){
            
            SearchByNamePatientFrame s = new SearchByNamePatientFrame();
            s.setVisible(true);
        }
        else if(ae.getActionCommand().equals("Delete Patient")){
            DeletePatientFrame d= new DeletePatientFrame();
            d.setVisible(true);
        }
        else if(ae.getActionCommand().equals("View Patients")){
            OperationsPatient.displayAllData();
            
        }
    }
}
    }
