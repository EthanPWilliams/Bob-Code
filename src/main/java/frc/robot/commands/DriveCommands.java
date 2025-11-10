// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.drive.Drive;

import java.util.function.DoubleSupplier;

public class DriveCommands {
    private DriveCommands() {}

    public static Command forward(
            Drive drive, DoubleSupplier forward
    ) {
        return Commands.run(() -> drive.runPercent(forward.getAsDouble()), drive);
    }

    public static Command turn(
            Drive drive, DoubleSupplier turn
    ) {
        return Commands.run(() -> drive.runPercent(turn.getAsDouble()), drive);
    }

    public static Command stop(
            Drive drive
    ) {
        return Commands.run(() -> drive.runPercent(0.0), drive);
    }

    public static Command tankDrive(
            Drive drive,
            DoubleSupplier speed,
            DoubleSupplier turn
    ) {
        return Commands.either(
                forward(drive, speed),
                turn(drive, turn),
                () -> speed.getAsDouble() > turn.getAsDouble());
    }
}