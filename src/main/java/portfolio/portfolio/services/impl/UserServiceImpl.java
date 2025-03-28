package portfolio.portfolio.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.Tecnology;
import portfolio.portfolio.entities.User;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.repositories.TecnologyRepository;
import portfolio.portfolio.repositories.UserRepository;
import portfolio.portfolio.services.ProjectService;
import portfolio.portfolio.services.UserService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UUID> implements UserService {

    UserRepository userRepository;
    ProjectService projectService;
    TecnologyRepository tecnologyRepository;

    public UserServiceImpl(BaseRepository<User, UUID> baseRepository, UserRepository userRepository, ProjectService projectService, TecnologyRepository tecnologyRepository) {
        super(baseRepository);
        this.userRepository = userRepository;
        this.projectService = projectService;
        this.tecnologyRepository = tecnologyRepository;
    }

    @Override
    public void softDelete(UUID uuid) {
        User user = userRepository.findByIdAndIsActiveTrue(uuid).orElseThrow(() ->
                new EntityNotFoundException("Entidad con ID #" + uuid + " no encontrada.")
        );

        if(user == null) {
            throw new EntityNotFoundException("Entidad con ID #" + uuid + " no encontrada.");
        }

        user.setActive(false);

        deleteUserRelated(user);

        userRepository.save(user);
    }

    private void deleteUserRelated(User user) {
        if (user.getExperiences() != null) {
            user.getExperiences().forEach(experience -> experience.setActive(false));
        }

        if (user.getProjects() != null) {
            user.getProjects().forEach(project -> projectService.softDelete(project.getId()));
        }

        if (user.getAboutSections() != null) {
            user.getAboutSections().forEach(aboutSection -> aboutSection.setActive(false));
        }
    }

    @Override
    public User addSkill(User request) {
        // Obtener el usuario
        User user = this.getById(request.getId());

        // Obtener las habilidades del usuario
        Set<Tecnology> projestsTecnologies = new HashSet<>(user.getSkills());

        // Obtener las habilidades de la request
        Set<Tecnology> newTecnologies = request.getSkills().stream()
                .map(tecnology -> tecnologyRepository.findByIdAndIsActiveTrue(tecnology.getId())
                        .orElseThrow(() -> new EntityNotFoundException("Tecnology con ID #" + tecnology.getId() + " no encontrada.")))
                .collect(Collectors.toSet());

        projestsTecnologies.addAll(newTecnologies);

        user.setSkills(new ArrayList<>(projestsTecnologies));

        return userRepository.save(user);
    }
}
