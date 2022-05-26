package proxy;

import java.util.HashMap;
import java.util.Map;

public class UserCachingProxyRepository implements UserRepository {
    private final UserMysqlRepository mysqlRepository;
    private final Map<Integer, UserEntity> inMemUserStorage;

    public UserCachingProxyRepository(UserMysqlRepository mysqlRepository) {
        this.mysqlRepository = mysqlRepository;
        this.inMemUserStorage = new HashMap<>();
    }

    @Override
    public UserEntity getUser(int id) {
        if (inMemUserStorage.containsKey(id)) {
            return inMemUserStorage.get(id);
        }
        UserEntity user = mysqlRepository.getUser(id);
        inMemUserStorage.put(id, user);
        return user;
    }
}
