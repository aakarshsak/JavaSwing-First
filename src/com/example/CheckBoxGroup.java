package com.example;

import java.awt.event.*;
import java.awt.*;

public class CheckBoxGroup extends Frame{

	private static final long serialVersionUID = 1L;

	CheckboxGroup cbg;
	Checkbox c1,c2;
	Label l;
	CheckBoxGroup()
	{
		l=new Label();
		l.setAlignment(Label.CENTER);
		l.setSize(400, 400);

		cbg=new CheckboxGroup();
		
		c1=new Checkbox("C++",cbg,false);
		c1.setBounds(100,100,50,50);

		c2=new Checkbox("Java",cbg,false);
		c2.setBounds(100,200,50,50);

		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie)
			{
				l.setText("C++ CHECKED");
			}
		});

		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie)
			{
				l.setText("JAVA CHECKED");
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
