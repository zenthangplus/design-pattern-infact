package singleton;

public class HttpClient {

    private static HttpClient instance;

    // Ensure HttpClient cannot be initiated outside
    private HttpClient() {

    }

    public static HttpClient getInstance() {
        if (instance != null) {
            System.out.println("HttpClient instance reused");
            return instance;
        }
        System.out.println("HttpClient instance created");
        instance = new HttpClient();
        return instance;
    }

    public void get(String url) {
        // Do get request
    }
}
