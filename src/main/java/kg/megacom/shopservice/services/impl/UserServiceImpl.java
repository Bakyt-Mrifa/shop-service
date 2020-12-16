package kg.megacom.shopservice.services.impl;

import kg.megacom.shopservice.database.UserRepo;
import kg.megacom.shopservice.mappers.UserMapper;
import kg.megacom.shopservice.models.dto.UserDto;
import kg.megacom.shopservice.models.entity.User;
import kg.megacom.shopservice.models.responses.Responses;
import kg.megacom.shopservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    private Responses responses;

    @Override
    public Responses saveUser(UserDto userDto) {
        User user=userRepo.save(UserMapper.INSTANCE.toUser(userDto));
        responses.setObject(user);
        responses=Responses.save();
        return responses;
    }

    @Override
    public Responses updateUser(UserDto userDto) {
        User user=userRepo.findById(userDto.getId()).orElse(null);
        if (user==null){
            responses=Responses.exist();
            return responses;
        }
        userRepo.save(user);
        responses.setObject(UserMapper.INSTANCE.toUserDto(user));
        responses=Responses.update();
        return responses;
    }

    @Override
    public Responses deleteUser(UserDto userDto) {
        User user=userRepo.findById(userDto.getId()).orElse(null);
        if (user==null){
            responses=Responses.exist();
            return responses;
        }
        userRepo.delete(user);
        responses=Responses.delete();
        return responses;
    }

    @Override
    public List<UserDto> getUserList() {
        List<User> users=userRepo.findAll();
        return UserMapper.INSTANCE.toUserDtoList(users);
    }
}
