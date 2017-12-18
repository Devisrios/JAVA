import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener
{
  JButton b1;
  JCheckBox c1;
  Login()
  {
    setVisible(true);
    setSize(500,400);
    setLayout(null);
    setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    setTitle("Choose who r u");
    b1=new JButton("Click me");
    
    add(b1);
    
    b1.setBounds(100,20,350,350);
    
    b1.addListener(this);
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","system","shree");
    }
    catch(EXception e)
    {
      System.out.println("Error");
    }
    Vector v=new Vector();
    v.add("Staff");
    v.add("Student");
    JCheckBox c1=new JCheckBox(v);
    c1.setBounds(100,20,100,100);
    add(c1);
    public void actionPerformed(ActionEvent e)
    {
      dispose();
      Login1 p2=new Login1();
    }
    public class Login1 implements ActionListener extends Login
    {
     JFrame f2;
      JLabel l1,l2;
      JTextField t1,t2;
      JButton b2;
      Login1()
      {
        JFrame f2=new JFrame("Loginpage");
        l1=new Jlabel("UserName");
        l2=new JLabel("rollno");
        t1=new JTextField();
        t2=new JTextField();
        f2.add(l1);
        f2.add(l2);
        f2.add(t1);
        f2.add(t2);
        f2.setSize(500,500);
        f2.setVisible(true);
        f2.setLayout(null);
        f2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        b2.addListener(this);
          
        b1=new JButton("Login");
        l1.setBounds(50,20,20,30);
        t1.setBounds(50,20,70,30);
        l2.setBounds(50,20,20,50);
        t2.setBounds(50,20,70,50);
        Vector v1=new Vector();
        v1.add(t1);
        v1.add(t2);
        
        public void actionPerformed(ActionEvent e)
        {
          f2.dispose();
          Operation p3=new Operation();
        }
        public class Operation extends Login1 implements ActionListener
        {
          JFrame f3;
          JButton b3,b4,b5,b6,b7;
          Operation()
          {
            f3=new JFrame("Details");
            f3.setSize(500,500);
            f3.setVisible(true);
            f3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            b3=new JButton("Delete");
            b4=new JButton("Insert");
            b5=new JButton("View");
            b6=new JButton("Update");
            b7=new JButton("ViewMarks");
            b13=new JButton("CalculateMark");
            b3.setBounds(50,20,20,50);
            b4.setBounds(50,20,70,50);
            b5.setBounds(50,20,150,50);
            b6.setBounds(50,20,250,50);
            b7.setBounds(50,20,350,50);
            b13.setBounds(50,20,500,50);
            f3.add(b3);
            f3.add(b4);
            f3.add(b5);
            f3.add(b6);
            f3.add(b7);
            f3.add(b13);
            b13.addListener(this);
            b3.addListener(this);
            b4.addListener(this);
            b5.addListener(this);
            b6.addListener(this);
            b7.addListener(this);
            public void actionPerformed(ActionEvent e)
            {
              if(e.getSource()==b3)
              {
                deleteData();
              }
              if(e.getSource()==b4)
              {
                insertData();
              }
              if(e.getSource()==b5)
              {
                viewData();
              }
              if(e.getSource()==b6)
              {
                updateData();
              }
              if(e.getSource()==b7)
              {
                viewmarkData();
              }
              if(e.getSource()==b13)
              {
                calculateMark();
              }
              
              public void viewData()
              {
                JFrame f4=new JFrame("View");
                f4.setSize(800,800);
                f4.setLayout(null);
                f4.setVisible(true);
                f4.DefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                JLabel l3,l4,l5,l6,l7;
                JTextField t3,t4,t5,t6,t7;
                l3=new JLabel("Stdname");
                l4=new JLabel("Rollno");
                l5=new JLabel("Phoneno");
                l6=new JLabel("Year");
                l7=new JLabel("Dept");
                JTextField t3=new JTextField();
                JTextField t4=new JTextField();

                JTextField t5=new JTextField();

                JTextField t6=new JTextField();

                JTextField t7=new JTextField();

                                

                l3.setBounds(50,20,20,30);
                t3.setBounds(50,20,70,30);
                l4.setBounds(50,20,20,60);
                t4.setBounds(50,20,70,60);
                l5.setBounds(50,20,20,100);
                t5.setBounds(50,20,70,100);
                l6.setBounds(50,20,20,140);
                t6.setBounds(50,20,70,140);
                l7.setBounds(50,20,20,180);
                t7.setBounds(50,20,70,180);
                f4.add(l3);
                f4.add(l4);
                f4.add(l5);
                f4.add(l6);
                f4.add(l7);
                f4.add(t3);
                f4.add(t4);
                f4.add(t5);
                f4.add(t6);
                f4.add(t7);
                t3.setEditable(false);
                t4.setEditable(false);
                t5.setEditable(false);
                t6.setEditable(false);
                t7.setEditable(false);
                String str=(String)v1.selectedItems();
               
                Statment s1=con.createStatement(select  * from Details where stdName=?);
                ResultSet rs=s1.executeQuery();
                s1.setString(str);
                while(rs.next)
                {
                  t3.setText(rs.getString(1));
                  t4.setText(rs.getInt(2));
                  t5.setText(rs.getInt(3));
                  t6.setText(rs.getInt(4));
                  t7.setText(rs.getInt(5));
                  
                }
                JButton b8=new JButton("Back");
                b8.setBounds(50,20,400,750);
                f4.add(b8);
                b8.addListener(this);
                if(e.getSource()==b8)
                {
                  f4.dispose();
                  Login1 p2=new Login1();
                }
              
              
              } 
              public void insertData()
              {
                JFrame f5=new JFrame("Insert");
                f5.setSize(800,800);
                f5.setLayout(null);
                f5.setVisible(true);
                f5.DefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                JLabel l8,l9,l10,l11,l12;
                JTextField t8,t9,t10,t11,t12;
                l3=new JLabel("Stdname");
                l4=new JLabel("Rollno");
                l5=new JLabel("Phoneno");
                l6=new JLabel("Year");
                l7=new JLabel("Dept");
                JTextField t8=new JTextField();
                JTextField t9=new JTextField();

                JTextField t10=new JTextField();
                JTextField t11=new JTextField();

                JTextField t12=new JTextField();

                                

                l8.setBounds(50,20,20,30);
                t8.setBounds(50,20,70,30);
                l9.setBounds(50,20,20,60);
                t9.setBounds(50,20,70,60);
                l10.setBounds(50,20,20,100);
                t10.setBounds(50,20,70,100);
                l11.setBounds(50,20,20,140);
                t11.setBounds(50,20,70,140);
                l12.setBounds(50,20,20,180);
                t12.setBounds(50,20,70,180);
                f5.add(l8);
                f5.add(l9);
                f5.add(l10);
                f5.add(l11);
                f5.add(l12);
                f5.add(t8);
                f5.add(t9);
                f5.add(t10);
                f5.add(t11);
                f5.add(t12);
                t8.setEditable(false);
                t9.setEditable(false);
                t10.setEditable(false);
                t11.setEditable(false);
                t12.setEditable(false);
                String str1=(String)v1.selectedItems();
               
                Statment s2=con.createStatement(insert into Details values"(?,?,?,?,?)");
                ResultSet rs1=s1.executeQuery();
                JButton b9=new JButton("Insert");
                b9.setBounds(50,20,40,700);
                b9.addListener(this);
                JButton b10=new JButton("back");
                b10.setBounds(50,20,110,700);
                b10.addListener(this);
              if(e.getSource()==b10)
                {
                  f4.dispose();
                  Login1 p2=new Login1();
                }
                if(e.getSource()==b9)
                {
                 System.out.println("InsertedSuccessfully"); 
                 
                }
              }
              public void deleteData()
              {
                JFrame f6=new JFrame("Delete");
                f6.setSize(800,800);
                f6.setLayout(null);
                f6.setVisible(true);
                f6.DefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                
              Statment s3=con.createStatement(Select * from Details where stdName=?);
                ResultSet rs2=s3.executeQuery();
                JButton b11=new JButton("Delete");
                b11.setBounds(50,20,40,700);
                b11.addListener(this);
                JButton b12=new JButton("back");
                b12.setBounds(50,20,110,700);
                b12.addListener(this);
                f5.add(b11);
                f5.add(b12);
              if(e.getSource()==b12)
                {
                  f5.dispose();
                  Login1 p2=new Login1();
                }
                if(e.getSource()==b11)
                {
                 System.out.println("DeletedSuccessfully"); 
                 
                }
              }
             public void updateData()
             {
               JFrame f7=new JFrame("Update");
                f7.setSize(800,800);
                f7.setLayout(null);
                f7.setVisible(true);
                f7.DefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                
              Statment s4=con.createStatement(update set Details year=4 where stdName=?);
                ResultSet rs3=s4.executeQuery();
                JButton b11=new JButton("Update");
                b11.setBounds(50,20,40,700);
                b11.addListener(this);
                JButton b12=new JButton("back");
                b12.setBounds(50,20,110,700);
                b12.addListener(this);
                f7.add(b11);
                f7.add(b12);
              if(e.getSource()==b12)
                {
                  f7.dispose();
                  Login1 p2=new Login1();
                }
                if(e.getSource()==b11)
                {
                 System.out.println("UpdatedSuccessfully"); 
                 
                }
              }
              public void viewmarkData()
              {
              JFrame f10=new JFrame("InsertMark");
                f10.setSize(800,800);
                f10.setLayout(null);
                f10.setVisible(true);
                f10.DefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                JLabel l19,l17,l18;
                JTextField t19,t17,t18;
                l19=new JLabel("Mark1");
                l17=new JLabel("Mark2");
                l18=new JLabel("Mark3");
              
                JTextField t19=new JTextField();
                JTextField t17=new JTextField();

                JTextField t18=new JTextField();
                l19.setBounds(50,20,20,30);
                t19.setBounds(50,20,70,30);
                l17.setBounds(50,20,20,60);
                t17.setBounds(50,20,70,60);
                l18.setBounds(50,20,20,100);
                t18.setBounds(50,20,70,100);
             
           
                f10.add(l19);
                f10.add(l17);
                f10.add(l18);
                f10.add(t19);
                f10.add(t17);
                f10.add(t18);
               
      Statment s5=con.createStatement(insert into MarkDetails values"(?,?,?)");
             
                JButton b16=new JButton("Back");
                b16.setBounds(50,20,400,750);
                f10.add(b16);
                b16.addListener(this);
                JButton b17=new JButton("Percentage");
                b17.setBounds(50,20,500,750);
                f10.add(b17);
                b15.addListener(this);
                if(e.getSource()==b16)
                {
                  f10.dispose();
                  Login1 p2=new Login1();
                }
                if(e.getSource()==b17)
                {
                  f10.dispose();
                  JLabel l20=new JLabel("Percentage");
                  JTextField t20=new JTextField();
                  l20.setBounds(50,20,20,30);
                  t20.setBounds(50,20,70,30);
                  JFrame f11=new JFrame("Percentage");
                  f11.setSize(500,500);
                  f11.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                  f11.setLayout(null);
                  f11.add(l20);
                  f9.add(t20);
                  t20.addListener(this);
                  Statement s5=con.createStatement(select mark1,mark2,mark3 from MarkDetails where Rollno=?);
                  int percent1;
                  percent1=(mark1+mark2+mark3)/100;
                  public void actionPerformed(ActionEvent e)
                  {
                    if(e.getSource()==t20)
                    {
                      t20.setText(percent);
                    }
                  }
                }
              public void viewMarkData()
              {
              JFrame f8=new JFrame("ViewMark");
                f8.setSize(800,800);
                f8.setLayout(null);
                f8.setVisible(true);
                f8.DefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                JLabel l13,l14,l15;
                JTextField t13,t14,t15;
                l13=new JLabel("Mark1");
                l14=new JLabel("Mark2");
                l15=new JLabel("Mark3");
              
                JTextField t13=new JTextField();
                JTextField t14=new JTextField();

                JTextField t15=new JTextField();
                l13.setBounds(50,20,20,30);
                t13.setBounds(50,20,70,30);
                l14.setBounds(50,20,20,60);
                t14.setBounds(50,20,70,60);
                l15.setBounds(50,20,20,100);
                t15.setBounds(50,20,70,100);
             
           
                f8.add(l13);
                f8.add(l14);
                f8.add(l15);
                f4.add(t13);
                f4.add(t14);
                f4.add(t15);
                t13.setEditable(false);
                t14.setEditable(false);
                t15.setEditable(false);
                String str=(String)v1.selectedItems();
               
                Statment s4=con.createStatement(select  * from MarkDetails where stdName=?);
                ResultSet rs3=s2.executeQuery();
                s1.setString(str);
                while(rs3.next())
                {
                  t13.setText(rs.getString(2));
                  1t4.setText(rs.getInt(3));
                  t15.setText(rs.getInt(4));
                  
                  
                }
                JButton b14=new JButton("Back");
                b14.setBounds(50,20,400,750);
                f8.add(b14);
                b14.addListener(this);
                JButton b15=new JButton("Percentage");
                b15.setBounds(50,20,500,750);
                f8.add(b15);
                b15.addListener(this);
                if(e.getSource()==b14)
                {
                  f8.dispose();
                  Login1 p2=new Login1();
                }
                if(e.getSource()==b15)
                {
                  f8.dispose();
                  JLabel l16=new JLabel("Percentage");
                  JTextField t16=new JTextField();
                  l16.setBounds(50,20,20,30);
                  t16.setBounds(50,20,70,30);
                  JFrame f9=new JFrame("Percentage");
                  f9.setSize(500,500);
                  f9.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                  f9.setLayout(null);
                  f9.add(l16);
                  f9.add(t16);
                  t16.addListener(this);
                  Statement s5=con.createStatement(select mark1,mark2,mark3 from MarkDetails where Rollno=?);
                  int percent;
                  percent=(mark1+mark2+mark3)/100;
                  public void actionPerformed(ActionEvent e)
                  {
                    if(e.getSource()==t16)
                    {
                      t16.setText(percent);
                    }
                  }
                }
                public static void main(String[] args)
                {
                  Login p1=new Login();
                  Login1 p2=new Login1();
                  Operation p3=new Operation();
                }
              }
                //
                create table Details(Stdname varchar2(9),Rollno number(9) primarykey,Phoneno number(20),Year number(9),Dept varchar2(9));
                insert into Details values("Shree",9999,9999999999,3,"cse");
                select * from Details;
                //
                create table MarkDetails(Rollno number(9) foreignkey,marks1 number(9),mark2 number(9),mark3 number(9));
                insert into Details values(999,44,55,66);
                select * from MarkDetails;
                
               
  
