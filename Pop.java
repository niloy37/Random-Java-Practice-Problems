import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.*;



class Pop
{
 public static void main (String [] args) { 
 
JOptionPane.showMessageDialog(null,"A popup Input will be displayed,Good Day!","Good Day!",JOptionPane.INFORMATION_MESSAGE);
String str1 = JOptionPane.showInputDialog(null,"Enter Integer number one : " , "Input",JOptionPane.QUESTION_MESSAGE);
String str2 = JOptionPane.showInputDialog(null,"Enter Integer number two : " , "Input",JOptionPane.QUESTION_MESSAGE);
   int x= Integer.parseInt(str1);
   int y = Integer.parseInt(str2);

 int result = x*y;
JOptionPane.showMessageDialog(null,result,"Good Day!",JOptionPane.INFORMATION_MESSAGE);
   

}


}