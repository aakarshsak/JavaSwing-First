package com.example;

import java.awt.*;
import java.awt.event.*;

public class MenuEX extends Frame{
	private static final long serialVersionUID = 1L;
	
	
	MenuEX()
	{
		MenuBar mb=new MenuBar();
		Menu menu=new Menu("Menu");
		Menu submenu=new Menu("Submenu");
		MenuItem i1=new MenuItem("MEnu1");
		MenuItem i2=new MenuItem("MEnu1");
		MenuItem i3=new MenuItem("MEnu1");
		MenuItem i4=new MenuItem("MEnu1");
		MenuItem i5=new MenuItem("MEnu1");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);
		submenu.add(i5);
		
		menu.add(submenu);
		mb.add(menu);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		setMenuBar(mb);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MenuEX();
	}
}
