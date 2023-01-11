package decorator;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class WithSummaryStatisticsLogger implements StatisticsLogger {

    private StatisticsLogger statisticsLogger;

    public WithSummaryStatisticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public void displayStatistics() {
        System.out.println(statisticsLogger.getExecutionTimes().stream().mapToDouble(x -> x).summaryStatistics());

        statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return statisticsLogger.getExecutionTimes();
    }
}
