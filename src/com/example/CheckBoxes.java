package com.example;

import java.awt.*;
import java.awt.event.*;

public class CheckBoxes extends Frame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Checkbox c1,c2;
	Label l;
	CheckBoxes()
	{
		l=new Label();
		l.setAlignment(Label.CENTER);
		l.setSize(400, 400);
		
		c1=new Checkbox("C++");
		c1.setBounds(100,100,100,100);
		
		c2=new Checkbox("Java");
		c2.setBounds(100,200,100,100);
		
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie)
			{
				if(ie.getStateChange()==1)
					l.setText("C++ : checked");
				else 
					l.setText("C++ : uncheckd");
			}
		});
		
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie)
			{
				if(ie.getStateChange()==1)
					l.setText("Java : checked");
				else 
					l.setText("Java : uncheckd");
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		add(c1);
		add(c2);
		add(l);
		setSize(800,800);
		setVisible(true);
		setLayout(null);
	}
	
	public static void main(String[] args) {
		new CheckBoxes();
	}
}
