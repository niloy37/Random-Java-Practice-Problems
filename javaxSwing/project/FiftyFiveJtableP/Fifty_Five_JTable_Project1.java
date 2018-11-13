package javaapplication11;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class Fifty_Five_JTable_Project1 extends JFrame implements ActionListener{

    private ImageIcon img, img1,data;
    private Container c;
    private JLabel lb1,lb2,fn,ln,pn,gpa,line,copyr;
    private Font f1,f2,f3;
    private JTextField ft,lt,pt,gt;
    private JPasswordField p;
    private JButton add,update,delete,clear;
    private JPanel p1,p2,p3;
    private JToggleButton tb1;
   
    private CardLayout c_out;
    private JSlider jl;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane sp;
    private String col[]={"FirstName","LastName","Phone Number","CGPA"};
    private String row[]=new String[4];
    
    

    
    /*
    Card Layout using for add all component in same space ..
    */
    Fifty_Five_JTable_Project1() {
        initComponent();
    }

    public void initComponent() {
        img = new ImageIcon(getClass().getResource("dip.jpg"));
        img1 = new ImageIcon(getClass().getResource("reg.jpg"));
        
         Color color = new Color(229,229,203);
        this.setIconImage(img.getImage());
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(color);
        f1 = new Font("Arial",Font.BOLD,20);
        f2 = new Font("Arial",Font.BOLD,12);
        f3 = new Font("Arial",Font.BOLD,10);
        
       
        
        lb1 = new JLabel(img1);
        lb1.setBounds(200,5,220,70);
        lb1.setOpaque(true);
        lb1.setBackground(Color.yellow);
        c.add(lb1);
        lb1.setFont(f1);
        
        fn = new JLabel("First Name");
        fn.setBounds(20,80,80,30);
        c.add(fn);
        fn.setFont(f2);
        
        ft = new JTextField();
        ft.setBounds(110,80,150,30);
        c.add(ft);
        ft.setFont(f2);
        
        add = new JButton("Add");
        add.setBounds(295,80,75,30);
        c.add(add);
        ft.setFont(f2);
        
        
        ln = new JLabel("Last Name");
        ln.setBounds(20,125,80,30);
        c.add(ln);
        ln.setFont(f2);
        
        lt = new JTextField();
        lt.setBounds(110,125,150,30);
        c.add(lt);
        lt.setFont(f2);
        
        update = new JButton("Update");
        update.setBounds(295,125,75,30);
        c.add(update);
        update.setFont(f2);
        
        
        pn = new JLabel("Phone");
        pn.setBounds(20,170,80,30);
        c.add(pn);
        pn.setFont(f2);
        
        pt = new JTextField();
        pt.setBounds(110,170,150,30);
        c.add(pt);
        pt.setFont(f2);
        
        delete = new JButton("Delete");
        delete.setBounds(295,170,75,30);
        c.add(delete);
        delete.setFont(f2);
        
        
        gpa = new JLabel("CGPA");
        gpa.setBounds(20,215,80,30);
        c.add(gpa);
        gpa.setFont(f2);
        
        gt = new JTextField();
        gt.setBounds(110,215,150,30);
        c.add(gt);
        gt.setFont(f2);
        
        clear = new JButton("Clear");
        clear.setBounds(295,215,75,30);
        c.add(clear);
        clear.setFont(f2);
        
        
        line = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------");
        line.setBounds(0,300,700,5);
        c.add(line);
        line.setOpaque(true);
        line.setBackground(color);
        ;
        
        
        
        
        
        lb2 = new JLabel("Student DataBase");
        lb2.setBounds(215,330,220,50);
        c.add(lb2);
        lb2.setOpaque(true);
        lb2.setBackground(color);
        lb2.setFont(f1);
        
        table = new JTable();
        //table.setEnabled(false);  //table editable permission disable
        table.setSelectionBackground(Color.PINK);
        table.setBackground(Color.LIGHT_GRAY);
       
        sp = new JScrollPane(table);
        sp.setBounds(20,395,560,250);
        c.add(sp);
       
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setSelectionBackground(Color.cyan);
        
        copyr = new JLabel("diptasaha.lpu.cse@gmail.com");
        copyr.setBounds(225,655,220,30);
        c.add(copyr);
        copyr.setOpaque(true);
        copyr.setBackground(color);
        copyr.setFont(f3);
        
        
        add.addActionListener(this);
        clear.addActionListener(this);
        delete.addActionListener(this);
        update.addActionListener(this);
        gt.addActionListener(this);
        
        
        
        
        
        
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me) {
               int row =  table.getSelectedRow();
                String f_n = model.getValueAt(row, 0).toString();
                String l_n = model.getValueAt(row, 1).toString();
                String p_n = model.getValueAt(row, 2).toString();
                String g_n = model.getValueAt(row, 3).toString();
                
                ft.setText(f_n);
                lt.setText(l_n);
                pt.setText(p_n);
                gt.setText(g_n);
                
            }

           
        
        });
        
    }
    
   @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            row[0] = ft.getText();
            row[1] = lt.getText();
            row[2] = pt.getText();
            row[3] = gt.getText();
            
            
            if (!ft.getText().equals("") && !lt.getText().equals("") && !pt.getText().equals("") && !gt.getText().equals("")) {
                
                
            model.addRow(row);
            
            
            }
            else
            {
                
                JOptionPane.showMessageDialog(null,"Flap All Field");
                ft.setText("");
                lt.setText("");
                pt.setText("");
                gt.setText("");
            }
           
       }
        else if(ae.getSource() == clear)
        {
            row[0] = ft.getText();
            row[1] = lt.getText();
            row[2] = pt.getText();
            row[3] = gt.getText();
            
            if (ft.getText().equals("") && lt.getText().equals("") && pt.getText().equals("") && gt.getText().equals("")) {
                
                JOptionPane.showMessageDialog(null,"Input Data Field Already Cleared");
            
            
            
            }
            else
            {
                ft.setText("");
            lt.setText("");
            pt.setText("");
            gt.setText("");
            JOptionPane.showMessageDialog(null,"Input Data Field Cleared");
            }
            
            
            
            
            
            
        }
        else if(ae.getSource() == delete)
        {
           int row_num = table.getSelectedRow();
            if (row_num >= 0) {
                 
                
               
         int a =JOptionPane.showConfirmDialog(null, "Are You Sure...?", "Permission", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            
            model.removeRow(row_num);
            JOptionPane.showMessageDialog(null,"Selected Data Deleted Successfully");
            ft.setText("");
            lt.setText("");
            pt.setText("");
            gt.setText("");
            
            
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cancel Deletion And Your Record is Safe","Cancel Deletion",JOptionPane.PLAIN_MESSAGE);
        }
                
          }
            else
            {
                JOptionPane.showMessageDialog(null,"You didn't Selected Any Data Or DataBase is Empty");
            }
           
        }
        else if(ae.getSource() == update)
        {
           int row =  table.getSelectedRow();
                String f_n = ft.getText();
                String l_n = lt.getText();
                String p_n = pt.getText();
                String g_n = gt.getText();
                
                if (row >= 0) {
                    model.setValueAt(f_n, row, 0);
                model.setValueAt(l_n, row, 1);
                model.setValueAt(p_n, row, 2);
                model.setValueAt(g_n, row, 3);
                    
                
            }
                else
                {
                JOptionPane.showMessageDialog(null,"You didn't Selected Any Data Or DataBase is Empty");
                }
                
                
                
                
                
        }
        
        else if(ae.getSource() == gt)
        {
            //add button working
            
            row[0] = ft.getText();
            row[1] = lt.getText();
            row[2] = pt.getText();
            row[3] = gt.getText();
            
            
            if (!ft.getText().equals("") && !lt.getText().equals("") && !pt.getText().equals("") && !gt.getText().equals("")) {
                
                
            model.addRow(row);
            
            
            }
            else
            {
                
                JOptionPane.showMessageDialog(null,"Flap All Field");
                ft.setText("");
                lt.setText("");
                pt.setText("");
                gt.setText("");
            }
            
            
            
        }
        
        
    }

   

    public static void main(String[] args) {

        Fifty_Five_JTable_Project1 frame = new Fifty_Five_JTable_Project1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(250, 40, 600, 710);
        frame.setResizable(false);
        frame.setTitle("Students Registration Form And Database");

    }

}
