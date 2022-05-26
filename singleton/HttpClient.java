package singleton;

public class HttpClient {

    private static HttpClient instance;

    // Ensure HttpClient cannot be initiated outside
    private HttpClient() {

    }

    public static HttpClient getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new HttpClient();
        return instance;
    }

    public void get(String url) {
        // Do get request
    }
}
