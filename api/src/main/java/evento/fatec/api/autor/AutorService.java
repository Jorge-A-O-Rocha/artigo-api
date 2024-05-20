package evento.fatec.api.autor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class AutorService {
	@Autowired
	private  AutorRepository repository;
	
	public List<Autor> getAllAutor() {
		return repository.findAll(Sort.by("nome").ascending());
	}
	
	public Autor getAutorById (Long id) {
		return  repository.getReferenceById(id);
	}
}
