package portfolio.portfolio.repositories;

import org.springframework.stereotype.Repository;
import portfolio.portfolio.entities.Project;

import java.util.UUID;

@Repository
public interface ProjectRepository extends BaseRepository<Project, UUID> {
}
