package cr.ac.una.springBootAPI.api;

import cr.ac.una.springBootAPI.entity.Telefono;
import cr.ac.una.springBootAPI.repository.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/telefonos")
public class TelefonoRest {

    @Autowired
    private TelefonoRepository telefonoRepository;

    @GetMapping
    public ResponseEntity<Iterable<Telefono>> findAll(){
        return ResponseEntity.ok(telefonoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Telefono> create(@RequestBody Telefono telefono){
        return ResponseEntity.ok(telefonoRepository.save(telefono));
    }

    @PutMapping
    public ResponseEntity<Telefono> update(@RequestBody Telefono telefono){
        if(!telefonoRepository.findById(telefono.getId()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(telefonoRepository.save(telefono));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id){
        if(!telefonoRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        telefonoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Telefono> findById(@PathVariable Long id){
        if(!telefonoRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(telefonoRepository.findById(id).get());
    }
}
