package secure.springboot.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import secure.springboot.demo.entity.User;
import secure.springboot.demo.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public User find(Long id) {
        return userRepository.getOne(id);
    }

    public User find(String username) {
        return userRepository.findOneByUsername(username);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
