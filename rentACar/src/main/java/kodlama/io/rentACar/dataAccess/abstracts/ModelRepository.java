package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.model.Model;

public interface ModelRepository extends JpaRepository<Model,Integer>{

	boolean existsByName(String name);
	
}
