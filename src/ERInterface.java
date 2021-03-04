import java.sql.SQLException;

public interface ERInterface {
	public boolean Exists(String email) throws SQLException;
	public boolean Exists(int mat) throws SQLException	;
	public void add(EInterface stud) throws SQLException;

}
