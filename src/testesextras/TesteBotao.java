package testesextras;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TesteBotao implements ActionListener{
	JButton bt;
	JButton bt1;
	
	public TesteBotao() {
		
		JFrame frame = new JFrame("Janela Teste");
			frame.setLayout(null);
			frame.setSize(400, 250);
			frame.setLocationRelativeTo(null);
			frame.setResizable(true);
			
			 bt = new JButton("Click");
			 bt1 = new JButton("Sair");
				bt.setBounds(230, 50,70, 25);
				bt.addActionListener(this);
				bt1.setBounds(300,50, 70,25);
				bt1.addActionListener(this);
			
			frame.add(bt);
			frame.add(bt1);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			
		}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== bt) {
			JOptionPane.showMessageDialog(null,"Aprendendo");
		}
		if (e.getSource()== bt1) {
			System.exit(0);
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Teste Commit");
		new TesteBotao();

	}

	

}
