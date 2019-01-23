package tim.app.repositories;

import org.springframework.data.repository.CrudRepository;
import tim.app.user.User;

public interface UserRepo extends CrudRepository<User, Long> {
}
