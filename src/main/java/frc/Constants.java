package frc;

import static edu.wpi.first.units.Units.MetersPerSecond;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.units.measure.LinearVelocity;

public class Constants {
    public static final double XBOX_CONTROLLER_DEADBAND = 0.07;
    public static final LinearVelocity SWERVE_MAXIMUM_SPEED = MetersPerSecond.of(8.0);
    public static final double SWERVE_MAXIMUM_ANGULAR_VELOCITY = Units.degreesToRadians(720*2);
}
