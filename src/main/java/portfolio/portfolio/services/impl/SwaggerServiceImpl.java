package portfolio.portfolio.services.impl;

import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Swagger;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.services.SwaggerService;

import java.util.UUID;

@Service
public class SwaggerServiceImpl extends BaseServiceImpl<Swagger, UUID> implements SwaggerService {
    public SwaggerServiceImpl(BaseRepository<Swagger, UUID> baseRepository) {
        super(baseRepository);
    }
}
