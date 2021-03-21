package Employee;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Employee_Detail  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

    Employee_Detail(){
        f=new JFrame("Employee Detail");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,1366,768);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employee/icon/background2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(430,20,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setSize(100, 150);
        b1.setBounds(150, 100, 100, 150);
        b1.setBackground(Color.GREEN);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(450, 100, 100, 150);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(150, 350, 100, 150);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.setBackground(Color.RED);
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(450, 350, 100, 150);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.setBackground(Color.PINK);
        b4.addActionListener(this);
        l1.add(b4);

        f.setVisible(true);
        f.setSize(1366,768);
        f.setLocation(0,0);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
           new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
           new Search_Employee();
        }
    }

    public static void main(String[ ] arg){
        Employee_Detail d = new Employee_Detail();
    }
}