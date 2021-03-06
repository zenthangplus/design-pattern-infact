package proxy;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(int id) {
        return userRepository.getUser(id);
    }
}
