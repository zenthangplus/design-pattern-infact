package proxy;

class UserMysqlRepository implements UserRepository {
    public User getUser(int id) {
        // Get user from db
        return new User(id, "A random name");
    }
}