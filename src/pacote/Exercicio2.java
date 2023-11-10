package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercicio2{
	JLabel l1,l2,l3,l4;
	JTextField c1,c2;
	JButton b1;
	JFrame frame;
	JPanel painel;
	
	public Exercicio2() { 
		this.inicar();
		this.construindo();
		this.add();
		this.bounds();
		this.acoes();
	}
	public void inicar() {
		frame = new JFrame("PESQUISA");
		painel = new JPanel();
		painel.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(painel);
	}
	public void construindo() {
		l1 = new JLabel("Nome:");
		l2 = new JLabel("Idade:");
		l3 = new JLabel("anos");
		l4 = new JLabel("ENVIE SEUS DADOS");
		c1 = new JTextField();
		c2 = new JTextField();
		b1 = new JButton("Enviar");		
	}
	public void add() {
		painel.add(l1);
		painel.add(l2);
		painel.add(l3);
		painel.add(l4);
		painel.add(c1);
		painel.add(c2);
		painel.add(b1);
	}
	public void bounds() {
		l1.setBounds(50, 120, 150, 30);
		l2.setBounds(50,170,150,30);
		l3.setBounds(205,170,150,30);
		l4.setBounds(50,170,150,30);
		l4.setBounds(50,50,150,30);
		c1.setBounds(100, 120, 200, 30);
		c2.setBounds(100, 170, 100, 30);
		b1.setBounds(120, 230, 150, 30);
	}
	public void acoes() {
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String c1aa = c1.getText();
				String c2aa = c2.getText();
								
				frame.setVisible(false);
				new Exercicio3(c1aa,c2aa);	
			}
			
		});
		
	}
	
}
