package crud.basico.crud_basico.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

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

    public PersonalEntity savePersonal(PersonalEntity data) {
        return this.personalRepository.save(data);
    }

}
