
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Manager extends JFrame implements ActionListener{
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private Container c;
    private JLabel infoLabel, firstNameLabel, lastNameLabel, idLabel, phoneLabel, sexLabel;
    private JTextField tfName1, tfName2, tfId, tfPhone;
    private Font f, font;
    private JButton addButton, dueButton, changePassButton,clearButton;
    private String []col = {"Id", "First Name", "Last Name", "Phone"};
    private String []row = new String[4];
    Manager(){
        managerComponents();
    }
    public void managerComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,800,800);
        this.setTitle("Information");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f = new Font("Arial",Font.BOLD,20);
        font = new Font("Arial",Font.BOLD + Font.ITALIC,28);
        
        infoLabel = new JLabel("Information");
        infoLabel.setFont(font);
        infoLabel.setBounds(300,30,250,30);
        c.add(infoLabel);
        
        idLabel = new JLabel("Id:");
        idLabel.setFont(f);
        idLabel.setBounds(80,80,150,40);
        c.add(idLabel);
        
        tfId = new JTextField();
        tfId.setFont(f);
        tfId.setBounds(200,80,190,40);
        c.add(tfId);
        
        addButton = new JButton("Add");
        addButton.setFont(font);
        addButton.setBounds(430,80,120,40);
        addButton.setBackground(Color.YELLOW);
        c.add(addButton);
        
        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setFont(f);
        firstNameLabel.setBounds(80,140,150,40);
        c.add(firstNameLabel);
        
        tfName1 = new JTextField();
        tfName1.setFont(f);
        tfName1.setBounds(200,140,190,40);
        c.add(tfName1);
        
        dueButton = new JButton("Due");
        dueButton.setFont(font);
        dueButton.setBounds(430,140,120,40);
        dueButton.setBackground(Color.YELLOW);
        c.add(dueButton);
        
        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setFont(f);
        lastNameLabel.setBounds(80,200,150,40);
        c.add(lastNameLabel);
        
        tfName2 = new JTextField();
        tfName2.setFont(f);
        tfName2.setBounds(200,200,190,40);
        c.add(tfName2);
        
        clearButton = new JButton("Clear");
        clearButton.setFont(font);
        clearButton.setBounds(430,200,120,40);
        clearButton.setBackground(Color.YELLOW);
        c.add(clearButton);
        
        phoneLabel = new JLabel("Phone:");
        phoneLabel.setFont(f);
        phoneLabel.setBounds(80,260,150,40);
        c.add(phoneLabel);
        
        tfPhone = new JTextField();
        tfPhone.setFont(f);
        tfPhone.setBounds(200,260,190,40);
        c.add(tfPhone);
        
        changePassButton = new JButton("Change Password");
        changePassButton.setFont(font);
        changePassButton.setBounds(430,260,300,40);
        changePassButton.setBackground(Color.PINK);
        c.add(changePassButton);
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.YELLOW);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(25,360,720,320);
        c.add(scroll);
        
        addButton.addActionListener(this);
        dueButton.addActionListener(this);
        clearButton.addActionListener(this);
        changePassButton.addActionListener(this);
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == addButton){
                 row[0] =  tfId.getText();
                 row[1] =  tfName1.getText();
                 row[2] =  tfName2.getText();
                 row[3] =  tfPhone.getText();
                 model.addRow(row);
              }else if(e.getSource() == dueButton){
                  
                  
              }else if(e.getSource() == clearButton){
                  
                  tfId.setText("");
                  tfName1.setText("");
                  tfName2.setText("");
                  tfPhone.setText("");
              }else if(e.getSource() == changePassButton){
                   dispose();
                   NewPassword np = new NewPassword();
                   np.setVisible(true);
              }else{
                  JOptionPane.showMessageDialog(null, "you didn't entert anything");
              }
         
    }
    /*public static void main(String[] args) {
        Manager m = new Manager();
        m.setVisible(true);
    }*/

    
}
