// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.IFollower;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ExampleSubsystem extends SubsystemBase {
    private final TalonSRX frontRight = new TalonSRX(12);
    private final TalonSRX frontLeft = new TalonSRX(10);
    private final TalonSRX backRight = new TalonSRX(13);
    private final TalonSRX backLeft = new TalonSRX(11);
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
      frontLeft.setInverted(true);
      backLeft.setInverted(true);
      backLeft.follow(frontLeft);
      backRight.follow(frontRight);

  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public void runVoltage() {
      frontLeft.set(TalonSRXControlMode.PercentOutput, 1);
      frontRight.set(TalonSRXControlMode.PercentOutput, 1);

  }

  public void runZero() {
      frontLeft.set(TalonSRXControlMode.PercentOutput, 0);
      frontRight.set(TalonSRXControlMode.PercentOutput, 0);
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
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
