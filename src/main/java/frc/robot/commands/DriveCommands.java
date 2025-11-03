// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.drive.Drive;

public class DriveCommands {
    private DriveCommands() {}

    public static Command forward(
            Drive drive
    ) {
        return Commands.run(() -> drive.runPercent(1.0), drive);
    }

    public static Command backward(
            Drive drive
    ) {
        return Commands.run(() -> drive.runPercent(-1.0), drive);
    }

    public static Command stop(
            Drive drive
    ) {
        return Commands.run(() -> drive.runPercent(0.0), drive);
    }

    public static Command turnLeft(
            Drive drive
    ) {
        return Commands.run(() -> drive.turn(0.25), drive);
    }

    public static Command turnRight(
            Drive drive
    ) {
        return Commands.run(() -> drive.turn(-0.25), drive);
    }
}