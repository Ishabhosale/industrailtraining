package com.sswp.travel;




		import java.awt.Color;
		import java.awt.Container;
		import java.awt.Font;
		import java.awt.Image;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import javax.swing.*;

		public class PaymentPage extends JFrame{
		    
		    public PaymentPage(){
		        
		        setLayout(null);
		        setBounds(600, 220, 800, 600);
		        setLocation(300, 100);
		        
		        JLabel label=new JLabel("Pay the Payment");
		        label.setFont(new Font("Raleway", Font.BOLD, 40));
		        label.setBounds(50, 20, 350, 45);
		        add(label);
		        
		        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/paymentpgpinterest.jpeg"));
		        Image i8 = i7.getImage().getScaledInstance(1295, 700, Image.SCALE_DEFAULT);
		        
		       
		        ImageIcon i9 = new ImageIcon(i8);
		        JLabel l4 = new JLabel(i9);
		        l4.setBounds(0, 150, 1295, 700);
		        add(l4);
		        
		        JButton pay = new JButton("Pay");
		        pay.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                JOptionPane.showMessageDialog(null, "Payment Done Successfully");
		            }
		        });
		        pay.setBounds(420, 20, 80, 40);
		        add(pay);
		    
		        JButton back=new JButton("Back");
		        back.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                setVisible(false);
		            }
		        });
		        back.setBounds(510, 20, 80, 40);
		        add(back);
		        
		        getContentPane().setBackground(Color.pink);
		        setVisible(true);

		    }

		    public static void main(String[] args){
		        new PaymentPage().setVisible(true);
		    }
		    
		}
	


