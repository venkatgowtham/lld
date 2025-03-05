package WithStrategyPattern.Strategy;

import WithStrategyPattern.Strategy.DriveStrategy;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive() {
        // Special Drive Mode

        System.out.println("Special Drive mode");
    }
}
