
package niloy;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class NewPassword extends JFrame implements ActionListener{
    Container c;
    Font f, font;
    private JLabel label, label1, label2, label3;
    private JPasswordField pf1,pf2,pf3;
    private JButton submitButton, clearButton;
    NewPassword(){
     newPassword();
    }
    public void newPassword(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,600,400);
        this.setTitle("My Info");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
         f = new Font("Arial",Font.BOLD,20);
        font = new Font("Arial",Font.BOLD + Font.ITALIC,28);
        
        label = new JLabel("Change Password");
        label.setFont(font);
        label.setBounds(120,20,350,50);
        c.add(label);
        
        label1 = new JLabel("Current Password:");
        label1.setFont(f);
        label1.setBounds(30,80,300,40);
        c.add(label1);
        
        pf1 = new JPasswordField();
        pf1.setFont(f);
        pf1.setBounds(300,80,180,40);
        c.add(pf1);
        
        label2 = new JLabel("New Password:");
        label2.setFont(f);
        label2.setBounds(30,140,300,40);
        c.add(label2);
        
        pf2 = new JPasswordField();
        pf2.setFont(f);
        pf2.setBounds(300,140,180,40);
        c.add(pf2);
        
        label3 = new JLabel("Re-type Password:");
        label3.setFont(f);
        label3.setBounds(30,200,300,40);
        c.add(label3);
        
        pf3 = new JPasswordField();
        pf3.setFont(f);
        pf3.setBounds(300,200,180,40);
        c.add(pf3);
        
        submitButton = new JButton("Submit");
        submitButton.setFont(f);
        submitButton.setBounds(150,280,100,40);
        c.add(submitButton);
        
        clearButton = new JButton("Clear");
        clearButton.setFont(f);
        clearButton.setBounds(320,280,100,40);
        c.add(clearButton);
        
         clearButton.addActionListener(this);
         submitButton.addActionListener(this);
        
    }
      @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton){
            
            
        }else if(e.getSource() == clearButton){
                  pf1.setText("");
                  pf2.setText("");
                  pf3.setText("");
                  
        }else{
            JOptionPane.showMessageDialog(null, "you didn't entert anything");
        }
    }
    /*public static void main(String[] args) {
        NewPassword np = new NewPassword();
        np.setVisible(true);
    }*/

  
    
}
