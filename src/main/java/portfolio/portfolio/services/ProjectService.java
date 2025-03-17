package portfolio.portfolio.services;

import portfolio.portfolio.entities.Project;

import java.util.UUID;

public interface ProjectService extends BaseService<Project, UUID> {

    Project addTecnologies(Project request);
}
