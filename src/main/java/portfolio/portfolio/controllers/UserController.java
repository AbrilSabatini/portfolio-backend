package portfolio.portfolio.controllers;

import org.springframework.http.ResponseEntity;
import portfolio.portfolio.dtos.UserDtos.*;

import java.util.List;
import java.util.UUID;

public interface UserController extends BaseController<UUID, UserCreateDto, UserUpdateDto, UserResponseDto> {

    ResponseEntity<List<UserShortDto>> getUsersName();
    ResponseEntity<UserResponseDto> addSkills(UserAddSkillDto request);

}
