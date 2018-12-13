/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811601642niloy;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author havoccboi
 */
public class MyFrame extends JFrame{
    private JLabel item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField password;
    MyFrame(){
        super("Log in Screen");
        setLayout(new FlowLayout());
        item1= new JLabel("Enter you user id");
        item1.setToolTipText("User ID");
        add(item1);
       //  item3 = new JTextField("Enter user id");
       // add(item3);
        item2 = new JTextField(10);
        add(item2);
       
        password = new JPasswordField("1234");
        add(password);
        TheHandle handle = new TheHandle();
        item2.addActionListener(handle);
        password.addActionListener(handle);
    }
    public class TheHandle implements ActionListener{
      public void  actionPerformed(ActionEvent event){
          String str= "";
          if(event.getSource()== item2){
              str = String.format("Item 1 is  : %s",event.getActionCommand());
          }
          else if(event.getSource() == password) {
              str= String.format("Item2 is : %s", event.getActionCommand());
          }
          JOptionPane.showMessageDialog(null,str);
      }
    }
}
