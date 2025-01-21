package portfolio.portfolio.services.impl;

import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Experience;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.services.ExperienceService;


import java.util.UUID;

@Service
public class ExperienceServiceImpl extends BaseServiceImpl<Experience, UUID> implements ExperienceService  {
    public ExperienceServiceImpl(BaseRepository<Experience, UUID> baseRepository) {
        super(baseRepository);
    }
}
