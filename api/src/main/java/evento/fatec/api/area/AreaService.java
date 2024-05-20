package evento.fatec.api.area;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class AreaService {
	@Autowired
	private  AreaRepository repository;
	
	public List<Area> getAllArea() {
		return repository.findAll(Sort.by("descricao").ascending());
	}
	
	public Area getAreaById (Long id) {
		return  repository.getReferenceById(id);
	}
}
