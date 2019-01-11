package fr.dauphine.services;

import fr.dauphine.dtos.AccountDTO;
import fr.dauphine.entities.AccountEntity;
import fr.dauphine.repositories.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class UserService implements IAccountService {



    @Autowired
    private AccountRepository accountRepository;


    @Override
    public void createAccount() {
        AccountEntity accountEntity = AccountEntity
                .builder()
                .iban("fefzefz")
                .balance(80L)
                .build();

        this.accountRepository.save(accountEntity);
    }

    @Override
    public void findAccount(String idAccount) {
        this.accountRepository.findById(idAccount);
    }

    @Override
    public void findAllAccounts() {

    }

    @Override
    public void updateAccount(AccountDTO accountDTO) {

    }

    @Override
    public void deleteAccount(String iban) {
        this.accountRepository.deleteById(iban);
    }
}
