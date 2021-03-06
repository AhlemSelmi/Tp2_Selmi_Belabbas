import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Classe2 implements IJournal {
	public void outPut_Msg(String msg) throws IOException  {
		//affichage sur un ficher
		File fichier =new File("classe2.txt");
		FileWriter fw = new FileWriter(fichier);
		PrintWriter pw = new PrintWriter(fw);
		pw.print(msg);
		pw.close();
	}

}
