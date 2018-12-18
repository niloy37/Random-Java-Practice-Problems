import java.awt.font.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;




public class MyFrame extends JFrame implements ActionListener{

    //instance variables
    private JLabel label,firstname,lastname,phonenumber,CGPA;
    private JTable table;
    private JButton add,update,clear,exit;
    private JTextField text,text2,text3,text4;
    private JPasswordField pass;
    private JScrollPane scroll;
    private Container c;
    private Font f,font;






    MyFrame() {
        super("Student Form Registration");
        GUI();

    }

    public void GUI() {



        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,800);
        this.setVisible(true);


        //container

        c= this.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);


        //layout
        c.setLayout(null);

        //font
        f = new Font("Ariel",Font.BOLD,18);
        font = new Font("Moncao",Font.BOLD,18);


        //Label

        label = new JLabel("Student Registration");
        label.setFont(f);
        label.setBounds(170,-10,250,50);
        c.add(label);
        label.setToolTipText("Title : Student Registration Form");

        //firstname
        firstname = new JLabel("First Name :");
        firstname.setToolTipText("Enter first name");
        firstname.setBounds(20, 90, 120, 30);
        c.add(firstname);



        //textfield1

        text = new JTextField();
        text.setBounds(150,90,120,30);
        c.add(text);



        //lastname

        lastname = new JLabel("Enter Last Name: ");
        lastname.setToolTipText("Enter last name");
        lastname.setBounds(20,140,120,30);
        c.add(lastname);


        //text2
        text2 = new JTextField();
        text.setBounds(150,140,120,30);
        c.add(text2);




        //label phonenumber
        phonenumber = new JLabel("Phone Number : ");
        phonenumber.setToolTipText("Enter Phone number");
        phonenumber.setBounds(20,190,120,30);
        c.add(phonenumber);

        //text3
        text3 = new JTextField();
        text3.setBounds(150,190,120,30);
        c.add(text3);


        //CGPA
        CGPA = new JLabel("CGPA :");
        CGPA.setToolTipText("Enter CGPA :");
        CGPA.setBounds(20,240,120,30);
        c.add(CGPA);


        //text4
        text4 = new JTextField();
        text4.setBounds(150,240,120,30);
        c.add(text4);




        //buttons
        add = new JButton("Add");
        add.setBounds(320,90,100,25);
        c.add(add);

        //update
        update = new JButton("Update");
        update.setBounds(320,140,100,25);
        c.add(update);

        //clear
        clear = new JButton("Clear");
        clear.setBounds(320,190,100,25);
        c.add(clear);

        //exit
        exit = new JButton("Exit");
        exit.setBounds(320,240,100,25);
        c.add(exit);
        exit.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit){
            dispose();
        }
        if(e.getSource() == )

    }

    public static void main(String[] args) {
        //Type your code here,havoccboi..
        MyFrame mf = new MyFrame();


    }

}
