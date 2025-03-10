package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.UserDtos.UserCreateDto;
import portfolio.portfolio.dtos.UserDtos.UserResponseDto;
import portfolio.portfolio.dtos.UserDtos.UserShortDto;
import portfolio.portfolio.dtos.UserDtos.UserUpdateDto;
import portfolio.portfolio.entities.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> {

    List<UserShortDto> userShortDtos(List<User> users);
}
