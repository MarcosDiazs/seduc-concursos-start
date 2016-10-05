package br.gov.pa.prodepa.treinamentos.concursos.service;

import java.util.List;
import br.gov.pa.prodepa.treinamentos.concursos.model.Estado;
import dao.EstadoDao;

public class EstadoService {
	@Inject
	private EstadoDao dao;
	public Estado create(Estado estado){
		dao.create(estado);
		return estado;
		
	}
		
	public Estado update(Estado estado){
		dao.update(estado);
		return estado;
		}
	
	public List<Estado> findAll(){
		
		return dao.findAll();
	}
	
	public List<Estado> search(Estado search){
		return dao.search(search);
	}
	
	public Estado findOne(long id){
		
		return dao.findOne(id);
	}
	
	public void delete(Estado estado){
		dao.delete(estado);
	}
}
