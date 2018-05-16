package secure.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import secure.springboot.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneById(Long id);
    User findOneByUsername(String username);
}
