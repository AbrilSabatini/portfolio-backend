package portfolio.portfolio.services.impl;

import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Tecnology;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.services.TecnologyService;

import java.util.UUID;

@Service
public class TecnologyServiceImpl extends BaseServiceImpl<Tecnology, UUID> implements TecnologyService {
    public TecnologyServiceImpl(BaseRepository<Tecnology, UUID> baseRepository) {
        super(baseRepository);
    }
}
