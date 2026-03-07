// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.Constants;
import frc.subsystem.SwerveSubsystem;
import swervelib.SwerveInputStream;

public class RobotContainer {
  private final CommandXboxController xboxController = new CommandXboxController(0);
  private final SwerveSubsystem swerveSubsystem = SwerveSubsystem.getInstance();
  public SwerveInputStream driveInputStream = SwerveInputStream.of(swerveSubsystem.getSwerveDrive(),
    () -> xboxController.getLeftY(),
    () -> xboxController.getLeftX())
    .withControllerHeadingAxis(
      () -> xboxController.getRightX(), 
      () -> xboxController.getRightY())
    .deadband(Constants.XBOX_CONTROLLER_DEADBAND)
    .scaleTranslation(0.5)
    .allianceRelativeControl(true)
    .headingWhile(true);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
