package com.iut.morpion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class SelectionPseudo {

	public JFrame frame;
	public JTextField titre1;
	public JTextArea textArea;
	
	int passe = 0;
	Joueur j = new Joueur("", 0 ,0);
	Joueur j2 = new Joueur("", 0 ,0);
	
	private JButton Jouer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionPseudo window = new SelectionPseudo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SelectionPseudo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		titre1 = new JTextField();
		titre1.setText("Nom du joueur 1?");
		frame.getContentPane().add(titre1, BorderLayout.NORTH);
		titre1.setColumns(10);
		
		JButton btnNewButton = new JButton("Selectionner");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Je creer mes joueur avec les txtFiled

				
				if(passe == 0)
				{
					j.setNom(textArea.getText());
					textArea.setText("");
					titre1.setText("Nom du joueur 2?");
					passe = passe + 1 ;
				}
				else
				{
					j2.setNom(textArea.getText());
					btnNewButton.setEnabled(false);
					Jouer.setEnabled(true);
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		textArea = new JTextArea();
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		Jouer = new JButton("Jouer");
		Jouer.setEnabled(false);
		Jouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SelectionPseudo.this.frame.setVisible(false);
				Morpion m = new Morpion(j, j2);
			}
		});
		frame.getContentPane().add(Jouer, BorderLayout.EAST);
		

	}

}
