package singleton;

public class Application {

    public static void main(String[] args) {
        // You can use HttpClient.getInstance() everywhere to get HttpClient instance
        HttpClient.getInstance().get("http://example/path1");
        HttpClient.getInstance().get("http://example/path2");
    }
}
