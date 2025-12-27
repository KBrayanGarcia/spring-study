package crud.basico.crud_basico.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@Validated
public class DataSourceConfig {
    @NotBlank(message = "La URL de la fuente de datos es obligatoria en el .env")
    private String url;
    @NotBlank(message = "El driver de la fuente de datos es obligatorio en el .env")
    private String driverClassName;

    @NotBlank(message = "El nombre de usuario de la fuente de datos es obligatorio en el .env")
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
