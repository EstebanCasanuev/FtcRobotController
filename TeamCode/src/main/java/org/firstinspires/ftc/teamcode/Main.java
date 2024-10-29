package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Tutorial")
public class Main extends OpMode{

    DcMotor frontRightMotor;
    DcMotor rearRightMotor;
    DcMotor frontLeftMotor;
    DcMotor rearLeftMotor;
    @Override
    public void init() {
        frontRightMotor.hardwareMap.get(DcMotor.class, "frontRightMotor");
        rearRightMotor.hardwareMap.get(DcMotor.class, "rearRightMotor");
        frontLeftMotor.hardwareMap.get(DcMotor.class, "frontLeftMotor");
        rearLeftMotor.hardwareMap.get(DcMotor.class, "rearLeftMotor");

    }

    @Override
    public void loop() {
        
        drive_Cartesian(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);

    }

    public void drive_Cartesian(double X, double Y, double Z){

        double frontLeftPower = Y + X + Z;
        double rearLeftPower = Y - X + Z;
        double frontRightPower = Y - X - Z;
        double rearRightPower = Y + X - Z;

        frontRightMotor.setPower(frontRightPower);
        rearRightMotor.setPower(rearRightPower);
        frontLeftMotor.setPower(frontLeftPower);
        rearLeftMotor.setPower(rearLeftPower);
        
    }
}
