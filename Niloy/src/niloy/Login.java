
package niloy;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
    private Container c;
    private JLabel welcomeLabel,label1,label2;
    private JTextField tf;
    private JPasswordField pf;
    private JButton login_button, clear_button;
    private Font f, font;
    private ImageIcon img;
    
    Login(){
        
        loginComponents();
        
    }
    public void loginComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,400);
        this.setTitle("Login Demo");
        this.setResizable(false);
        
        //Content Pane 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        //Font
        f = new Font("Arial",Font.BOLD,20);
        font = new Font("Arial",Font.BOLD + Font.ITALIC,28);
        welcomeLabel = new JLabel("Welcome");
        welcomeLabel.setFont(font);
        welcomeLabel.setBounds(200,20,150,50);
        c.add(welcomeLabel);
        //JLabel - 1
        label1 = new JLabel("Username:");
        label1.setFont(f);
        label1.setBounds(50,100,150,40);
        label1.setToolTipText("enter the username");
        c.add(label1);
         //JTextField
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(160,100,200,40);
        c.add(tf);
         //JLabel - 2
        label2 = new JLabel("Password:");
        label2.setFont(f);
        label2.setBounds(50,160,150,40);
        label2.setToolTipText("enter the password");
        c.add(label2); 
        //JPasswordField
        pf = new JPasswordField();
        pf.setFont(f);
        pf.setBounds(160,160,200,40);
        c.add(pf);
         //JButton 
        login_button = new JButton("Login");
        login_button.setFont(f);
        login_button.setBounds(140,230,100,40);
        c.add(login_button);
        
        clear_button = new JButton("Clear");
        clear_button.setFont(f);
        clear_button.setBounds(260,230,100,40);
        c.add(clear_button);
         //ActionListener
        clear_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               tf.setText("");
               pf.setText("");
            }
        });
        login_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String userName = tf.getText();
               String password = pf.getText();
               if(userName.equals("havoc") && password.equals("havoc123")){
                   JOptionPane.showMessageDialog(null, "you logined successfully");
                    dispose();
                    MyInfo info = new MyInfo();
                    info.setVisible(true);
                   
               }else{
                   JOptionPane.showMessageDialog(null, "Invalid password or username");
               }
               
            }
        });
    }
    
    public static void main(String[] args) {
        Login log = new Login();
        log.setVisible(true);
    }
}
