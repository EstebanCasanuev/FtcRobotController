package org.firstinspires.ftc.teamcode.Subsystems;

import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.DcMotor;

public class DrivetrainSubsystem extends SubsystemBase {

    Motor frontRightMotor;
    Motor rearRightMotor;
    Motor frontLeftMotor;
    Motor rearLeftMotor;

    MecanumDrive m_Drive;
    public DrivetrainSubsystem(){
        m_Drive = new MecanumDrive(frontLeftMotor,frontRightMotor, rearLeftMotor, rearRightMotor);
        frontRightMotor.hardwareMap.get(DcMotor.class, "frontRightMotor");
        rearRightMotor.hardwareMap.get(DcMotor.class, "rearRightMotor");
        frontLeftMotor.hardwareMap.get(DcMotor.class, "frontLeftMotor");
        rearLeftMotor.hardwareMap.get(DcMotor.class, "rearLeftMotor");

    }

    /*@Override
    public void initialize(){

    }*/

    @Override
    public void periodic() {
        super.periodic();
    }

    public static void drive(Double Xspeed, Double Yspeed, Double Zspeed){

        m_Drive.driveRobotCentric(Xspeed, Yspeed, Zspeed);
    }
}
