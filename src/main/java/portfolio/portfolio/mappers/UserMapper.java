package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.UserDtos.*;
import portfolio.portfolio.entities.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserCreateDto, UserUpdateDto, UserResponseDto> {

    List<UserShortDto> userShortDtos(List<User> users);

    User addSkillDtoToEntity(UserAddSkillDto userAddSkillDto);
}
