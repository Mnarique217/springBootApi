package cr.ac.una.springBootAPI.api;

import cr.ac.una.springBootAPI.entity.Direccion;
import cr.ac.una.springBootAPI.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/direcciones")
public class DireccionRest {

    @Autowired
    private DireccionRepository direccionRepository;

    @GetMapping
    public ResponseEntity<Iterable<Direccion>> findAll(){
        return ResponseEntity.ok(direccionRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Direccion> create(@RequestBody Direccion direccion){
        return ResponseEntity.ok(direccionRepository.save(direccion));
    }

    @PutMapping
    public ResponseEntity<Direccion> update(@RequestBody Direccion direccion){
        if(!direccionRepository.findById(direccion.getId()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(direccionRepository.save(direccion));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id){
        if(!direccionRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        direccionRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Direccion> findById(@PathVariable Long id){
        if(!direccionRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(direccionRepository.findById(id).get());
    }
}
