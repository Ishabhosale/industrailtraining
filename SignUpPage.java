package com.sswp.travel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SignUpPage extends JFrame implements ActionListener {
	JRadioButton MaleRB;
	JRadioButton FemaleRB;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	//private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	private JButton b1, b2;
	private JComboBox comboBox;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUpPage().setVisible(true);
	}

	public SignUpPage() {
		setBounds(600, 250, 700, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(null);

		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.DARK_GRAY);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(99, 86, 92, 26);
		contentPane.add(lblUsername);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(99, 123, 92, 26);
		contentPane.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setForeground(Color.DARK_GRAY);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(99, 160, 92, 26);
		contentPane.add(lblGender);


		MaleRB = new JRadioButton("Male");
		MaleRB.setOpaque(false);
		MaleRB.setBackground(Color.WHITE);
		MaleRB.setFont(new Font("Euclid Circular A", Font.PLAIN, 16));
		MaleRB.setBounds(160, 160, 92, 26);
		contentPane.add(MaleRB);

		FemaleRB = new JRadioButton("Female");
		FemaleRB.setOpaque(false);
		FemaleRB.setFont(new Font("Euclid Circular A", Font.PLAIN, 16));
		FemaleRB.setBackground(Color.WHITE);
		FemaleRB.setBounds(220, 160, 92, 26);
		contentPane.add(FemaleRB);

		ButtonGroup group = new ButtonGroup();
		group.add(MaleRB);
		group.add(FemaleRB);

		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(99, 197, 92, 26);
		contentPane.add(lblPassword);

		JLabel lblmobilenumber = new JLabel("mobile number:");
		lblmobilenumber.setForeground(Color.DARK_GRAY);
		lblmobilenumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblmobilenumber.setBounds(99, 234, 92, 26);
		contentPane.add(lblmobilenumber);

		ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/signupinterest.jpeg"));
		Image i1 = c1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);

		JLabel l6 = new JLabel(i2);
		l6.setBounds(460, 70, 200, 200);
		add(l6);

		textField = new JTextField();
		textField.setBounds(265, 91, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(265, 128, 148, 20);
		contentPane.add(textField_1);

		// textField_2 = new JTextField();
		// textField_2.setColumns(10);
		// textField_2.setBounds(265, 165, 148, 20);
		// contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 202, 148, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 239, 148, 20);
		contentPane.add(textField_4);

		b1 = new JButton("Create");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setBounds(140, 289, 100, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		contentPane.add(b1);

		b2 = new JButton("Back");
	 b2.addActionListener(this);
		b2.setFont(new Font("Tahoma", Font.BOLD, 13));
		b2.setBounds(300, 289, 100, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		contentPane.add(b2);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(34, 139, 34));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
		panel.setBounds(31, 30, 640, 310);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

	}

	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				DBConnection c = new DBConnection();
            
				if (e.getSource() == b1) {
					String sql = "insert into usertable(username, email,gender, password,mobileNo) values(?, ?, ?, ?, ?)";
					PreparedStatement st = c.con.prepareStatement(sql);

					st.setString(1, textField.getText());
					st.setString(2, textField_1.getText());
					
					if (MaleRB.isSelected()) {
						st.setString(3, MaleRB.getText());
					}else {
						st.setString(3, FemaleRB.getText());
					}
					st.setString(4, textField_3.getText());
					st.setString(5, textField_4.getText());

					int i = st.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(null, "Account Created Successfully ");
					}

					textField.setText("");
					textField_1.setText("");
					textField_3.setText("");
					textField_4.setText("");
				}
				if (e.getSource() == b2) {
					this.setVisible(false);
					new SignIn().setVisible(true);

				}
			} catch (Exception e1) {
				System.out.println(e1);
			}
		}

}
