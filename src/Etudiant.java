import java.io.IOException;
import java.sql.SQLException;

public class Etudiant implements EInterface{

		private int matricule;
	    private String nom;
	    private String prenom;
	    private String email ;
	    private String pwd;
	    private int nbLivreMensuel_Autorise;
	    private int nbLivreEmprunte;
	    private int id_universite;
	   
	    
	    
		public Etudiant(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
			
			this.matricule = matricule;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.pwd = pwd;
			this.id_universite = id_universite;
		}
		public void Bonus(UniversiteRepository u) throws SQLException, IOException{
			 UInterface I1=u.GetById(id_universite);
			if(I1.getPack()==TypePackage.Standard)
					{
				setNbLivreMensuel_Autorise(getNbLivreMensuel_Autorise()+5);
					}
			else if(I1.getPack()==TypePackage.Premium)
			{
		setNbLivreMensuel_Autorise(getNbLivreMensuel_Autorise()+10);
			}
		}
		public int getMatricule() {
			return matricule;
		}


		public void setMatricule(int matricule) {
			this.matricule = matricule;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getEmail() {
			 if(email == null || email.length() == 0)
			    {
			    	return "email faux";
			    }
			 else
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getNbLivreMensuel_Autorise() {
			return nbLivreMensuel_Autorise;
		}


		public void setNbLivreMensuel_Autorise(int nbLivreMensuel_Autorise) {
			this.nbLivreMensuel_Autorise = nbLivreMensuel_Autorise;
		}


		public int getNbLivreEmprunte() {
			return nbLivreEmprunte;
		}


		public void setNbLivreEmprunte(int nbLivreEmprunte) {
			this.nbLivreEmprunte = nbLivreEmprunte;
		}


		public int getId_universite() {
			return id_universite;
		}


		public void setId_universite(int id_universite) {
			this.id_universite = id_universite;
		}


		public String getPwd() {
			return pwd;
		}


		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		
	 
		
	    }
