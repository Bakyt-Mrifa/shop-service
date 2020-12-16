package kg.megacom.shopservice.services;

import kg.megacom.shopservice.models.dto.UserDto;
import kg.megacom.shopservice.models.responses.Responses;

import java.util.List;

public interface UserService {

    Responses saveUser (UserDto userDto);
    Responses updateUser (UserDto userDto);
    Responses deleteUser (UserDto userDto);
    List<UserDto> getUserList ();
}
