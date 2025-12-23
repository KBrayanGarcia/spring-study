package crud.basico.crud_basico.crud.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CreatePersonalDTO {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotBlank(message = "El primer apellido no puede estar vacio")
    private String primerApellido;

    @Min(value = 0, message = "La edad debe ser un número positivo")
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
