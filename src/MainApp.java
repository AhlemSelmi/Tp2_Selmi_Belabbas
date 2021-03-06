import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ESInterface serv=new EtudiantService();
		try {
			String msg =serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			IJournal c1= new Classe1();
			IJournal c2= new Classe2();
			IJournal c3= new Classe3();
			IJournal c4= new Classe4();
			c1.outPut_Msg(msg);
			c2.outPut_Msg(msg);
			c3.outPut_Msg(msg);
			c4.outPut_Msg(msg);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
