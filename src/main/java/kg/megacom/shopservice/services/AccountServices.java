package kg.megacom.shopservice.services;

import kg.megacom.shopservice.models.dto.AccountDto;
import kg.megacom.shopservice.models.responses.Responses;

public interface AccountServices {

    Responses save (AccountDto accountDto);
    Responses update (AccountDto accountDto);
    Responses delete (AccountDto accountDto);
    Responses getAccountList (boolean active);
}
