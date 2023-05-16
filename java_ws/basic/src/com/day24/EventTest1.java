package com.day24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends Frame {
	private Button btClose;
	
	public EventTest1() {
		btClose = new Button("Close");
		this.add(btClose, "South");
		//이벤트 연출
		btClose.addActionListener(new EventHandler());
		
	}
	//생성자
	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
		f.setSize(200, 300);
		f.setVisible(true);
	}

}
