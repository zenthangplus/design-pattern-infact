package adapter;

public class ModernTokenRepository implements TokenRepository {
    @Override
    public float getPrice(String base, String quote) {
        System.out.printf("Request to modern service for base %s, quote %s\n", base, quote);
        // Call to https://example.com/api/v2/price?symbol={base}{quote}
        // Response
        // {
        //    "meta": {
        //      "status": 200,
        //      "message": "Successful"
        //    },
        //    "data": {
        //      "price": 125.6
        //    }
        // }
        return 125.6f;// Get from response.data.price
    }
}
