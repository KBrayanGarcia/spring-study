package crud.basico.crud_basico.crud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class PersonalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El primer apellido no puede estar vacio")
    private String primer_apellido;

    private String segundo_apellido;
    
    @NotNull(message = "La edad es obligatoria")
    @Min(value = 0 , message = "La edad minima es 0") 
    private Integer edad;

    public PersonalEntity() {
    }

    public PersonalEntity(String nombre, String primer_apellido, Integer edad) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.edad = edad;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPrimerApellido() {
        return this.primer_apellido;
    }

    public String getSegundoApellido() {
        return this.segundo_apellido;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public void setPrimerApellido(String value) {
        this.primer_apellido = value;
    }

    public void setSegundoApellido(String value) {
        this.segundo_apellido = value;
    }

    public void setEdad(Integer value) {
        this.edad = value;
    }

}
