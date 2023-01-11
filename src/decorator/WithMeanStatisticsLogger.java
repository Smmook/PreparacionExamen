package decorator;

import java.util.List;

public class WithMeanStatisticsLogger implements StatisticsLogger {
    StatisticsLogger statisticsLogger;

    public WithMeanStatisticsLogger(StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public void displayStatistics() {
        Double sum = 0d;
        List<Double> executionTimes = getExecutionTimes();
        for (Double n : executionTimes) {
            sum += n;
        }
        Double average = sum/executionTimes.size();
        System.out.println("Average time: " + average);
        statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return statisticsLogger.getExecutionTimes();
    }
}
