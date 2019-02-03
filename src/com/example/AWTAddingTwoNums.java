package com.example;

import java.awt.*;
import java.awt.event.*;
public class AWTAddingTwoNums extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	TextField tf1,tf2;
	Label l;
	Button b1,b2;
	
	AWTAddingTwoNums()
	{
		tf1=new TextField();
		tf1.setBounds(100,100,100,30);
		
		tf2=new TextField();
		tf2.setBounds(100,200,100,30);
		
		l=new Label();
		l.setBounds(100,300,100,30);
		
		b1=new Button("+");
		b1.setBounds(100,400,50,30);
		
		b2=new Button("-");
		b2.setBounds(150,400,50,30);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
			
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		add(b1);
		add(b2);
		add(l);
		add(tf1);
		add(tf2);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			String t1=tf1.getText();
			String t2=tf2.getText();
			int a=Integer.parseInt(t1);
			int b=Integer.parseInt(t2);
			int c=0;
			if(e.getSource()==b1)
			{
				c=a+b;
			}
			else if(e.getSource()==b2)
			{
				c=a-b;
			}
			l.setText(String.valueOf(c));
		}
		catch(Exception ex) {System.out.println(e);}
	}
	public static void main(String[] args) {
		new AWTAddingTwoNums();
	}
	
}
