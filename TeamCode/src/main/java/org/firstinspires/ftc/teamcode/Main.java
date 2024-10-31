package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.OdometrySubsystem;
import com.arcrobotics.ftclib.command.button.Trigger;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.kinematics.HolonomicOdometry;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.Drive;
import org.firstinspires.ftc.teamcode.Commands.MoveArm;
import org.firstinspires.ftc.teamcode.Subsystems.ArmSubsystem;
import org.firstinspires.ftc.teamcode.Subsystems.DrivetrainSubsystem;

@TeleOp(name = "Teleop")
public class Main extends OpMode{

    DrivetrainSubsystem m_drive;
    Drive DrivetrainCommand;

    ArmSubsystem Arm;

    MoveArm MoveArm;

    Trigger Gamepad2_b = gamepad2.b;

    @Override
    public void init() {

        m_drive = new DrivetrainSubsystem();
        DrivetrainCommand = new Drive(m_drive,
                () -> gamepad1.left_stick_x,
                () -> gamepad1.right_trigger - gamepad1.left_trigger,
                () ->gamepad1.right_stick_x);

        Arm = new ArmSubsystem();
        MoveArm = new MoveArm(Arm);



        CommandScheduler.getInstance().setDefaultCommand(m_drive, DrivetrainCommand);



        Gamepad2_b.toggleWhenActive(Arm.setSetpoint(() -> Constants.ArmSetpoints.Deposit));


    }

    @Override
    public void loop() {
        CommandScheduler.getInstance().run();

    }
}

@Autonomous
public class Main extends OpMode{

    DrivetrainSubsystem m_drive;
    Drive DrivetrainCommand;

    ArmSubsystem Arm;

    MoveArm MoveArm;

    Trigger Gamepad2_b = gamepad2.b;

    @Override
    public void init() {

        m_drive = new DrivetrainSubsystem();
        DrivetrainCommand = new Drive(m_drive,
                () -> gamepad1.left_stick_x,
                () -> gamepad1.right_trigger - gamepad1.left_trigger,
                () ->gamepad1.right_stick_x);

        Arm = new ArmSubsystem();
        MoveArm = new MoveArm(Arm);



        CommandScheduler.getInstance().setDefaultCommand(m_drive, DrivetrainCommand);



        Gamepad2_b.toggleWhenActive(Arm.setSetpoint(() -> Constants.ArmSetpoints.Deposit));


    }

    @Override
    public void loop() {
        CommandScheduler.getInstance().run();

    }
}
