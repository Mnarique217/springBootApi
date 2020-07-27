package cr.ac.una.springBootAPI.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Telefono")
public class Telefono implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Persona persona;
    private String numero;

    public Telefono() {
        persona = new Persona();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
