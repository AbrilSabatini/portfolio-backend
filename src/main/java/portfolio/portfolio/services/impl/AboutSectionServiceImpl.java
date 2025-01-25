package portfolio.portfolio.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.AboutSection;
import portfolio.portfolio.exceptions.AboutSectionExceptionHandler;
import portfolio.portfolio.repositories.AboutSectionRepository;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.services.AboutSectionService;

import java.util.*;

@Service
public class AboutSectionServiceImpl extends BaseServiceImpl<AboutSection, UUID> implements AboutSectionService {

    AboutSectionRepository aboutSectionRepository;

    public AboutSectionServiceImpl(BaseRepository<AboutSection, UUID> baseRepository, AboutSectionRepository aboutSectionRepository) {
        super(baseRepository);
        this.aboutSectionRepository = aboutSectionRepository;
    }

    @Override
    public AboutSection create(AboutSection entity) {
        try {
            return aboutSectionRepository.save(entity);

        } catch (DataIntegrityViolationException ex) {
            AboutSectionExceptionHandler.handleUniqueConstraints(ex);
            return null;
        }
    }

    @Override
    public AboutSection update(AboutSection request) {
        try {
            if(!aboutSectionRepository.existsById(request.getId())) {
                throw new EntityNotFoundException("Entidad con ID #" + request.getId() + " no encontrada.");
            }

            return aboutSectionRepository.save(request);

        } catch (DataIntegrityViolationException ex) {
            AboutSectionExceptionHandler.handleUniqueConstraints(ex);
            return null;
        }
    }

}

