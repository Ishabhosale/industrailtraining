package com.sswp.travel;

//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
////
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//
//
//import javax.swing.*;
//
//public class Homepage extends JFrame implements ActionListener {
//	JMenuItem mj7;
//	JMenuItem mj8;
//	String username;
//	
//
//	public static void main(String[] args) {//	// TODO Auto-generated method stub
//		new Homepage("").setVisible(true);
//
//	}
////public Homepage(String username) {
//		super("Travel and Tourism Management System");
//		this.username = username;
//////
//	setForeground(Color.CYAN);//		setLayout(null);//	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpeg"));//		Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);//	ImageIcon i3 = new ImageIcon(i2);
//		JLabel NewLabel = new JLabel(i3);
//	NewLabel.setBounds(0, 0, 1950, 1000);
//		add(NewLabel);
//////
//	JLabel l1 = new JLabel("Travel and Tourism Management System");
//	l1.setForeground(Color.BLACK);
//	l1.setFont(new Font("Forte", Font.PLAIN, 55));
//	l1.setBounds(400, 60, 1050, 100);
//	NewLabel.add(l1);
//	JMenuBar menuBar = new JMenuBar();
//	setJMenuBar(menuBar);
//
//		// customer
//		JMenu m1 = new JMenu("CUSTOMER");
//		m1.setForeground(Color.BLACK);
//		menuBar.add(m1);
//
//		JMenuItem mi1 = new JMenuItem("ADD CUSTOMER");
//		m1.add(mi1);
//		mi1.addActionListener(this);
//
//		JMenuItem mi2 = new JMenuItem("UPDATE CUSTOMER DETAIL");
//		m1.add(mi2);
//		mi2.addActionListener(this);
//		
//		JMenuItem mi3 = new JMenuItem("VIEW CUSTOMER DETAILS");
//		m1.add(mi3);
//		mi3.addActionListener(this);
//
//		JMenuItem mi4 = new JMenuItem("DELETE CUSTOMER DETAILS");
//		m1.add(mi4);
//		mi4.addActionListener(this);
//
//		// package
//		JMenu m2 = new JMenu("PACKAGE");
//		m2.setForeground(Color.BLACK);
//		menuBar.add(m2);
//
//		JMenuItem mj1 = new JMenuItem("check package ");
//		m2.add(mj1);
//		mj1.addActionListener(this);
//
//		JMenuItem mj2 = new JMenuItem("view package");
//		m2.add(mj2);
//		mj2.addActionListener(this);
//
//		JMenuItem mj3 = new JMenuItem("Book package");
//		m2.add(mj3);
//		mj3.addActionListener(this);
//
//		// Hotel
//		JMenu m3 = new JMenu("HOTELS");
//		m3.setForeground(Color.BLACK);
//		menuBar.add(m3);
//
//		JMenuItem mj4 = new JMenuItem("Book Hotels ");
//		m3.add(mj4);
//		mj4.addActionListener(this);
//
//		JMenuItem mj5 = new JMenuItem("view Hotel");
//		m3.add(mj5);
//
//		JMenuItem mj6 = new JMenuItem("View Booked Hotel");
//		m3.add(mj6);
//		mj6.addActionListener(this);
//
//		// Payments
//		JMenu m4 = new JMenu("PAYMENTS");
//		m4.setForeground(Color.BLACK);
//		menuBar.add(m4);
//
//		JMenuItem mj7 = new JMenuItem("pay the Payment");
//		m4.add(mj7);
//		mj7.addActionListener(this);
//
//		// ABOUT
//		JMenu m5 = new JMenu("ABOUT");
//		m5.setForeground(Color.BLACK);
//
//		JMenuItem mj8 = new JMenuItem("About");
//		m5.add(mj8);
//		mj8.addActionListener(this);
//
//		menuBar.add(m5);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setVisible(true);
//		getContentPane().setBackground(Color.BLACK);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if (e.getActionCommand() == "About") {
//			// setVisible(false);
//			new AboutPage().setVisible(true);
//
//		} else if (e.getActionCommand() == "pay the Payment") {
//			// setVisible(false);
//			new PaymentPage().setVisible(true);
//		}
//
//		else if (e.getActionCommand() == "ADD CUSTOMER") {
//			// setVisible(false);
//			new AddCustomer(username).setVisible(true);
//		} else if (e.getActionCommand() == "VIEW CUSTOMER DETAILS") {
//			// setVisible(false);
//			new ViewCustomer().setVisible(true);
//
//		}
//		
//		else if (e.getActionCommand() == "DELETE CUSTOMER DETAILS") {
//			// setVisible(false);
//			new DeleteCustomer().setVisible(true);
//		}
//
//		else if (e.getActionCommand() == "UPDATE CUSTOMER DETAIL") {
//				setVisible(false);
//				new UpdateCustomer(username).setVisible(true);
//
//		}
//
//		else if (e.getActionCommand() == "check package") {
//			// setVisible(false);
//			new CheckPackage().setVisible(true);
//		}
//
//		
//		else if (e.getActionCommand() == "view package") {
//			// setVisible(false);ViewPackage
//			new ViewPackage( username).setVisible(true);
//		}
//		else if (e.getActionCommand() == "Book package") {
//			// setVisible(false);
//			new BookPackage(username).setVisible(true);
//		}
//		
//	else if (e.getActionCommand() == "view Hotel") {
//		// setVisible(false);
//	new ViewHotels().setVisible(true);
//	}
//		
//	else if (e.getActionCommand() == "Book Hotels") {
//		// setVisible(false);
//		new BookHotels( username).setVisible(true);
//	}
//		
//		else if (e.getActionCommand() == "View Booked Hotel") {
//			// setVisible(false);
//			new ViewBookedHotels1( username).setVisible(true);
//		}
//
//	}
//
//}
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Homepage extends JFrame implements ActionListener {
	JMenuItem ml1;
	JMenuItem mk9;
	String username;

	public static void main(String[] args) {
		new Homepage("").setVisible(true);
	}

	public Homepage(String username) {
		super("Travel and Tourism Management System");
		this.username = username;
		setForeground(Color.CYAN);
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/homepin.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(1500, 1000, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel NewLabel = new JLabel(i3);
		NewLabel.setBounds(0, 0, 1500, 1000);
		add(NewLabel);

	//1	JLabel l1 = new JLabel("Travel and Tourism Management System");
	//1	l1.setForeground(Color.BLACK);
		//1	l1.setFont(new Font("Elephant", Font.PLAIN, 55));
	
		//1	l1.setBounds(200, 60, 900, 100);
		//1	NewLabel.add(l1);

		// Customer
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu m1 = new JMenu("CUSTOMER");
		m1.setForeground(Color.BLACK);
		menuBar.add(m1);
		// Add customer
		JMenuItem mi1 = new JMenuItem("Add customer");
		m1.add(mi1);
		mi1.addActionListener(this);
		// Update Customer Detail
		JMenuItem mi2 = new JMenuItem("Update Customer Detail");
		m1.add(mi2);
		mi2.addActionListener(this);
		// View customer details
		JMenuItem mi3 = new JMenuItem("View customer details");
		m1.add(mi3);
		mi3.addActionListener(this);
		// Delete customer details
		JMenuItem mi4 = new JMenuItem("Delete customer details");
		m1.add(mi4);
		mi4.addActionListener(this);

		// Package
		JMenu m2 = new JMenu("PACKAGE");
		m2.setForeground(Color.RED);
		menuBar.add(m2);
		// Check package
		JMenuItem mj1 = new JMenuItem("Check package");
		m2.add(mj1);
		mj1.addActionListener(this);
		// View package
		JMenuItem mj2 = new JMenuItem("View package");
		m2.add(mj2);
		mj2.addActionListener(this);
		// Book package
		JMenuItem mj3 = new JMenuItem("Book package");
		m2.add(mj3);
		mj3.addActionListener(this);

		// Hotels
		JMenu m3 = new JMenu("HOTELS");
		m3.setForeground(Color.BLACK);
		menuBar.add(m3);
		// Book hotel
		JMenuItem mk1 = new JMenuItem("Book Hotel");
		m3.add(mk1);
		mk1.addActionListener(this);
		// View hotel
		JMenuItem mK2 = new JMenuItem("View Hotel");
		m3.add(mK2);
		mK2.addActionListener(this);
		// View Booked hotel
		JMenuItem mK3 = new JMenuItem("View Booked Hotel");
		m3.add(mK3);
		mK3.addActionListener(this);

		// Payment
		JMenu m4 = new JMenu("PAYMENT");
		m4.setForeground(Color.RED);
		menuBar.add(m4);
		// Pay the payment
		JMenuItem ml1 = new JMenuItem("Pay the Payment");
		m4.add(ml1);
		ml1.addActionListener(this);

		// About
		JMenu m5 = new JMenu("ABOUT");
		m5.setForeground(Color.BLACK);
		menuBar.add(m5);
		JMenuItem mk9 = new JMenuItem("About");
		m5.add(mk9);
		mk9.addActionListener(this);

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// About
		if (e.getActionCommand() == "About") {
			new AboutPage().setVisible(true);
		}
		// Payment--Pay the payment
		else if (e.getActionCommand() == "Pay the Payment") {
			new PaymentPage().setVisible(true);
		}
		// Customer--Add customer
		else if (e.getActionCommand() == "Add customer") {
			new AddCustomer(username).setVisible(true);
		}
		// Customer--Update customer
		else if (e.getActionCommand() == "Update Customer Detail") {
			new UpdateCustomer(username).setVisible(true);
		}
		// Customer--View customer
		else if (e.getActionCommand() == "View customer details") {
			new ViewCustomer().setVisible(true);
		}

		// Customer--Delete customer
		else if (e.getActionCommand() == "Delete customer details") {
			new DeleteCustomer().setVisible(true);
		}
		// Package--Check package
		else if (e.getActionCommand() == "Check package") {
			new CheckPackage().setVisible(true);
		}
		// Package--View package
		else if (e.getActionCommand() == "View package") {
			new ViewPackage(username).setVisible(true);
		}
		// Package--Book package
		else if (e.getActionCommand() == "Book package") {
			new BookPackage(username).setVisible(true);
		}
		// Hotel--Book hotel
		else if (e.getActionCommand() == "Book Hotel") {
			new BookHotels(username).setVisible(true);
		}
		// Hotel--View hotel
		else if (e.getActionCommand() == "View Hotel") {
			new ViewHotels().setVisible(true);
		}
		// Hotel--View Booked hotel
		else if (e.getActionCommand() == "View Booked Hotel") {
			new ViewBookedHotels1(username).setVisible(true);
		}
	}

}