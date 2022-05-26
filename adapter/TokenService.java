package adapter;

public class TokenService {
    private final TokenRepository tokenRepository;

    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public float getPrice(String base, String quote) {
        return this.tokenRepository.getPrice(base, quote);
    }
}
