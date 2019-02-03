package com.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class SecondAWT extends Frame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	
	Button b;
	TextField tf;


	private static Scanner sc;
	SecondAWT()
	{
		 tf=new TextField();
		 tf.setBounds(30, 100, 80, 30);
		 
		 b=new Button("Click me");
		 b.setBounds(30,200,80,30);
		 
		 
		 add(b);
		 add(tf);
		 
		 setSize(300,300);
		 setLayout(null);
		 setVisible(true);
		 
	}
	public void onCallingWithinClass()
	{
		b.addActionListener(this);
	}
	
	public void onCallingAnonymousClass()
	{
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Welcome 3");
			}
		});

	}
	public void onCallingOuterClass()
	{
		Outer o=new Outer(this);
		b.addActionListener(o);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome 1");
	}
	
	
	public static void main(String[] args) {
		SecondAWT sa=new SecondAWT();
		sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:sa.onCallingWithinClass();break;
			case 2:sa.onCallingOuterClass();break;
			case 3:sa.onCallingAnonymousClass();break;
		}
	}
}


class Outer implements ActionListener
{
	SecondAWT sa;
	Outer(SecondAWT sa)
	{
		this.sa=sa;
	}
	public void actionPerformed(ActionEvent e)
	{
		sa.tf.setText("Welcome 2");
	}
}
