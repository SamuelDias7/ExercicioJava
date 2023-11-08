package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercicio3 extends JFrame{
	JMenuBar bar;
	JMenu menu;
	JMenuItem item1,item2,item3;
	
	JLabel l1;
	JLabel l2;
	
	JButton b1,b2;
	
	public Exercicio3(String nome, String idade) {		
		
		JPanel painel = new JPanel();
		painel.setLayout(null);
		
		
		//Criando menu
		bar = new JMenuBar();
		menu = new JMenu("MENU");
		item1 = new JMenuItem("Consultar dados");
		item2 = new JMenuItem("Logout");
		item3 = new JMenuItem("Sair");
		bar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		setJMenuBar(bar);
		
		
		l1 = new JLabel("NOME DO USUARIO: " + nome);
		l2 = new JLabel("IDADE DO USUARIO: " + idade + " ANOS" );
		
		b1 = new JButton("ALTERAR DADOS");
		
		painel.add(l1);
		painel.add(l2);
		
		painel.add(b1);
				
		l1.setBounds(50, 50, 300, 30);
		l2.setBounds(50,100,300,30);
		
		b1.setBounds(120, 230, 150, 30);
		
		//Criando framea
		setTitle("TELA INCIIAL");
		//setLayout(null);
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		ActionListener acao = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
	
			add(painel);
			revalidate();


			}
			
		};item1.addActionListener(acao);
		
		ActionListener acao2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				new Exercicio1();
			}
			
		};item2.addActionListener(acao2);
		
		
		
		ActionListener acao3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); 
				
			}
			
		};item3.addActionListener(acao3);
		
		ActionListener acao4 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				new Exercicio2();
				
			}
			
		};b1.addActionListener(acao4);

		
		
		
		}

}

