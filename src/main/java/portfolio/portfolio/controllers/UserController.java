package portfolio.portfolio.controllers;

import org.springframework.http.ResponseEntity;
import portfolio.portfolio.dtos.UserDtos.UserCreateDto;
import portfolio.portfolio.dtos.UserDtos.UserResponseDto;
import portfolio.portfolio.dtos.UserDtos.UserShortDto;
import portfolio.portfolio.dtos.UserDtos.UserUpdateDto;

import java.util.List;
import java.util.UUID;

public interface UserController extends BaseController<UUID, UserCreateDto, UserUpdateDto, UserResponseDto> {

    ResponseEntity<List<UserShortDto>> getUsersName();
}
