package proxy;

public class Application {

    public static void main(String[] args) {
        // Normal usage
        UserMysqlRepository userMysqlRepository = new UserMysqlRepository();
        UserService userService1 = new UserService(userMysqlRepository);
        userService1.getUser(1);

        // When you want to enable caching
        UserCachingProxyRepository userCachingProxyRepository = new UserCachingProxyRepository(userMysqlRepository);
        UserService userService2 = new UserService(userCachingProxyRepository);
        userService2.getUser(2);// First call, get from db
        userService2.getUser(2);// Seconds call, get from cache
    }
}
