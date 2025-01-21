package portfolio.portfolio.controllers.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.ProjectController;
import portfolio.portfolio.dtos.ProjectDtos.ProjectCreateDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectResponseDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectUpdateDto;
import portfolio.portfolio.entities.Project;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.services.BaseService;

import java.util.UUID;

@RestController
@RequestMapping("/projects")
public class ProjectControllerImpl extends BaseControllerImpl<Project, UUID, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> implements ProjectController {
    public ProjectControllerImpl(BaseService<Project, UUID> baseService, BaseMapper<Project, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
