package org.firstinspires.ftc.teamcode.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class GripperSubsystem extends SubsystemBase {

    DcMotor GripMotor;
    Servo Wrist;



    public GripperSubsystem(){
        GripMotor = new DcMotor(hardwareMap, "GripMotor");

    }

    @Override
    public void periodic() {
        super.periodic();
    }
}
