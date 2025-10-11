
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{
    JButton deposit,whithdrawl,fastcash,balance,pin,statement,exit;
    String pinno;
  Transactions(String pinno)
  {    this.pinno=pinno;
      
      setLayout(null);
       getContentPane().setBackground(Color.WHITE);

       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
         JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please Select your Tranasaction");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(215,300,700,35);
        image.add(text);
        
      deposit=new JButton("DEPOSIT");
      deposit.setBackground(Color.WHITE);
      deposit.setForeground(Color.BLACK);
      deposit.addActionListener(this);
      deposit.setBounds(170,415,150,30);
      image.add(deposit);
       
      whithdrawl=new JButton("CASH WITHDRAWL");
      whithdrawl.setBackground(Color.WHITE);
      whithdrawl.setForeground(Color.BLACK);
      whithdrawl.addActionListener(this);
      whithdrawl.setBounds(350,415,150,30);
      image.add(whithdrawl);
      
      fastcash=new JButton("FAST CASH");
      fastcash.setBackground(Color.WHITE);
      fastcash.setForeground(Color.BLACK);
      fastcash.addActionListener(this);
      fastcash.setBounds(170,450,150,30);
      image.add(fastcash);
      
      balance=new JButton("BALANCE INQUIRY");
      balance.setBackground(Color.WHITE);
      balance.setForeground(Color.BLACK);
      balance.addActionListener(this);
      balance.setBounds(350,450,150,30);
      image.add(balance);
      
      pin=new JButton("PIN CHANGE");
      pin.setBackground(Color.WHITE);
      pin.setForeground(Color.BLACK);
      pin.addActionListener(this);
      pin.setBounds(170,485,150,30);
      image.add(pin);
      
      statement=new JButton("MINI STATEMENT");
      statement.setBackground(Color.WHITE);
      statement.setForeground(Color.BLACK);
      statement.addActionListener(this);
      statement.setBounds(350,485,150,30);
      image.add(statement);
      
       exit=new JButton("EXIT");
      exit.setBackground(Color.WHITE);
     exit.setForeground(Color.BLACK);
     exit.addActionListener(this);
      exit.setBounds(265,520,150,30);
      image.add(exit);
      
      
      
        setTitle("Welcome to ATM");
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true); 
  }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==exit) 
      {
          System.exit(0);
      }
      else if(ae.getSource()==deposit)
      {
          setVisible(false);
          new deposit(pinno);
      }
       else if(ae.getSource()==whithdrawl)
      {
          setVisible(false);
          new withdrawl(pinno);
      }
    }
    public static void main(String[] args)
    {
       new Transactions("");
    }
    
}
