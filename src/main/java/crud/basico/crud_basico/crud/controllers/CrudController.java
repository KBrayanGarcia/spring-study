package crud.basico.crud_basico.crud.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import crud.basico.crud_basico.crud.entities.PersonalEntity;
import crud.basico.crud_basico.crud.services.PersonalService;
import jakarta.validation.Valid;

@RestController
public class CrudController {

    private final PersonalService personalService;

    public CrudController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @GetMapping("/crud")
    public List<PersonalEntity> getAllData() {

        return this.personalService.getAllPersonal();
    }

    @PostMapping("/crud")
    public PersonalEntity savePersonal(@Valid @RequestBody PersonalEntity data) {
        return this.personalService.savePersonal(data);
    }

}
