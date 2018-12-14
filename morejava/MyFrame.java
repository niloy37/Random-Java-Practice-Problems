package Frame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
public class MyFrame extends JFrame{
	private JLabel item;
	private JTextField item2;
	private JPasswordField item3;
	MyFrame(){
		super(" demo frame ");
		setLayout(new FlowLayout());
		item = new JLabel("Enter your username ");
		item.setToolTipText("Enter username here");
		add(item);
		item2= new JTextField(10);
		add(item2);
		item3= new JPasswordField ("1222");
		add(item3);
		Handle h = new Handle();
        item3.addActionListener(h);
        item2.addActionListener(h);
		
	}
	public class Handle implements ActionListener{
		public  void actionPerformed(ActionEvent e) {
		 String str="";
		 if(e.getSource()== item3) {
			str = String.format("%s",e.getActionCommand());
		 }
		 if(e.getSource()==item2) {
			 
			 str = String.format("%s",e.getActionCommand());
		 }
              JOptionPane.showMessageDialog(null,str);
		}
	}
	
	

}
