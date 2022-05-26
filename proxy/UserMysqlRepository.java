package proxy;

class UserMysqlRepository implements UserRepository {
    public UserEntity getUser(int id) {
        // Get user from db
        return new UserEntity(id, "A random name");
    }
}