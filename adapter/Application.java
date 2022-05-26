package adapter;

public class Application {

    public static void main(String[] args) {

        // Scenario 1: Legacy service still good
        System.out.println("Scenario 1: Using legacy service");
        LegacyTokenRepository legacyTokenService = new LegacyTokenRepository();
        TokenService tokenService1 = new TokenService(legacyTokenService);
        tokenService1.getPrice("TOKEN1", "TOKEN2");

        // Scenario 2: Legacy service to be deprecated, switch to use new modern service
        System.out.println("Scenario 2: Using modern service");
        ModernTokenRepository modernTokenRepository = new ModernTokenRepository();
        TokenService tokenService2 = new TokenService(modernTokenRepository);
        tokenService2.getPrice("TOKEN1", "TOKEN2");
    }
}
