package crud.basico.crud_basico.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "spring.h2.console")
@Validated
public class H2ConsoleConfig {
    @NotNull(message = "La configuración para habilitar la consola H2 es obligatoria en el .env")
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
