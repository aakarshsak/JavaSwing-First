package com.example;

import java.awt.*;
import java.awt.event.*;

public class CanvasExample extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CanvasExample()
	{
		add(new MyCanvas());
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		new CanvasExample();
	}
}

class MyCanvas extends Canvas
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyCanvas()
	{
		setBackground(Color.GREEN);
		setSize(300,300);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(50,50,200,200);
	}
}
