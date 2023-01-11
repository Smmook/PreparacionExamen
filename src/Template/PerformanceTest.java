package Template;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PerformanceTest extends PerformanceTestTemplate {

    @Override
    protected void testIteration() {
        List<Long> longs = Stream.generate(() -> new Random().nextLong()).limit(1000).toList();
        longs = longs.stream().sorted().toList();
    }

    @Override
    protected int getWarmupIterationsNum() {
        return 10;
    }

    @Override
    protected int getIterationsNum() {
        return 10000;
    }
}
