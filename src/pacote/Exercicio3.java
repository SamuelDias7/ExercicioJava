package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercicio3 extends JFrame{
	JMenuBar bar;
	JMenu menu;
	JMenuItem item1,item2;
	
	public Exercicio3(String nome, String idade) {		
		
		bar = new JMenuBar();
		menu = new JMenu("MENU");
		item1 = new JMenuItem("Consultar dados");
		item2 = new JMenuItem("Sair");
		bar.add(menu);
		menu.add(item1);
		menu.add(item2);
		
		setJMenuBar(bar);
		
		setTitle("TELA INCIIAL");
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ActionListener acao = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n"  + "Idade: " + idade + " anos");
				
			}
			
		};item1.addActionListener(acao);
		
		
		
		ActionListener acao2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0); 
				
			}
			
		};item2.addActionListener(acao2);

		
		
		
		}

}
