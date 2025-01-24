package portfolio.portfolio.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.User;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.repositories.UserRepository;
import portfolio.portfolio.services.ProjectService;
import portfolio.portfolio.services.UserService;

import java.util.UUID;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UUID> implements UserService {

    UserRepository userRepository;
    ProjectService projectService;

    public UserServiceImpl(BaseRepository<User, UUID> baseRepository, UserRepository userRepository, ProjectService projectService) {
        super(baseRepository);
        this.userRepository = userRepository;
        this.projectService = projectService;
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

    }
}
