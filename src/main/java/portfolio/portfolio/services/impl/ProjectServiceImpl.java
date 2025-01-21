package portfolio.portfolio.services.impl;

import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Project;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.services.ProjectService;

import java.util.UUID;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, UUID> implements ProjectService {
    public ProjectServiceImpl(BaseRepository<Project, UUID> baseRepository) {
        super(baseRepository);
    }
}
