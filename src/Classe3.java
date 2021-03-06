import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Classe3 implements IJournal {
	
	public void outPut_Msg(String msg) {
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(msg +"la date :"+format.format(date)+"generé par la 3eme classe");
		
	}
}
