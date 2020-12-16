package kg.megacom.shopservice.mappers;

import kg.megacom.shopservice.models.dto.AccountDto;
import kg.megacom.shopservice.models.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE= Mappers.getMapper(AccountMapper.class);

   // @Mapping(source = "accountDto.login", target = "login")
    Account toAccount (AccountDto accountDto);
    AccountDto toAccountDto (Account account);

    List<Account> toAccountList (List<AccountDto> accountDtoList);
    List<AccountDto> toAccountDtoList (List<Account> accountList);
}
