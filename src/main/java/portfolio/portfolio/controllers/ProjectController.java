package portfolio.portfolio.controllers;

import org.springframework.http.ResponseEntity;
import portfolio.portfolio.dtos.ProjectDtos.ProjectAddTecnologyDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectCreateDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectResponseDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectUpdateDto;
import portfolio.portfolio.entities.Project;

import java.util.UUID;

public interface ProjectController extends BaseController<UUID, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> {
    ResponseEntity<ProjectResponseDto> addTecnologies(ProjectAddTecnologyDto request);
}
