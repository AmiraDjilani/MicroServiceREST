package fr.dauphine.services;

import fr.dauphine.dtos.AccountDTO;

public interface IAccountService {


    public void createAccount();
    public void findAccount(String idAccount);
    public void findAllAccounts();

    public void updateAccount(AccountDTO accountDTO);

    public void deleteAccount(String idAccount);


}
