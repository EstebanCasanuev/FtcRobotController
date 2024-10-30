package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.Subsystems.DrivetrainSubsystem;

import java.util.function.DoubleSupplier;

/**
 * A command to drive the robot with joystick input
 * (passed in as {@link DoubleSupplier}s). Written
 * explicitly for pedagogical purposes.
 */
public class Drive extends CommandBase {

    private final DrivetrainSubsystem drivetrainSubsystem;
    private final DoubleSupplier Xspeed;
    private final DoubleSupplier Yspeed;
    private final DoubleSupplier Zspeed;




    public Drive(DrivetrainSubsystem drivetrainSubsystem,
                        DoubleSupplier Xspeed, DoubleSupplier Yspeed, DoubleSupplier Zspeed) {
        this.drivetrainSubsystem = drivetrainSubsystem;
        this.Xspeed = Xspeed;
        this.Yspeed = Yspeed;
        this.Zspeed = Zspeed;

        //addRequirements(m_drive);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        DrivetrainSubsystem.drive(
                Xspeed.getAsDouble(),
                Yspeed.getAsDouble(),
                Zspeed.getAsDouble()
        );
    }


    @Override
    public boolean isFinished() {
        return true;
    }

}
