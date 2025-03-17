package portfolio.portfolio.controllers.impl;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.portfolio.controllers.ProjectController;
import portfolio.portfolio.dtos.ProjectDtos.ProjectAddTecnologyDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectCreateDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectResponseDto;
import portfolio.portfolio.dtos.ProjectDtos.ProjectUpdateDto;
import portfolio.portfolio.entities.Project;
import portfolio.portfolio.mappers.BaseMapper;
import portfolio.portfolio.mappers.ProjectMapper;
import portfolio.portfolio.services.BaseService;
import portfolio.portfolio.services.ProjectService;

import java.util.UUID;

@RestController
@RequestMapping("/projects")
public class ProjectControllerImpl extends BaseControllerImpl<Project, UUID, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> implements ProjectController {

    private final ProjectMapper projectMapper;
    private ProjectService projectService;

    public ProjectControllerImpl(BaseService<Project, UUID> baseService, BaseMapper<Project, ProjectCreateDto, ProjectUpdateDto, ProjectResponseDto> baseMapper, ProjectMapper projectMapper, ProjectService projectService) {
        super(baseService, baseMapper);
        this.projectMapper = projectMapper;
        this.projectService = projectService;
    }

    @Override
    @Operation(summary = "Añadir tecnologías al proyecto")
    @PatchMapping("/add-tecnologies")
    public ResponseEntity<ProjectResponseDto> addTecnologies(@RequestBody @Valid ProjectAddTecnologyDto request) {
        System.out.println("Lego acáááá");
        Project entity = projectMapper.projectAddTecDtoToEntity(request);
        System.out.println("Y acá?");
        ProjectResponseDto dto = projectMapper.toDto(projectService.addTecnologies(entity));
        return ResponseEntity.ok(dto);
    }
}
