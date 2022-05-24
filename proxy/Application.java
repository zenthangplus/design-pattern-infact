public class Application {

    public static void main() {
        // Normal usage
        UserMysqlRepository userMysqlRepository = new UserMysqlRepository();
        UserService userService1 = new UserService(userMysqlRepository);
        userService1.getUser(1);

        // When you want to enable caching
        UserCachingProxyRepository userCachingProxyRepository = new UserCachingProxyRepository(userMysqlRepository);
        UserService userService2 = new UserService(userCachingProxyRepository);
        userService2.getUser(1);
    }
}
