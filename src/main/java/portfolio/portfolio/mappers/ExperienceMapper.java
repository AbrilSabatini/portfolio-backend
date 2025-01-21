package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceCreateDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceResponseDto;
import portfolio.portfolio.dtos.ExperienceDtos.ExperienceUpdateDto;
import portfolio.portfolio.entities.Experience;

@Mapper(componentModel = "spring")
public interface ExperienceMapper extends BaseMapper<Experience, ExperienceCreateDto, ExperienceUpdateDto, ExperienceResponseDto> {
}
