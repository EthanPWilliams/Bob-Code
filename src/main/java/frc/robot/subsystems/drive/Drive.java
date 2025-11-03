// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Drive extends SubsystemBase {
    private final TalonSRX frontRight = new TalonSRX(DriveConstants.FRONT_RIGHT_MOTOR);
    private final TalonSRX frontLeft = new TalonSRX(DriveConstants.FRONT_LEFT_MOTOR);
    private final TalonSRX backRight = new TalonSRX(DriveConstants.BACK_RIGHT_MOTOR);
    private final TalonSRX backLeft = new TalonSRX(DriveConstants.BACK_LEFT_MOTOR);
  /** Creates a new ExampleSubsystem. */
  public Drive() {
      frontRight.setInverted(true);
      backRight.setInverted(true);
      backLeft.follow(frontLeft);
      backRight.follow(frontRight);

  }

  public void runPercent(double speed) {
      frontLeft.set(TalonSRXControlMode.PercentOutput, speed);
      frontRight.set(TalonSRXControlMode.PercentOutput, speed);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
