package hoangphuchau.managebook.services;

import hoangphuchau.managebook.entity.Book;
import hoangphuchau.managebook.entity.User;
import hoangphuchau.managebook.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public void save(User user)
    {
        userRepository.save(user);
    }
}
