package crud.basico.crud_basico.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.basico.crud_basico.crud.entities.PersonalEntity;

@Repository
public interface PersonalRepository extends JpaRepository<PersonalEntity, Long> {

}
