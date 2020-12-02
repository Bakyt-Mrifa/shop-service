package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.AccountRepo;
import kg.megacom.shopservice.mappers.AccountMapper;
import kg.megacom.shopservice.models.dto.AccountDto;
import kg.megacom.shopservice.models.entity.Account;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountServicesImpl implements AccountServices {

    private Responses responses;
    @Autowired
    private AccountRepo accountRepo;

    @Override
    public Responses save(AccountDto accountDto) {
        System.out.println("DTO: " + accountDto);
        Account account=accountRepo.save(AccountMapper.INSTANCE.toAccount(accountDto));
        System.out.println("Entity: " + account);
        responses = Responses.save();
        responses.setObject(AccountMapper.INSTANCE.toAccountDto(account));
        return responses;
    }

    @Override
    public Responses update(AccountDto accountDto) {
        Account account=accountRepo.findById(accountDto.getId()).orElse(null);
        if (account==null){
            responses = Responses.exist();
            return responses;
        }
        account=accountRepo.save(AccountMapper.INSTANCE.toAccount(accountDto));
        responses = Responses.update();
        responses.setObject(AccountMapper.INSTANCE.toAccountDto(account));
        return responses;
    }

    @Override
    public Responses delete(AccountDto accountDto) {
        Account account=accountRepo.findById(accountDto.getId()).orElse(null);
        if (account==null){
            responses = Responses.exist();
            return responses;
        }
        account.setActive(false);
        accountRepo.save(account);
        responses = Responses.delete();
        responses.setObject(account);
        return responses;
    }

    @Override
    public Responses getAccountList(boolean active) {
        List<Account> accountList =accountRepo.getAccountsByActive(active);
        if (accountList==null){
            responses = Responses.empty();
            return responses;
        }
        responses = Responses.success();
        responses.setObject(accountList);

        return responses;
    }
}
