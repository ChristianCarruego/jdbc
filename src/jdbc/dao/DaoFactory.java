package jdbc.dao;

public class DaoFactory {
	
	public static PersonaDao getPersonaDao(){
		return PersonaDaoJdbcImpl.getInstance();
	}
	
}
