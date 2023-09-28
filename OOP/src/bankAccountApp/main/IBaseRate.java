package bankAccountApp.main;

public interface IBaseRate {
    // Write a method that returns the base rate
    default double getBaseRate() {
        // Input a benchmark rate
        return 2.5;
    }
}
