package portfolio.portfolio.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Project;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.repositories.ProjectRepository;
import portfolio.portfolio.services.ProjectService;

import java.util.UUID;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, UUID> implements ProjectService {

    ProjectRepository projectRepository;

    public ProjectServiceImpl(BaseRepository<Project, UUID> baseRepository, ProjectRepository projectRepository) {
        super(baseRepository);
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
}
