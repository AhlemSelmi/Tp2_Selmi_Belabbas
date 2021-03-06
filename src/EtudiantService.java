
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService implements ESInterface{
	
	
	public String inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException	
	{
		ERInterface StudRep= new EtudiantRepository();
	    URInterface UnivRep= new UniversiteRepository();
	    EInterface stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    UInterface univ=UnivRep.GetById(id_universite);
	    
	    //classe1 c1= new classe1();          
		   String  msg1="Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule;
		  //c1.outPut_Msg(msg1);
	    
	    if(email == null || email.length() == 0)
	    {
	    	return "email faux";
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return  "etudiant exist deja";
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return  "etudiant exist deja";
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 String aff =StudRep.add(stud);
         String msg2="Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule;
		// c1.outPut_Msg(msg2);
		 return msg1+aff+msg2;
	    
		
	}
	
	
	

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


	
}
