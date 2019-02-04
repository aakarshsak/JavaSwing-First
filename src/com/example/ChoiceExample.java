package com.example;

import java.awt.*;
import java.awt.event.*;
public class ChoiceExample extends Frame{
	
	private static final long serialVersionUID = 1L;
	
	
	Choice c;
	Button b;
	Label l;
	ChoiceExample()
	{
		l=new Label();
		l.setBounds(100,30,400,30 );
		
		b=new Button("Submit");
		b.setBounds(100,200,100,30);
		
		c=new Choice();
		c.setBounds(100,100,100,30);
		c.add("C++");
		c.add("Java");
		c.add("PHP");
		c.add("JS");
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String str="Programming Language : "+c.getItem(c.getSelectedIndex());
				l.setText(str);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		add(c);
		add(b);
		add(l);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChoiceExample();
	}
}
