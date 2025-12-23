package crud.basico.crud_basico.crud.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import crud.basico.crud_basico.crud.dtos.CreatePersonalDTO;
import crud.basico.crud_basico.crud.dtos.UpdatePersonalDTO;
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
    public PersonalEntity createPersonal(@Valid @RequestBody CreatePersonalDTO data) {
        return this.personalService.createPersonal(data);
    }

    @PutMapping("/crud/{id}")
    public PersonalEntity updatePersonal(@Valid @RequestBody UpdatePersonalDTO data, @PathVariable Long id) {
        return this.personalService.updatePersonal(id, data);
    }

    @DeleteMapping("/crud/{id}")
    public void deletePersonal(@PathVariable Long id) {
        this.personalService.deletePersonal(id);
    }

}
