package portfolio.portfolio.mappers;

import org.mapstruct.Mapper;
import portfolio.portfolio.dtos.ProjectDtos.ProjectAddTecnologyDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectCreateDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectResponseDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectUpdateDto;
import portfolio.portfolio.entities.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper extends BaseMapper<Project, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> {
    Project projectAddTecDtoToEntity(ProjectAddTecnologyDto dto);
}
