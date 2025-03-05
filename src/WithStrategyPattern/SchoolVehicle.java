package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDrive;

public class SchoolVehicle extends Vehicle{

    public SchoolVehicle()
    {
        super(new NormalDrive());
    }
}
