import java.sql.SQLException;

public interface URInterface {
	Universite GetById(int universityId) throws SQLException;

}
