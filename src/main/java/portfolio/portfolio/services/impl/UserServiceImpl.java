package portfolio.portfolio.services.impl;

import org.springframework.stereotype.Service;
import portfolio.portfolio.entities.User;
import portfolio.portfolio.repositories.BaseRepository;
import portfolio.portfolio.services.UserService;

import java.util.UUID;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UUID> implements UserService {
    public UserServiceImpl(BaseRepository<User, UUID> baseRepository) {
        super(baseRepository);
    }
}
