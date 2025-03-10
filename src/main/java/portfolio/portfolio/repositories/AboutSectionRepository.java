package portfolio.portfolio.repositories;

import org.springframework.stereotype.Repository;
import portfolio.portfolio.entities.AboutSection;

import java.util.UUID;

@Repository
public interface AboutSectionRepository extends BaseRepository<AboutSection, UUID> {
}
