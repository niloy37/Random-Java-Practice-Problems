
package pkg1811601642niloy;
import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author havoccboi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int x=JOptionPane.showConfirmDialog(null,"Do you want to see name?? ","Confirmation",JOptionPane.YES_NO_OPTION);
        if(x== JOptionPane.YES_OPTION)
        JOptionPane.showMessageDialog(null,"Syeda Tamanna Ahsan","Name",JOptionPane.QUESTION_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null,"Terminating the Program","Terminate",JOptionPane.QUESTION_MESSAGE);
        
        /*
        Javax.Swing // JOptionPane
        
        */
        MyFrame mf= new MyFrame();
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mf.setSize(500,500);
       mf.setVisible(true);
    }
    
}
