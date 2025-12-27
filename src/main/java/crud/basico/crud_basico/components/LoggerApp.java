package crud.basico.crud_basico.components;

import org.springframework.stereotype.Component;

import crud.basico.crud_basico.config.AppConfig;
import jakarta.annotation.PostConstruct;

@Component
public class LoggerApp {

    private AppConfig appConfig;

    public LoggerApp(AppConfig appConfig) {

        this.appConfig = appConfig;
    }


    @PostConstruct
    public void init() {
        System.out.println("-----------------------------");
        System.out.println("Aplicación: " + this.appConfig.getName() + ", " + "arrancada correctamente");
        System.out.println("-----------------------------");
    }

}
