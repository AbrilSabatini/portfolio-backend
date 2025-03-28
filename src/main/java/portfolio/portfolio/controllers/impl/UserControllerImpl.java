package portfolio.portfolio.controllers.impl;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import portfolio.portfolio.controllers.UserController;
import portfolio.portfolio.dtos.UserDtos.*;
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

    @Override
    @Operation(summary = "Añadir habilidades al usuario")
    @PatchMapping("/add-skills")
    public ResponseEntity<UserResponseDto> addSkills(@RequestBody @Valid UserAddSkillDto request) {
        User entity = userMapper.addSkillDtoToEntity(request);
        return ResponseEntity.ok(userMapper.toDto(userService.addSkill(entity)));
    }
}
