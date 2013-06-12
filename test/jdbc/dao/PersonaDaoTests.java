package jdbc.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import jdbc.model.Persona;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonaDaoTests {

	PersonaDao dao = DaoFactory.getPersonaDao();
	
	@Before
	public void setUp() throws PersistenceException {
		// se borran todas las personas
		
		dao.delete(new Persona(){{setId(1);}});
		
		// se inserta la persona 1
		
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("Cosme");
		persona.setApellido("Fulanito");
		persona.setEdad(42);

		dao.insert(persona);
	}
	
	@After
	public void tearDown() throws PersistenceException {
		// se borran todas las personas
		
		dao.delete(new Persona(){{setId(1);}});

	}
	
	@Test
	public void testQueSePuedeBuscarUnaPersona() throws PersistenceException {
		
		Persona personaEncontrada = dao.findById(1);
		
		assertNotNull("la persona con id 1 debe existir", personaEncontrada);
		assertEquals("la persona 1 tiene nombre: Cosme", "Cosme", personaEncontrada.getNombre());
		assertEquals("la persona 1 tiene apellido: Fulanito", "Fulanito", personaEncontrada.getApellido());
		assertEquals("la persona 1 tiene edad: 42", 42, (int)personaEncontrada.getEdad());
		
	}
	
}
