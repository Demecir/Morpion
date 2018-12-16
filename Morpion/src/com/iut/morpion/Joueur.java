package com.iut.morpion;

public class Joueur {

		public String nom;
		public int nbCoup;
		public int nbVictoire;
		
		public Joueur (String Nom, int nbcoup, int nbvictoire)
		{
			this.nom = Nom;
			this.nbCoup = nbcoup;
			this.nbVictoire= nbvictoire;
		}
		


		public String getNom()
		{
			return this.nom;
		}

		public void setNom(String nom) 
		{
			this.nom = nom;
		}
		
		public int getNbcoup ()
		{
			return this.nbCoup;
		}

		public void setNbcoup(int Nbcoup) 
		{
			this.nbCoup = Nbcoup;
		}
		
		public int getNbvictoire ()
		{
			return this.nbVictoire;
		}
	
		public void setNbvictoire(int Nbvictoire) 
		{
			this.nbVictoire = Nbvictoire;
		}

}
