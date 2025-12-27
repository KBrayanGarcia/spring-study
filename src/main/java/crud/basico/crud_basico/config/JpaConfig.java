package crud.basico.crud_basico.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "spring.jpa")
@Validated
public class JpaConfig {
    @NotNull(message = "La configuración para mostrar las consultas SQL es obligatoria en el .env")
    private boolean showSql;

    public boolean isShowSql() {
        return showSql;
    }

    public void setShowSql(boolean showSql) {
        this.showSql = showSql;
    }
}
