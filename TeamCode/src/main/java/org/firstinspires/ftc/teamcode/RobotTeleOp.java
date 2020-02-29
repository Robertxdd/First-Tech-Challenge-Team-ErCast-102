package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Basic: Linear OpMode", group="Linear Opmode")
//@Disabled
public class RobotTeleOp extends LinearOpMode {

    private DcMotor FataStanga;
    private DcMotor FataDreapta;
    private DcMotor SpateStanga;
    private DcMotor SpateDreapta;
    private DcMotor lift;
    private DcMotor Brat;
    private Servo Gheara;
    private Servo Eticheta;
    private Servo Servo;
    private DcMotor Aspirator0;
    private DcMotor Aspirator1;

    @Override
    public void runOpMode() {
        FataStanga = hardwareMap.dcMotor.get("Fata Stanga");
        FataDreapta = hardwareMap.dcMotor.get("Fata Dreapta");
        SpateStanga = hardwareMap.dcMotor.get("Spate Stanga");
        SpateDreapta = hardwareMap.dcMotor.get("Spate Dreapta");
        lift = hardwareMap.dcMotor.get("lift");
        Brat = hardwareMap.dcMotor.get("Brat");
        Gheara = hardwareMap.servo.get("Gheara");
        Eticheta = hardwareMap.servo.get("1");
        Servo = hardwareMap.servo.get("2");
        Aspirator0 = hardwareMap.dcMotor.get("Aspirator 0");
        Aspirator1 = hardwareMap.dcMotor.get("Aspirator 1");


        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                // Fata/Spate,Stanga/Dreapta
                // The Y axis of a joystick ranges from -1 in its topmost position
                // to +1 in its bottommost position. We negate this value so that
                // the topmost position corresponds to maximum forward power.
                FataStanga.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
                FataDreapta.setPower(gamepad1.left_stick_y + gamepad1.right_stick_x);
                // The Y axis of a joystick ranges from -1 in its topmost position
                // to +1 in its bottommost position. We negate this value so that
                // the topmost position corresponds to maximum forward power.
                SpateStanga.setPower(gamepad1.left_stick_y - gamepad1.right_stick_x);
                SpateDreapta.setPower(gamepad1.left_stick_y + gamepad1.right_stick_x);
                if (gamepad1.dpad_right) {
                    // Hover Dreapta
                    // The Y axis of a joystick ranges from -1 in its topmost position
                    // to +1 in its bottommost position. We negate this value so that
                    // the topmost position corresponds to maximum forward power.
                    FataStanga.setPower(-1);
                    FataDreapta.setPower(1);
                    // The Y axis of a joystick ranges from -1 in its topmost position
                    // to +1 in its bottommost position. We negate this value so that
                    // the topmost position corresponds to maximum forward power.
                    SpateStanga.setPower(1);
                    SpateDreapta.setPower(-1);
                } else if (gamepad1.dpad_left) {
                    // Hover Stanga
                    // The Y axis of a joystick ranges from -1 in its topmost position
                    // to +1 in its bottommost position. We negate this value so that
                    // the topmost position corresponds to maximum forward power.
                    FataStanga.setPower(1);
                    FataDreapta.setPower(-1);
                    // The Y axis of a joystick ranges from -1 in its topmost position
                    // to +1 in its bottommost position. We negate this value so that
                    // the topmost position corresponds to maximum forward power.
                    SpateStanga.setPower(-1);
                    SpateDreapta.setPower(1);
                } else {
                    // The Y axis of a joystick ranges from -1 in its topmost position
                    // to +1 in its bottommost position. We negate this value so that
                    // the topmost position corresponds to maximum forward power.
                    FataStanga.setPower(0);
                    FataDreapta.setPower(0);
                    // The Y axis of a joystick ranges from -1 in its topmost position
                    // to +1 in its bottommost position. We negate this value so that
                    // the topmost position corresponds to maximum forward power.
                    SpateStanga.setPower(0);
                    SpateDreapta.setPower(0);
                }
                if (gamepad2.y) {
                    lift.setPower(-1);
                } else if (gamepad2.a) {
                    lift.setPower(1);
                } else {
                    lift.setPower(0);
                }
                if (gamepad2.dpad_up) {
                    Brat.setPower(-1);
                } else if (gamepad2.dpad_down) {
                    Brat.setPower(1);
                } else {
                    Brat.setPower(0);
                }
                if (gamepad1.x) {
                    Gheara.setPosition(1);
                } else if (gamepad1.b) {
                    Gheara.setPosition(-1);
                } else {
                }
                if (gamepad1.left_bumper) {
                   Eticheta.setPosition(1);
                } else if (gamepad1.right_bumper) {
                    Eticheta.setPosition(-1);
                } else {
                }
                if (gamepad1.dpad_up) {
                    Servo.setPosition(1);
                } else if (gamepad1.dpad_down) {
                    Servo.setPosition(-1);
                } else {
                }
                if (gamepad2.x) {
                    Aspirator0.setPower(1);
                    Aspirator1.setPower(-1);
                } else if (gamepad2.b) {
                    Aspirator0.setPower(-1);
                    Aspirator1.setPower(1);
                } else {
                    Aspirator0.setPower(0);
                    Aspirator1.setPower(0);
                }
            }
            FataStanga.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            FataDreapta.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            SpateStanga.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            SpateDreapta.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            lift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            Brat.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            Aspirator0.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            Aspirator1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
    }
}