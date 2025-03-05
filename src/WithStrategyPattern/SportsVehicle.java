package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SpecialDrive;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SpecialDrive());
    }
}
