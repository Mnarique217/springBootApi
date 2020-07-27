package cr.ac.una.springBootAPI.repository;

import cr.ac.una.springBootAPI.entity.Telefono;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonoRepository extends CrudRepository<Telefono, Long> {

}
