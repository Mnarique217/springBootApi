package cr.ac.una.springBootAPI.repository;

import cr.ac.una.springBootAPI.entity.Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Long> {

}
