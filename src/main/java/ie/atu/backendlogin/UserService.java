package ie.atu.backendlogin;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void saveUser(User user) {
        userRepository.save(user);
        System.out.println("User saved: " + user);
    }
}
