package portfolio.portfolio.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.UserController;
import portfolio.portfolio.dtos.UserDtos.UserCreateDto;
import portfolio.portfolio.dtos.UserDtos.UserResponseDto;
import portfolio.portfolio.dtos.UserDtos.UserUpdateDto;
import portfolio.portfolio.entities.User;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.services.BaseService;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserControllerImpl extends BaseControllerImpl<User, UUID, UserCreateDto, UserUpdateDto, UserResponseDto> implements UserController {
    public UserControllerImpl(BaseService<User, UUID> baseService, BaseMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
