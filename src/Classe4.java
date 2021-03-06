import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Classe4 implements IJournal {
	public void outPut_Msg(String msg) throws IOException  {
		//affichage sur l'ecran
				System.out.println(msg);
		//affichage sur un ficher
				File fichier =new File("classe2.txt");
				FileWriter fw = new FileWriter(fichier);
				PrintWriter pw = new PrintWriter(fw);
				pw.print(msg);
				pw.close();	
		//affichage avec la date 		
				DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(msg +"la date :"+format.format(date)+"generé par la 3eme classe");
						
	}

}
