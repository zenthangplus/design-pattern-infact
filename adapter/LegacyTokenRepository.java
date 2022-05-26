package adapter;

public class LegacyTokenRepository implements TokenRepository {
    @Override
    public float getPrice(String base, String quote) {
        System.out.printf("Request to legacy service for base %s, quote %s\n", base, quote);
        // Call to https://example.com/api/v1/price?base={base}&quote={quote}
        // Response
        // {
        //    "price": 125.6
        // }
        return 125.6f;// Get from response.price
    }
}
