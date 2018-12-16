package com.iut.morpion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Morpion {
	int joueur = 1 ;


	JButton btnNewButton1;
	JButton btnNewButton2;
	JButton btnNewButton3;
	JButton btnNewButton4;
	JButton btnNewButton5;
	JButton btnNewButton6;
	JButton btnNewButton7;
	JButton btnNewButton8;
	JButton btnNewButton9;

	JOptionPane jop1;
	JOptionPane jop2;


	private JFrame frame;
	private JFrame frame1;
	private JTextField Dialogue;
	private JTextField textField;

	Joueur a;
	Joueur b;

	//Test victoire
	public void victoire()
	{
		jop1 = new JOptionPane();

		if (!btnNewButton1.getText().equalsIgnoreCase(" ") && btnNewButton1.getText().equalsIgnoreCase(btnNewButton2.getText()) && btnNewButton1.getText().equalsIgnoreCase(btnNewButton3.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton4.getText().equalsIgnoreCase(" ") && btnNewButton4.getText().equalsIgnoreCase(btnNewButton5.getText()) && btnNewButton4.getText().equalsIgnoreCase(btnNewButton6.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton7.getText().equalsIgnoreCase(" ") && btnNewButton7.getText().equalsIgnoreCase(btnNewButton8.getText()) && btnNewButton7.getText().equalsIgnoreCase(btnNewButton9.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton1.getText().equalsIgnoreCase(" ") && btnNewButton1.getText().equalsIgnoreCase(btnNewButton4.getText()) && btnNewButton1.getText().equalsIgnoreCase(btnNewButton7.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton2.getText().equalsIgnoreCase(" ") && btnNewButton2.getText().equalsIgnoreCase(btnNewButton5.getText()) && btnNewButton2.getText().equalsIgnoreCase(btnNewButton8.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton3.getText().equalsIgnoreCase(" ") && btnNewButton3.getText().equalsIgnoreCase(btnNewButton6.getText()) && btnNewButton3.getText().equalsIgnoreCase(btnNewButton9.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton1.getText().equalsIgnoreCase(" ") && btnNewButton1.getText().equalsIgnoreCase(btnNewButton5.getText()) && btnNewButton1.getText().equalsIgnoreCase(btnNewButton9.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if (!btnNewButton3.getText().equalsIgnoreCase(" ") && btnNewButton3.getText().equalsIgnoreCase(btnNewButton5.getText()) && btnNewButton3.getText().equalsIgnoreCase(btnNewButton7.getText()))
		{
			Joueur joueurGagnant = (btnNewButton1.getText().equalsIgnoreCase("x"))? a : b;
			Joueur joueurPerdant = (!btnNewButton1.getText().equalsIgnoreCase("x"))? b : a;
			if(joueurGagnant == a)
			{
				a.setNbvictoire(a.getNbvictoire() + 1) ;
				joueurPerdant = b;
			}
			else
			{
				b.setNbvictoire(b.getNbvictoire() + 1) ;
				joueurPerdant = a;
			}

			JOptionPane.showMessageDialog(null, joueurGagnant.getNom() +" a gagner! \n Gagner en " + joueurGagnant.getNbcoup() + " coup\n score: \n"+ joueurGagnant.getNbvictoire() + " pour " + joueurGagnant.getNom() + "\n" + joueurPerdant.getNbvictoire() + " pour " + joueurPerdant.getNom() );}
		else if ( a.getNbcoup() == 5 || b.getNbcoup() == 5 )
			JOptionPane.showMessageDialog(null, "Match nul !");
	}




	/**
	 * Create the application.
	 */
	public Morpion(Joueur j, Joueur j2) {
		this.a = j;
		this.b = j2;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		//Indice joueur:

		//Fenêtre jeux
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 390, 152);
		frame.setLocation(800, 400);
		frame.setTitle("Morpion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow][grow]"));


		//Dialogue
		Dialogue = new JTextField();
		frame.getContentPane().add(Dialogue, "cell 3 0,grow");
		Dialogue.setColumns(10);
		Dialogue.setText("Au joueur:" + b.getNom());

		//Boite de saisie
		textField = new JTextField();
		frame.getContentPane().add(textField, "flowx,cell 3 1,growy");
		textField.setColumns(10);

		//BOUTON 1
		btnNewButton1 = new JButton(" ");
		btnNewButton1.addActionListener(btnJeu);
		btnNewButton1.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton1, "cell 0 0,growx");

		//BOUTON 2
		btnNewButton2 = new JButton(" ");
		btnNewButton2.addActionListener(btnJeu);
		btnNewButton2.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton2, "cell 1 0,growx");

		//BOUTON 3
		btnNewButton3 = new JButton(" ");
		btnNewButton3.addActionListener(btnJeu);
		btnNewButton3.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton3, "cell 2 0,growx");

		//BOUTON 4
		btnNewButton4 = new JButton(" ");
		btnNewButton4.addActionListener(btnJeu);
		btnNewButton4.setBackground(new Color(255, 255, 255));
		btnNewButton4.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton4, "cell 0 1,growx");


		//BOUTON 5
		btnNewButton5 = new JButton(" ");
		btnNewButton5.addActionListener(btnJeu);
		btnNewButton5.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton5, "cell 1 1,growx");

		//BOUTON 6
		btnNewButton6 = new JButton(" ");
		btnNewButton6.addActionListener(btnJeu);
		btnNewButton6.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton6, "cell 2 1,growx");

		//BOUTON 7
		btnNewButton7 = new JButton(" ");
		btnNewButton7.addActionListener(btnJeu);
		btnNewButton7.setForeground(Color.BLACK);
		btnNewButton7.setBackground(Color.WHITE);
		frame.getContentPane().add(btnNewButton7, "flowy,cell 0 2,growx");


		//BOUTON 8
		btnNewButton8 = new JButton(" ");
		btnNewButton8.addActionListener(btnJeu);
		btnNewButton8.setForeground(Color.BLACK);
		btnNewButton8.setBackground(Color.WHITE);
		frame.getContentPane().add(btnNewButton8, "cell 1 2,growx");

		//BOUTON 9
		btnNewButton9 = new JButton(" ");
		btnNewButton9.addActionListener(btnJeu);
		btnNewButton9.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton9, "cell 2 2,growx");


		/*JButton btnSelectionJoueur = new JButton("Selection joueur");
		btnSelectionJoueur.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{

				if (joueur == 1)
				{
					a = new Joueur(textField.getText(), 0, 0);
					Dialogue.setText("Le nom du joueur 2?");
					textField.setText("");
					joueur = 2;
				}
				else
				{
					b = new Joueur(textField.getText(), 0, 0);
					textField.setText("");
					btnSelectionJoueur.setEnabled(false);
					Dialogue.setText( "Au tour de:" + a.getNom());
					joueur = 2 ;
				}
			}
		}
				);*/
		//frame.getContentPane().add(btnSelectionJoueur, "flowx,cell 3 2,alignx left,growy");

		JButton btnRejouer = new JButton("Rejouer");
		btnRejouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnNewButton1.setText(" ");
				btnNewButton1.setEnabled(true);

				btnNewButton2.setText(" ");
				btnNewButton2.setEnabled(true);

				btnNewButton3.setText(" ");
				btnNewButton3.setEnabled(true);

				btnNewButton4.setText(" ");
				btnNewButton4.setEnabled(true);

				btnNewButton5.setText(" ");
				btnNewButton5.setEnabled(true);

				btnNewButton6.setText(" ");
				btnNewButton6.setEnabled(true);

				btnNewButton7.setText(" ");
				btnNewButton7.setEnabled(true);

				btnNewButton8.setText(" ");
				btnNewButton8.setEnabled(true);

				btnNewButton9.setText(" ");
				btnNewButton9.setEnabled(true);


				a.setNbcoup(0);
				b.setNbcoup(0);


				//btnSelectionJoueur.setEnabled(true);
			}
		});
		frame.getContentPane().add(btnRejouer, "cell 3 2");




	}

	public JFrame getFrame1() {
		return frame1;
	}




	public void setFrame1(JFrame frame1) {
		this.frame1 = frame1;
	}

	private ActionListener btnJeu = new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) {
			JButton btnJoue = (JButton) e.getSource();
			if ( joueur == 1)
			{
				btnJoue.setText("0");
				Dialogue.setText("Au tour de :"+ a.getNom());
				a.setNbcoup(a.getNbcoup() + 1 ) ;
				//bouton1 = 1;
				joueur = 2;
			}
			else
			{
				btnJoue.setText("X");
				Dialogue.setText("Au tour de :"+ b.getNom());
				b.setNbcoup(b.getNbcoup() + 1 ) ;
				joueur = 1;
				//bouton1 = 2;
			}
			victoire();
			btnJoue.setEnabled(false);
		}
	};	


}
