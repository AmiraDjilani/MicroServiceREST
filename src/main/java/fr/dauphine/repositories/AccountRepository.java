package fr.dauphine.repositories;

import fr.dauphine.entities.AccountEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountEntity, String> {

}
