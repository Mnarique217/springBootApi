package cr.ac.una.springBootAPI.repository;
import cr.ac.una.springBootAPI.entity.Persona;
import org.springframework.data.repository.CrudRepository;
public interface PersonaRepository  extends CrudRepository <Persona, Long>{
}