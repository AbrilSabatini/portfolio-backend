package portfolio.portfolio.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Project;
import portfolio.portfolio.entities.Tecnology;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.repositories.ProjectRepository;
import portfolio.portfolio.repositories.TecnologyRepository;
import portfolio.portfolio.services.ProjectService;

import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, UUID> implements ProjectService {

    ProjectRepository projectRepository;
    TecnologyRepository tecnologyRepository;

    public ProjectServiceImpl(BaseRepository<Project, UUID> baseRepository, TecnologyRepository tecnologyRepository, ProjectRepository projectRepository) {
        super(baseRepository);
        this.tecnologyRepository = tecnologyRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public void softDelete(UUID uuid) {
        Project project = projectRepository.findByIdAndIsActiveTrue(uuid).orElseThrow(() ->
                new EntityNotFoundException("Entidad con ID #" + uuid + " no encontrada.")
        );

        project.setActive(false);

        if (project.getSwagger() != null) {
            (project.getSwagger()).setActive(false);
        }

        projectRepository.save(project);
    }

    @Override
    public Project update(Project request) {
        Project project = projectRepository.findByIdAndIsActiveTrue(request.getId())
                .orElseThrow(() -> new EntityNotFoundException("Entidad con ID #" + request.getId() + " no encontrada."));

        if (request.getName() != null) {
            project.setName(request.getName());
        }
        if (request.getDescription() != null) {
            project.setDescription(request.getDescription());
        }
        if (request.getGithubUrl() != null) {
            project.setGithubUrl(request.getGithubUrl());
        }
        if (request.getStatus() != null) {
            project.setStatus(request.getStatus());
        }
        if (request.getImageUrl() != null) {
            project.setImageUrl(request.getImageUrl());
        }

        if (request.getTecnologies() != null && !request.getTecnologies().isEmpty()) {
            Set<Tecnology> tecnologies = request.getTecnologies().stream()
                    .map(tecnology -> tecnologyRepository.findByIdAndIsActiveTrue(tecnology.getId())
                            .orElseThrow(() -> new EntityNotFoundException("Tecnology con ID #" + tecnology.getId() + " no encontrada.")))
                    .collect(Collectors.toSet());

            project.setTecnologies(new ArrayList<>(tecnologies));

        }

        return projectRepository.save(project);
    }

}
