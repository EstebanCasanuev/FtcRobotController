package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.OdometrySubsystem;
import com.arcrobotics.ftclib.command.button.Trigger;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.kinematics.HolonomicOdometry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.Drive;
import org.firstinspires.ftc.teamcode.Subsystems.DrivetrainSubsystem;

@TeleOp(name = "Teleop")
public class Main extends OpMode{

    /*public static final double TRACKWIDTH = 14.7; // The lateral distance between the left and right odometers
    public static final double CENTER_WHEEL_OFFSET = -2.1;
    public static final double WHEEL_DIAMETER = 1.377;
    public static final double TICKS_PER_REV = 2000;
    public static final double DISTANCE_PER_PULSE = Math.PI * WHEEL_DIAMETER / TICKS_PER_REV;

    private Motor.Encoder leftOdometer, rightOdometer, centerOdometer;

    HolonomicOdometry m_robotOdometry = new HolonomicOdometry(
            leftOdometer, rightOdometer, centerOdometer, TRACKWIDTH,
            CENTER_WHEEL_OFFSET
    );

    // pass the odometry object into the subsystem constructor
    OdometrySubsystem m_odometry;*/


    DrivetrainSubsystem m_drive;
    Drive DrivetrainCommand;

    Trigger Gamepad2_b = new Trigger();

    @Override
    public void init() {
        m_drive = new DrivetrainSubsystem();
        DrivetrainCommand = new Drive(m_drive,
                () -> gamepad1.left_stick_x,
                () -> gamepad1.right_trigger - gamepad1.left_trigger,
                () ->gamepad1.right_stick_x);

        m_odometry = new OdometrySubsystem(m_robotOdometry);

        CommandScheduler.getInstance().setDefaultCommand(m_drive, DrivetrainCommand);

        Gamepad2_b.toggleWhenActive();


    }

    @Override
    public void loop() {
        CommandScheduler.getInstance().run();

    }
}
