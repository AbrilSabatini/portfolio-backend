package portfolio.portfolio.controllers;

import portfolio.portfolio.dtos.UserDtos.UserCreateDto;
import portfolio.portfolio.dtos.UserDtos.UserResponseDto;
import portfolio.portfolio.dtos.UserDtos.UserUpdateDto;

import java.util.UUID;

public interface UserController extends BaseController<UUID, UserCreateDto, UserUpdateDto, UserResponseDto> {
}
