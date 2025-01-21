package portfolio.portfolio.repositories;

import org.springframework.stereotype.Repository;
import portfolio.portfolio.entities.User;

import java.util.UUID;

@Repository
public interface UserRepository extends BaseRepository<User, UUID> {
}
