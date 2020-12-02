package kg.megacom.shopservice.controllers;

import io.swagger.annotations.Api;
import kg.megacom.shopservice.models.dto.AccountDto;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v0.1/account/")
@Api(value = "Система управления пользователями", description = "Управление полльзователями")
public class AccountController {

    @Autowired
    private AccountServices accountServices;

    @PostMapping(value = "save")
    public Responses saveAccount (@RequestBody AccountDto accountDto){
        return accountServices.save(accountDto);
    }

    @PutMapping(value = "update")
    public Responses updateAccount (@RequestBody AccountDto accountDto){
        return accountServices.update(accountDto);
    }

    @DeleteMapping(value = "delete")
        public Responses deleteAccount (@RequestBody AccountDto accountDto){
        return accountServices.delete(accountDto);
    }

    @GetMapping(value = "getList")
    public Responses getAccountList (@RequestParam boolean active){
        return accountServices.getAccountList(active);
    }

}
