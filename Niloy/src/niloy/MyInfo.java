
package niloy;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyInfo extends JFrame{
    Container c;
    Font f, font;
    private JLabel label;
    private JButton backButton, myInfoButton, logoutButton;
    
    MyInfo(){
        myInfo();
    }
    public void myInfo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,400);
        this.setTitle("My Info");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        f = new Font("Arial",Font.BOLD,20);
        font = new Font("Arial",Font.BOLD + Font.ITALIC,28);
        
        label = new JLabel("Click  any Button");
        label.setFont(font);
        label.setBounds(120,20,250,50);
        c.add(label);
        
        backButton = new JButton("Back");
        backButton.setFont(f);
        backButton.setBounds(40,150,120,50);
        backButton.setBackground(Color.CYAN);
        c.add(backButton);
        
        myInfoButton = new JButton("MyInfo");
        myInfoButton.setFont(f);
        myInfoButton.setBounds(180,150,120,50);
        myInfoButton.setBackground(Color.CYAN);
        c.add(myInfoButton);
        
        logoutButton = new JButton("Logout");
        logoutButton.setFont(f);
        logoutButton.setBounds(320,150,120,50);
        logoutButton.setBackground(Color.CYAN);
        c.add(logoutButton);
        
       backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login log = new Login();
                log.setVisible(true);
            }
        });
       
       myInfoButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Manager m = new Manager();
                m.setVisible(true);
            }
        });
       
       logoutButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login log = new Login();
                log.setVisible(true);
            }
        });
        
        
    }
  
   /* public static void main(String[] args) {
        MyInfo info = new MyInfo();
        info.setVisible(true);
    }*/
}
