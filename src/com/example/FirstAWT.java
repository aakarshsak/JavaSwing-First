package com.example;

import java.awt.*;

public class FirstAWT extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FirstAWT()
	{
		Button b=new Button("Click me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FirstAWT();
		
	}
}
