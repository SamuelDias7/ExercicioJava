package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercicio1 {
	JLabel l1,l2,l3;
	JTextField c1;
	JPasswordField s1;
	JButton b1;
		
	public Exercicio1() { 
		
		JFrame frame = new JFrame("TELA DE LOGIN");
		frame.setLayout(null);

		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		l1 = new JLabel("Usuario:");
		l2 = new JLabel("Senha:");
		l3 = new JLabel("INFORME USUARIO/SENHA");
		
		c1 = new JTextField();
		s1 = new JPasswordField();
		b1 = new JButton("Entrar");		
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(c1);
		frame.add(s1);
		frame.add(b1);
		
		l1.setBounds(50, 120, 150, 30);
		l2.setBounds(50,170,150,30);
		l3.setBounds(50,50,200,30);

		c1.setBounds(100, 120, 200, 30);
		s1.setBounds(100, 170, 200, 30);
		b1.setBounds(120, 230, 150, 30);
		//btn2.setBounds(120, 300, 150, 30);
	
		ActionListener acao = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String c1v = c1.getText();
				String s1v = s1.getText(); 
				
				//Autenticacao
				if(c1v.equals("Samuel") & s1v.equals("123")) {
					frame.setVisible(false);
					new Exercicio2();
					
				}else {
					JOptionPane.showMessageDialog(null, "Dados incorretos");
					c1.setText("");
					s1.setText("");
				
				}
				
			}
			
		};b1.addActionListener(acao);
	}

	public static void main(String[] args) { 
		new Exercicio1();
	}

}
