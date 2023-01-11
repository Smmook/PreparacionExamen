package Template;

import java.util.ArrayList;
import java.util.List;

public abstract class PerformanceTestTemplate {

    public void run() {
        for (int i = 0; i < getWarmupIterationsNum(); i++) {
            testIteration();
        }

        List<Long> iterationsExecutionTimes = new ArrayList<>();
        for (int i = 0; i < getIterationsNum(); i++) {
            long start = System.currentTimeMillis();
            testIteration();
            long end = System.currentTimeMillis();
            iterationsExecutionTimes.add(end - start);
        }

        double averageTime = iterationsExecutionTimes.stream().mapToDouble(e -> e).sum() / getIterationsNum();

        System.out.println("Average time for iteration: " + averageTime);
    }

    abstract protected void testIteration();
    abstract protected int getWarmupIterationsNum();
    abstract protected int getIterationsNum();
}
