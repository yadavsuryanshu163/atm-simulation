
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class deposit extends JFrame implements ActionListener
{
    JButton deposit,back;
    JTextField amount;
    String pinno;
deposit(String pinno)
{
    this.pinno=pinno;
     setLayout(null);
       getContentPane().setBackground(Color.WHITE);

       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
         JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image); 
        
         JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(200,350,700,35);
        image.add(text);
        
        amount=new JTextField();
       amount.setBounds(270,320,150,30);
        amount.setFont(new Font("Aerial",Font.BOLD,20));
       image.add(amount);
        
      deposit=new JButton("DEPOSIT");
      deposit.setBackground(Color.WHITE);
      deposit.setForeground(Color.BLACK);
      deposit.addActionListener(this);
      deposit.setBounds(350,450,150,30);
      image.add(deposit);
      
     back=new JButton("BACK");
      back.setBackground(Color.WHITE);
      back.setForeground(Color.BLACK);
      back.addActionListener(this);
     back.setBounds(350,485,150,30);
      image.add(back);
    
       
        setTitle("Welcome to ATM");
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
    
}
public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==back) 
      {
          setVisible(false);
          new Transactions("").setVisible(true);
      }
      else if(ae.getSource()==deposit)
      {
          String numbers=amount.getText();
          Date date=new Date();
          if(numbers.equals(""))
          {
              JOptionPane.showMessageDialog(null,"please ente some amounts");
          }
          else
          {
              try
              {
                  conn c=new conn();
                  String query="insert into bank values('"+pinno+"','"+date+"','deposit','"+numbers+"')";
                  c.s.executeUpdate(query);
                  JOptionPane.showMessageDialog(null," RS " +numbers +" deposited successfully to your account");
                  setVisible(false);
                  new Transactions(pinno).setVisible(true);
                  
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
          }
          
      }
    }
   
    public static void main(String[] args) 
    {
     new deposit("");   
    }
    
}
