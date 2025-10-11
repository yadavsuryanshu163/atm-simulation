
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

public class SignupThree extends JFrame implements ActionListener
{
    JRadioButton Saving,fixed,current,recurring;
    ButtonGroup groupaccount;
    JCheckBox a1,a2,a3,a4,a5,a6,a7;
    JButton submit,cancel;
    String formno;
   SignupThree(String formno)
   { 
       this.formno=formno;
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);
       setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 3");
       
      JLabel accountdetails=new JLabel("Page-3: Account details");;
      accountdetails.setFont(new Font("Raleway",Font.BOLD,28));
      accountdetails.setBounds(230,100,600,40);
      add(accountdetails);
     
      JLabel accounttype=new JLabel("Account type");
      accounttype.setFont(new Font("Raleway",Font.BOLD,28));
      accounttype.setBounds(80,150,600,40);
      add(accounttype);
      
      Saving=new JRadioButton("SAVING ACCOUNT");
      Saving.setBounds(80,200,150,40);
      Saving.setBackground(Color.WHITE);
      add(Saving);
      
      fixed=new JRadioButton("FIXED ACCOUNT");
      fixed.setBounds(300,200,150,40);
      fixed.setBackground(Color.WHITE);
      add(fixed);
      
      current=new JRadioButton("CURRENT ACCOUNT");
      current.setBounds(80,250,150,40);
      current.setBackground(Color.WHITE);
      add(current);
      
      recurring=new JRadioButton("RECURRING ACCOUNT");
      recurring.setBounds(300,250,170,40);
      recurring.setBackground(Color.WHITE);
      add(recurring);
      
      groupaccount=new ButtonGroup();
      groupaccount.add(Saving);
      groupaccount.add(fixed);
      groupaccount.add(current);
      groupaccount.add(recurring);
      
      JLabel card=new JLabel("Card number:");;
      card.setFont(new Font("Raleway",Font.BOLD,28));
      card.setBounds(80,320,600,40);
      add(card);
      
       JLabel number=new JLabel("XXXX-XXXX-XXXX-4134");;
      number.setFont(new Font("Raleway",Font.BOLD,28));
      number.setBounds(300,320,600,40);
      add(number);
      
       JLabel cdetail=new JLabel("your 16-digit card number");;
      cdetail.setFont(new Font("Raleway",Font.BOLD,16));
      cdetail.setBounds(80,350,600,20);
      add(cdetail);
      
       JLabel pin=new JLabel("PIN:");;
      pin.setFont(new Font("Raleway",Font.BOLD,28));
      pin.setBounds(80,380,600,40);
      add(pin);
      
       JLabel pdetail=new JLabel("your 4-digit PIN");;
      pdetail.setFont(new Font("Raleway",Font.BOLD,16));
      pdetail.setBounds(80,412,600,20);
      add(pdetail);
      
       JLabel num=new JLabel("XXXX");;
      num.setFont(new Font("Raleway",Font.BOLD,28));
      num.setBounds(200,380,100,40);
      add(num);
      
       JLabel service=new JLabel("Services Required");;
      service.setFont(new Font("Raleway",Font.BOLD,28));
      service.setBounds(80,450,250,40);
      add(service);
      
      a1=new JCheckBox("ATM CARD");
      a1.setBackground(Color.WHITE);
      a1.setFont(new Font("Raleway",Font.BOLD,20));
      a1.setBounds(80,500,150,30);
      add(a1);
      
      a2=new JCheckBox("INTERNET BANKING");
      a2.setBackground(Color.WHITE);
      a2.setFont(new Font("Raleway",Font.BOLD,20));
      a2.setBounds(300,500,150,30);
      add(a2);
      
       a3=new JCheckBox("MOBILE BANKING");
      a3.setBackground(Color.WHITE);
      a3.setFont(new Font("Raleway",Font.BOLD,20));
      a3.setBounds(80,530,150,30);
      add(a3);
      
        a4=new JCheckBox("EMAIL & SMS ALERT");
      a4.setBackground(Color.WHITE);
      a4.setFont(new Font("Raleway",Font.BOLD,20));
      a4.setBounds(300,530,150,30);
      add(a4);
      
       a5=new JCheckBox("CHEQUE BOOK");
      a5.setBackground(Color.WHITE);
      a5.setFont(new Font("Raleway",Font.BOLD,20));
      a5.setBounds(80,560,150,30);
      add(a5);
      
       a6=new JCheckBox("E-STATEMENT");
      a6.setBackground(Color.WHITE);
      a6.setFont(new Font("Raleway",Font.BOLD,20));
      a6.setBounds(300,560,150,30);
      add(a6);
      
       a7=new JCheckBox("I hereby declares that the above enterd details are correct to the best of my Knowledge");
      a7.setBackground(Color.WHITE);
      a7.setFont(new Font("Raleway",Font.BOLD,16));
      a7.setBounds(80,630,700,28);
      add(a7);
      
      submit=new JButton("SUBMIT");
      submit.setBackground(Color.BLACK);
      submit.setForeground(Color.WHITE);
      submit.setBounds(100,670,100,28);
      submit.addActionListener(this);
      add(submit);
      
      cancel=new JButton("CANCEL");
      cancel.setBackground(Color.BLACK);
      cancel.setForeground(Color.WHITE);
      cancel.setBounds(250,670,100,28);
      cancel.addActionListener(this);
      add(cancel);
      
      setSize(850,800);
      setLocation(300,10);
      setVisible(true);
       
   } 
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==submit)
       {
          String accountType=null;
          if( Saving.isSelected())
          {
              accountType="SAVING ACCOUNT";
          }
          else if(fixed.isSelected())
          {
            accountType="FIXED ACCOUNT" ; 
          }
          else if(current.isSelected())
          {
              accountType="CURRENT ACCOUNT";
          }
          else if(recurring.isSelected())
          {
              accountType="RECURRING ACCOUNT";
          }
          
          Random random=new Random();
          String cardno=""+Math.abs((random.nextLong()%90000000L))+50404134L;
          
          String pinno=""+Math.abs((random.nextLong()%9000L)+1000L);
          
          String facility="";
          if(a1.isSelected())
          {
              facility=facility+" ATM CARD";
          }
          else if(a2.isSelected())
          {
              facility=facility+" INTERNET BANKING";
          }
          else if(a3.isSelected())
          {
              facility=facility+" MOBILE BANKING";
          }
          else if(a4.isSelected())
          {
              facility=facility +" EMAIL & SMS ALERT";
          }
          else if(a5.isSelected())
          {
              facility=facility+" EMAIL & SMS ALERT";
          }
          else if(a5.isSelected())
          {
              facility=facility+" E-STATEMENT";
          }
          
           try
       {
         if(accountType.equals(""))
         {
             JOptionPane.showMessageDialog(null,"Account Type is Required");
         }
         
         else
         {
           conn c=new conn(); 
           String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardno+"','"+pinno+"','"+facility+"')";
           String query2="insert into login values('"+formno+"','"+cardno+"','"+pinno+"')";
           c.s.execute(query1);
           c.s.execute(query2);
           
           JOptionPane.showMessageDialog(null,"Card Number: "+cardno +"\nPIN:"+pinno+"\n SAVE IT FOR FUTURE REFERENCE");
           setVisible(false);
           new deposit(pinno).setVisible(true);
             
         }
       }    
       
       catch(Exception e)
       {
           System.out.println(e);
       }
       }
       
       
       
       else if(ae.getSource()==cancel)
               {
                    
                 setVisible(false);
                 new Login().setVisible(true);
               }
   }
    
    public static void main(String[] args)
    {
       new SignupThree("");
    }
    
}
