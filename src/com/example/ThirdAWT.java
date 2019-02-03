package com.example;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;

public class ThirdAWT {
	TextField tf;
	ThirdAWT()
	{
		Frame f=new Frame();
		f.setTitle("Button Example");
		tf=new TextField();
		tf.setBounds(150,80,100,30);
		
		Button b=new Button("Push to see!");
		b.setBounds(150,120,100,30);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Bitches");
			}
		});
		
		f.add(tf);
		f.add(b);
		f.setLayout(null);
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new ThirdAWT();
	}
}
