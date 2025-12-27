package crud.basico.crud_basico.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Configuration
@ConfigurationProperties(prefix = "spring.application")
@Validated
public class AppConfig {
    @NotBlank(message = "El nombre de la aplicación es obligatorio en el .env")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
