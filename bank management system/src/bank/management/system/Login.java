
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton Login,clear,signup;
    JTextField carTextField;
    JPasswordField pinTextField;

Login()
    {  setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label= new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        getContentPane().setBackground(Color.RED);

        JLabel text=new JLabel("welcome to my ATM");
        text.setFont(new Font("Oward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("CARD NO");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(200,150,400,40);
        add(cardno);

        carTextField=new JTextField();
        carTextField.setBounds(400,150,250,30);
        carTextField.setFont(new Font("Aerial",Font.BOLD,14));
        add(carTextField);

        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(200,220,400,40);
        add(pin);

        pinTextField=new JPasswordField();
        pinTextField.setBounds(400,220,250,30);
        add(pinTextField);

        Login=new JButton("LOGIN");
        Login.setBounds(400,300,100,30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);


        clear=new JButton("CLEAR");
        clear.setBounds(500,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        
        signup=new JButton("SIGN UP");
        signup.setBounds(400,350,200,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        

        getContentPane().setBackground(Color.WHITE);

        setTitle("AUTOMATIC TAILER MACHINE");
        setSize(800,480);
        setLocation(350,200);
        setVisible(true);



    }

    public void actionPerformed(ActionEvent ae)
    {
      if (ae.getSource()==clear) 
      {
        carTextField.setText(" ");
        pinTextField.setText("");
      }
      else if (ae.getSource()==Login) 
      {
          conn c=new conn();
          String cardno=carTextField.getText();
          String pinno=pinTextField.getText();
          String query="select * from login where pin='"+pinno+"'and cardnumber='"+cardno+"' ";
          
          try
          {
             ResultSet rs= c.s.executeQuery(query);
             if(rs.next())
             {
                setVisible(false);
                new Transactions(pinno).setVisible(true);  
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"INCORRECT CARDNO OR PIN"); 
             }
          }
          catch(Exception e)
          {
             System.out.print(e);
          }
          
          
        //setVisible(false);
        //new Transactions();
      }
      else if (ae.getSource()==signup) {
        setVisible(false);
        new Signup().setVisible(true);
      }
    }
public static void main(String args[])
{
    new Login();
}
}

