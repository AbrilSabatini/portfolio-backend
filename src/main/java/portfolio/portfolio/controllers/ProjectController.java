package portfolio.portfolio.controllers;

import portfolio.portfolio.dtos.ProjectDtos.ProjectCreateDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectResponseDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectUpdateDto;

import java.util.UUID;

public interface ProjectController extends BaseController<UUID, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> {
}
