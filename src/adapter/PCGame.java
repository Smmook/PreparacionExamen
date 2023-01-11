package adapter;

public interface PCGame {
    String getTitle();
    Integer getPegiAllowedAge();
    boolean isTripleAGame();
    Requirements getRequirements();
}
