package strategy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PoolResolver {
    private final Map<String, PoolStrategy> strategiesMap;

    public PoolResolver(List<PoolStrategy> strategies) {
        strategiesMap = strategies.stream().collect(
                Collectors.toMap(PoolStrategy::type, poolStrategy -> poolStrategy)
        );
    }

    public PoolStrategy resolve(String type) {
        return strategiesMap.get(type);
    }
}
