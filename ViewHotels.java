package com.sswp.travel;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewHotels extends JFrame implements Runnable {

	private JPanel contentPane;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
	JLabel caption;
	Thread th;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViewHotels().setVisible(true);

	}

	public ViewHotels() {
		// TODO Auto-generated constructor stub
		/*
		 * setBounds(580, 220, 900, 700); getContentPane().setBackground(new Color(220,
		 * 250, 250));
		 */
			
		setBounds(420, 220, 1100, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnExit = new JButton("Back");
		btnExit.setBounds(450, 600, 120, 30);
		btnExit.setBackground(Color.blue);
		btnExit.setForeground(Color.white);
		contentPane.add(btnExit);

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		th = new Thread(this);

		caption = new JLabel();
		caption.setBounds(50, 550, 1000, 70);
		caption.setForeground(Color.WHITE);
		caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
		add(caption);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel1.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l2 = new JLabel(i3);
		l2.setBounds(0, 0, 900, 700);
		add(l2);

		setLayout(null);

		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel2.jpeg"));
		Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		l3 = new JLabel(i4);
		l3.setBounds(0, 0, 900, 700);
		add(l3);
		l3.setVisible(false);

		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel3.jpeg"));
		Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		l4 = new JLabel(i9);
		l4.setBounds(0, 0, 900, 700);
		add(l4);
		l4.setVisible(false);

		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel4.jpeg"));
		Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		l5 = new JLabel(i12);
		l5.setBounds(0, 0, 900, 700);
		add(l5);
		l5.setVisible(false);

		ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel5.jpeg"));
		Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);
		l6 = new JLabel(i15);
		l6.setBounds(0, 0, 900, 700);
		add(l6);
		l6.setVisible(false);

		ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel6.jpeg"));
		Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i18 = new ImageIcon(i17);
		l7 = new JLabel(i18);
		l7.setBounds(0, 0, 900, 700);
		add(l7);
		l7.setVisible(false);

		ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel7.jpeg"));
		Image i20 = i19.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i21 = new ImageIcon(i20);
		l8 = new JLabel(i21);
		l8.setBounds(0, 0, 900, 700);
		add(l8);
		l8.setVisible(false);

		ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel8.jpeg"));
		Image i23 = i22.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i24 = new ImageIcon(i23);
		l9 = new JLabel(i24);
		l9.setBounds(0, 0, 900, 700);
		add(l9);
		l9.setVisible(false);

		ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel9.jpeg"));
		Image i26 = i25.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i27 = new ImageIcon(i26);
		l10 = new JLabel(i27);
		l10.setBounds(0, 0, 900, 700);
		add(l10);
		l10.setVisible(false);

		ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/viewhotel10.jpeg"));
		Image i29 = i28.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
		ImageIcon i30 = new ImageIcon(i29);
		l11 = new JLabel(i30);
		l11.setBounds(0, 0, 900, 700);
		add(l11);
		l11.setVisible(false);

		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			l2.setVisible(true);
			caption.setText("JW Marriott Hotel");
			l2.add(caption);
			Thread.sleep(2800);
			l2.setVisible(false);
			l3.setVisible(true);
			caption.setText("Mandarin Oriental Hotel");
			l3.add(caption);
			l3.setVisible(true);
			l3.setVisible(false);
            l4.setVisible(true);
            caption.setText("Four Seasons Hotel");
            l4.add(caption);
            Thread.sleep(2800);
            l4.setVisible(false);
            l5.setVisible(true);
            caption.setText("Radisson Hotel");
            l5.add(caption);
            Thread.sleep(2800);
            l5.setVisible(false);
            l6.setVisible(true);
            caption.setText("Classio Hotel");
            l6.add(caption);
            Thread.sleep(2800);
            l6.setVisible(false);
            l7.setVisible(true);
            caption.setText("The Bay Club Hotel");
            l7.add(caption);
            Thread.sleep(2800);
            l7.setVisible(false);
            l8.setVisible(true);
            caption.setText("Breeze Blows Hotel");
            l8.add(caption);
            Thread.sleep(2800);
            l8.setVisible(false);
            l9.setVisible(true);
            caption.setText("Quick Stop Hotel");
            l9.add(caption);
            Thread.sleep(2800);
            l9.setVisible(false);
            l10.setVisible(true);
            caption.setText("Happy Mornings Motel");
            l10.add(caption);
            Thread.sleep(2800);
            l10.setVisible(false);
            l11.setVisible(true);
            caption.setText("Moss View Hotel");
            l11.add(caption);
            Thread.sleep(2800);
            l11.setVisible(false);
            
            this.setVisible(false);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}