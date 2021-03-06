
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements ERInterface {
	
	
	 public String add(EInterface E) throws SQLException
	{
		 String msg="";
		 // verifier format email , existance du l'email et du matricule
		  if(E.getEmail() == null || E.getEmail().length() == 0)
		    {
		    	msg= "email faux";
		    }
		    
		    if (Exists(E.getMatricule()))
		    {
		      msg= "etudiant exist deja";
		    }
		    
			if (Exists(E.getEmail()))
		    {
		        msg="etudiant exist deja";
		    }
			
       
		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn();

		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			msg="log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule();}
			else if (rs == 0){
			msg="log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule();
			}
		connect.close();
		
	return msg; 
	 }


	public boolean Exists(String email) throws SQLException	
	{
		DBConnection BD= DBConnection.getInstance(); 
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException	
	{
		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		return false;
	}

}
