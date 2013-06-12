package jdbc.dao;

import java.util.List;

import jdbc.model.Persona;

public interface PersonaDao {

    public void insert(Persona persona) throws PersistenceException;
    
    public void delete(Persona persona) throws PersistenceException;
    
    public void update(Persona persona) throws PersistenceException;
    
    public Persona findById(Integer idPersona) throws PersistenceException;
    
    public List<Persona> findAll() throws PersistenceException;
    
}
