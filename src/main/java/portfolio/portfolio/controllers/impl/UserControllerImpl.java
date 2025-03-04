package portfolio.portfolio.controllers.impl;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.UserController;
import portfolio.portfolio.dtos.UserDtos.UserCreateDto;
import portfolio.portfolio.dtos.UserDtos.UserResponseDto;
import portfolio.portfolio.dtos.UserDtos.UserShortDto;
import portfolio.portfolio.dtos.UserDtos.UserUpdateDto;
import portfolio.portfolio.entities.User;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.mappers.UserMapper;
import portfolio.portfolio.services.BaseService;
import portfolio.portfolio.services.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "${cors.allowedOrigins}")
public class UserControllerImpl extends BaseControllerImpl<User, UUID, UserCreateDto, UserUpdateDto, UserResponseDto> implements UserController {
    private UserMapper userMapper;
    private UserService userService;

    public UserControllerImpl(BaseService<User, UUID> baseService, BaseMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> baseMapper, UserMapper userMapper, UserService userService) {
        super(baseService, baseMapper);
        this.userMapper = userMapper;
        this.userService = userService;
    }

    @Override
    @Operation(summary = "Obtener nombres de usuarios en alta")
    @GetMapping("/names")
    public ResponseEntity<List<UserShortDto>> getUsersName() {
        return ResponseEntity.ok(userMapper.userShortDtos(userService.getAll()));
    }
}
