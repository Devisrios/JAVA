//Electricity bil Management
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
public class Application extends JFrame implements ActionListener
{
  JLabel l1,l2,l3,l4,l5;
  JButton b;
  JTextField t1,t2,t3,t4,t5;
  String str;
  Application()
  {
    setVisible(true);
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l1=new JLabel("Employee name");
    t1=new JTextField();
    b=new JButton();
    l1.setBounds(50,20,20,30);
    t1.setBounds(60,20,90,30);
    b.setBounds(100,200,150,130);
    t1.addActionListener(this);
    b.addActionListener(this);
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","System","smldp");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("Select * from Bill");
      Vector v=new Vector();
      while(rs.next())
      {
        String s=rs.getString(1);
        v.add(s);
      }
    }
      t1=v;
      catch(Exception e)
      {
        System.out.println(e);
      }
    
      public void actionPerformed(ActionEvent e)
      {
        showData();
      }
      public void showData()
      {
        JFrame f1=new JFrame("Bill details");
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(null);
        l2=new JLabel("Employee name");
        l3=new JLabel("Employee no");
        l4=new JLabel("Bill amount");
        l5=new JLabel("Bill Status");
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        l2.setBounds(70,20,20,30);
        l3.setBounds(70,20,20,50);
        l4.setBounds(70,20,20,80);
        l5.setBounds(70,20,20,110);
        t2.setBounds(90,20,110,30);
        t3.setBounds(90,20,110,50);
        t4.setBounds(90,20,110,80);
        t5.setBounds(90,20,110,110);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
      str=(String)t1.getSelectedItem();
        try
        {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","System","smldp");
      Statement st=con.createStatement(1,str);
      ResultSet rs1=stmt.executeQuery("Select * from Bill where empName=?");
          while(rs1.next())
          {
            t2.setText(rs1.getString(1));
            t3.setText(rs1.getInt(2));
            t4.setText(rs1.getInt(3));
            t5.setText(rs1.getString(4));
          }
        }
          catch(Exception e)
          {
            System.out.println(e);
          }
        }  
  }
   public static void main(String[] args)
   {
    new Application();
   }
}
//database
create table Bill(empName varchar2(20),empNo number(9),billamt number(9),billstatus varchar2(20));
insert into Bill values("Shree",20,2000,"paid");
insert into Bill values("Devi",21,3000,"Unpaid");
select * from Bill;
            
