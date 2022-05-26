package proxy;

import java.util.HashMap;
import java.util.Map;

public class UserCachingProxyRepository implements UserRepository {
    private final UserMysqlRepository mysqlRepository;
    private final Map<Integer, User> inMemUserStorage;

    public UserCachingProxyRepository(UserMysqlRepository mysqlRepository) {
        this.mysqlRepository = mysqlRepository;
        this.inMemUserStorage = new HashMap<>();
    }

    @Override
    public User getUser(int id) {
        if (inMemUserStorage.containsKey(id)) {
            User user = inMemUserStorage.get(id);
            System.out.printf("Get user %d from cache\n", user.getId());
            return user;
        }
        User user = mysqlRepository.getUser(id);
        inMemUserStorage.put(id, user);
        return user;
    }
}
