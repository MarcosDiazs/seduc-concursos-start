package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.gov.pa.prodepa.treinamentos.concursos.model.Estado;

public class EstadoDao {
	@PersistenceContext
	private EntityManager em;
	public Estado create(Estado estado){
		em.persist(estado);
		return estado;
		
	}
		
	public Estado update(Estado estado){
		em.merge(estado);	
		return estado;
		}
	
	public List<Estado> findAll(){
		
		return em.createQuery("SELECT e FROM Estado e").getResultList();
	}
	
	public List<Estado> search(Estado search){
		
		return null;
	}
	
	public Estado findOne(long id){
		
		return em.find(Estado.class, id);
	}
	
	public void delete(Long id){
		Estado estado = em.find(Estado.class, id);
		
		em.remove(estado);
	}
}
