package com.example;
import java.awt.*;
import java.awt.event.*;
public class FourthAWT {
	
	TextField tf;Button b;Label l;
	FourthAWT()
	{
		Frame f=new Frame("Finding IP");
		
		b=new Button("Get IP");
		b.setBounds(100,100,100,30);
		
		tf=new TextField();
		tf.setBounds(100,50,100,30);
		
		l=new Label();
		l.setBounds(100,150,800,30);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					String host=tf.getText();
					String ip=java.net.InetAddress.getByName(host).getHostAddress();
					l.setText("Ip of host "+host+" is "+ip);
					
				} 
				catch (Exception e2) {System.out.println(e);}
					// TODO: handle exception
			}
		});
		
		f.add(l);f.add(tf);f.add(b);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new FourthAWT();
	}
}
