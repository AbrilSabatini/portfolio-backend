package portfolio.portfolio.repositories;

import org.springframework.stereotype.Repository;
import portfolio.portfolio.entities.Tecnology;

import java.util.UUID;

@Repository
public interface TecnologyRepository extends BaseRepository<Tecnology, UUID> {
}
