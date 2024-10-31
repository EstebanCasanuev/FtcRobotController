package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.Subsystems.ArmSubsystem;

import java.util.function.IntSupplier;

public class MoveArm extends CommandBase {
    ArmSubsystem Subsystem;
    IntSupplier Setpoint;

    public MoveArm(ArmSubsystem Subsystem){
        this.Subsystem = Subsystem;
        this.Setpoint = Setpoint;

    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        Subsystem.PID.setSetPoint(Setpoint.getAsInt());
    }


    @Override
    public boolean isFinished() {
        return true;
    }
}
