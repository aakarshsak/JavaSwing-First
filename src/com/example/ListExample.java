package com.example;

import java.awt.*;
import java.awt.event.*;

public class ListExample extends Frame{
	
	private static final long serialVersionUID = 1L;
	
	
	Button b;
	List l1,l2;
	Label l;
	
	ListExample()
	{
		l=new Label();
		l.setBounds(100,50,500,30);
		
		
		l1=new List(5);
		l1.setBounds(100,100,300,100);
		l1.add("C++");
		l1.add("JAva");
		l1.add("PHP");
		l1.add("JS");
		l1.add("GO");
		
		
		l2=new List(4,true);	//true means can select multiple items
		l2.setBounds(100,300,300,100);
		l2.add("1");
		l2.add("2");
		l2.add("3");
		l2.add("4");
		
		b=new Button("Show");
		b.setBounds(100,500,100,30);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String data="Programming Language : "+l1.getItem(l1.getSelectedIndex());
				data+="|||FrameWork Selected : ";
				for(String frame:l2.getSelectedItems())
				{
					data=data+frame;
				}
				l.setText(data);
				
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		add(l1);
		add(l2);
		add(l);
		add(b);
		setLayout(null);
		setSize(1200,1200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListExample();
	}
}
