package portfolio.portfolio.repositories;

import org.springframework.stereotype.Repository;
import portfolio.portfolio.entities.Experience;

import java.util.UUID;

@Repository
public interface ExperienceRepository extends BaseRepository<Experience, UUID> {
}
