
public class Universite implements UInterface {

 private int i_univ; //identifiant unique de l'université
 private String nom;
 private TypePackage pack;
 public TypePackage p;
 
	public Universite(int i_univ, String nom, TypePackage pack) {
	super();
	this.i_univ = i_univ;
	this.nom = nom;
	this.pack = pack;
}
	public int getI_univ() {
		return i_univ;
	}
	public void setI_univ(int i_univ) {
		this.i_univ = i_univ;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public TypePackage getPack() {
		return pack;
	}
	public void setPack(TypePackage pack) {
		this.pack = pack;
	}
	//initialisation de NbLivreMensuel
    public Etudiant NbLivreMensuel(Etudiant E) {
	 if (getPack() == TypePackage.Standard)
    {
         E.setNbLivreMensuel_Autorise(10);
    }
    else if (getPack() == TypePackage.Premium)
    {
     	 E.setNbLivreMensuel_Autorise(10*2);
    }
	 return E; 
 

    }
	@Override
	public EInterface NbLivreMensuel(EInterface stud) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
