package pacote;

import java.awt.*;
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
	JPanel painelimg;
	JPanel painel;
	String nomeV;
	String idadeV;
	
	public Exercicio3(String nome, String idade) {		
		this.nomeV = nome;
		this.idadeV = idade;
		
		this.iniciar();
		this.imagem();
		this.menu();
		this.construindo();
		this.add();
		this.Bound();
		this.acoes();
		}
	public void iniciar() {
		//Criando framea
		painel = new JPanel();
		painel.setLayout(null);
		setTitle("TELA INCIIAL");
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void imagem() {
		ImageIcon img = new ImageIcon(Exercicio3.class.getResource("sejaBemVindo.jpg"));		
		JLabel label = new JLabel(img);		
		painelimg = new JPanel();
		painelimg.setPreferredSize(new Dimension(400,400)); 
		painelimg.setLayout(new GridLayout());
		img.setImage(img.getImage().getScaledInstance(400, 400, 1));
		painelimg.add(label);		
		add(painelimg);
	}
	public void menu() {
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
	}
	public void construindo() {
		l1 = new JLabel("NOME DO USUARIO: " + nomeV);
		l2 = new JLabel("IDADE DO USUARIO: " + idadeV + " ANOS" );
		b1 = new JButton("ALTERAR DADOS");
	}
	public void add() {
		painel.add(l1);
		painel.add(l2);
		painel.add(b1);
	}
	public void Bound() {
		l1.setBounds(50, 50, 300, 30);
		l2.setBounds(50,100,300,30);
		b1.setBounds(120, 230, 150, 30);
	}
	public void acoes() {
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				remove(painelimg);
				revalidate();
				repaint();
				add(painel);
				revalidate();
			}
			
		});
		
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Exercicio1();				
			}
			
		});
	
		item3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
			
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Exercicio2();
			}
			
		});

	}
	
}

