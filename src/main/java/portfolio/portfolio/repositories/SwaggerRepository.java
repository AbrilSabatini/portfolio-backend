package portfolio.portfolio.repositories;

import org.springframework.stereotype.Repository;
import portfolio.portfolio.entities.Swagger;

import java.util.UUID;

@Repository
public interface SwaggerRepository extends BaseRepository<Swagger, UUID> {
}
