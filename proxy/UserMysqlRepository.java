package proxy;

class UserMysqlRepository implements UserRepository {
    public User getUser(int id) {
        User user = new User(id, "A random name");// Get user from db
        System.out.printf("Get user %d from db\n", user.getId());
        return user;
    }
}