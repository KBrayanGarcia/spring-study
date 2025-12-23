package crud.basico.crud_basico.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import crud.basico.crud_basico.crud.dtos.CreatePersonalDTO;
import crud.basico.crud_basico.crud.dtos.UpdatePersonalDTO;
import crud.basico.crud_basico.crud.entities.PersonalEntity;
import crud.basico.crud_basico.crud.repository.PersonalRepository;

@Service
public class PersonalService {
    private final PersonalRepository personalRepository;

    public PersonalService(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    public List<PersonalEntity> getAllPersonal() {
        return this.personalRepository.findAll();
    }

    public PersonalEntity createPersonal(CreatePersonalDTO data) {
        PersonalEntity newPersonal = new PersonalEntity();
        newPersonal.setEdad(data.getEdad());
        newPersonal.setNombre(data.getNombre());
        newPersonal.setPrimerApellido(data.getPrimerApellido());
        return this.personalRepository.save(newPersonal);
    }

    public PersonalEntity updatePersonal(Long id, UpdatePersonalDTO data) {
        return personalRepository.findById(id).map(personalToEdit -> {
            personalToEdit.setNombre(data.getNombre());
            personalToEdit.setPrimerApellido(data.getPrimerApellido());
            if (data.getSegundoApellido() != null) {
                personalToEdit.setSegundoApellido(data.getSegundoApellido());
            }
            personalToEdit.setEdad(data.getEdad());
            return this.personalRepository.save(personalToEdit);
        }).orElseThrow(() -> new RuntimeException("Error al editar un personal"));
    }

    public void deletePersonal(Long id) {
        if (!this.personalRepository.existsById(id)) {
            throw new RuntimeException("No se encontro el personal con el id" + id);
        }
        this.personalRepository.deleteById(id);;
    }

}
