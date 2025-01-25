package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.AboutSection.AboutSectionCreateDto;
import portfolio.portfolio.dtos.AboutSection.AboutSectionResponseDto;
import portfolio.portfolio.dtos.AboutSection.AboutSectionUpdateDto;
import portfolio.portfolio.entities.AboutSection;

@Mapper(componentModel = "spring")
public interface AboutSectionMapper extends BaseMapper<AboutSection, AboutSectionCreateDto, AboutSectionUpdateDto, AboutSectionResponseDto> {
}
