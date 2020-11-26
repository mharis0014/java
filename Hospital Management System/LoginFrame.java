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
public class LoginFrame extends JFrame implements Serializable {



    JButton login;
    JLabel UserName, password;
    JTextField usernameTf;
    JPasswordField passwordField;
    JPanel panel1, panel2, panel3;
    //ImageIcon window1; JLabel win1Label;

    LoginFrame() {
        setTitle("Login Frame");
        setSize(500, 300);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //window1 = new ImageIcon("C:\\Users\\kaka\\Downloads\\Wallpapers\\sunset.jpg");
        //setContentPane(new JLabel(window1));
        //win1Label = new JLabel(window1);

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());

        UserName = new JLabel("UserName");
        password = new JLabel("Password");
        usernameTf = new JTextField(20);
        passwordField = new JPasswordField(20);
        login = new JButton("login");

        panel1.add(login);
        panel3.add(UserName);
        panel3.add(usernameTf);
        panel2.add(password);
        panel2.add(passwordField);
        add(panel1,BorderLayout.SOUTH);
        add(panel2,BorderLayout.CENTER);
        add(panel3,BorderLayout.NORTH);

        //add(win1Label);

         MyActionListener a = new MyActionListener();
        usernameTf.addActionListener(a);
        passwordField.addActionListener(a);
        login.addActionListener(a);


        setVisible(true);
    }
    public class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String pass =  String.valueOf(passwordField.getPassword());
            if (e.getActionCommand().equals("login")) {
                if ((usernameTf.getText().equals("Admin")) && (pass.equals("12345"))) {
                    PatientDoctorFrame f = new PatientDoctorFrame();
                    f.setVisible(true);
                }
                /*else if ((usernameTf.getText().equals("")) && (passwordField.equals(""))) {
                    JOptionPane.showMessageDialog(new JFrame(), "Please enter username and password");
                } */ else
                    JOptionPane.showMessageDialog(new JFrame(), "incorrect username or password");
                }
            }
        }
        
    }



