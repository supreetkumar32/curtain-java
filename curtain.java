package projectJava;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class curtain extends JFrame {
	Timer tm1,tm2;
	JButton up,down;
	JPanel panel;
	public curtain()
	{
		super("Timer");
		up=new JButton("up");
		down=new JButton("down");
		up.setBounds(150,400,100,20);
		down.setBounds(260,400,100,20);
		panel=new JPanel();
		panel.setBackground(Color.decode("#3a5795"));
		panel.setBounds(0,0,500,0);
		
		tm1=new Timer(50,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel.getHeight()!=350) {
					up.setEnabled(false);
					down.setEnabled(false);
					panel.setBounds(0,0,500,panel.getHeight()+5);
					if(panel.getHeight()==350) {
						tm1.stop();
						up.setEnabled(true);
						down.setEnabled(true);
						
					}
				}
			}
		});
		
		tm2=new Timer(50,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(panel.getHeight()!=0) {
					up.setEnabled(false);
					down.setEnabled(false);
					panel.setBounds(0,0,500,panel.getHeight()-5);
					if(panel.getHeight()==0) {
						tm2.stop();
						up.setEnabled(true);
						down.setEnabled(true
								);
						
					}
				}
			}
		});
		
		up.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			tm2.start();
			}
		});
		
      down.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			tm1.start();
			}
		});
		
		
		add(up);
		add(down);
		add(panel);
		setLayout(null);
		setSize(500,500);
		getContentPane().setBackground(Color.decode("#bdb76b"));
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new curtain();
	}

}
