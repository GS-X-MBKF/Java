package Employee;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;


class Homepage implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton lb;

    Homepage(){
 
        f=new JFrame("Employee Management System");
        f.setBackground(Color.MAGENTA);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icon/people.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);
        f.add(l1);


        lb = new JButton("LOGIN");
        lb.setBackground(Color.BLACK);
        lb.setForeground(Color.WHITE);
        

        lb.setBounds(500,600,300,70);
        lb.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1366,768);
        id.setLayout(null);
        
   

        JLabel label=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        label.setBounds(80,30,1500,100);
        label.setFont(new Font("serif",Font.PLAIN,70));
        label.setForeground(Color.BLACK);
        id.add(label);

        id.add(lb);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1366,768);
        f.setLocation(0,0);

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==lb){
            new Login();    
        }
    }

    public static void main(String[] arg){
        Homepage f = new Homepage();
    }
}
