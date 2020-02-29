package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "AutonomieTavaRosie (Blocks to Java)", group = "")
public class AutonomieTavaRosie extends LinearOpMode {

    private DcMotor FataStanga;
    private DcMotor FataDreapta;
    private DcMotor SpateStanga;
    private DcMotor SpateDreapta;
    private Servo Servo_Servo;
    private Servo Eticheta;

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        FataStanga = hardwareMap.dcMotor.get("Fata Stanga");
        FataDreapta = hardwareMap.dcMotor.get("Fata Dreapta");
        SpateStanga = hardwareMap.dcMotor.get("Spate Stanga");
        SpateDreapta = hardwareMap.dcMotor.get("Spate Dreapta");
        Servo_Servo = hardwareMap.servo.get("Servo");
        Eticheta = hardwareMap.servo.get("Eticheta");

        waitForStart();
        if (opModeIsActive()) {
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(-1120);
            FataDreapta.setTargetPosition(-1120);
            SpateStanga.setTargetPosition(-1120);
            SpateDreapta.setTargetPosition(-1120);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(200);
            FataDreapta.setPower(200);
            SpateStanga.setPower(200);
            SpateDreapta.setPower(200);
            sleep(500);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(-1000);
            FataDreapta.setTargetPosition(1000);
            SpateStanga.setTargetPosition(1000);
            SpateDreapta.setTargetPosition(-1000);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(0.1);
            FataDreapta.setPower(0.1);
            SpateStanga.setPower(0.1);
            SpateDreapta.setPower(0.1);
            sleep(1000);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(-1000);
            FataDreapta.setTargetPosition(1000);
            SpateStanga.setTargetPosition(-1000);
            SpateDreapta.setTargetPosition(1000);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(0.1);
            FataDreapta.setPower(0.1);
            SpateStanga.setPower(0.1);
            SpateDreapta.setPower(0.1);
            sleep(750);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(1000);
            FataDreapta.setTargetPosition(-1000);
            SpateStanga.setTargetPosition(-1000);
            SpateDreapta.setTargetPosition(1000);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(0.1);
            FataDreapta.setPower(0.1);
            SpateStanga.setPower(0.1);
            SpateDreapta.setPower(0.1);
            Servo_Servo.setPosition(1);
            Eticheta.setPosition(-1);
            sleep(700);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            Servo_Servo.setPosition(-1);
            Eticheta.setPosition(1);
            sleep(700);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(-1000);
            FataDreapta.setTargetPosition(1000);
            SpateStanga.setTargetPosition(1000);
            SpateDreapta.setTargetPosition(-1000);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(0.1);
            FataDreapta.setPower(0.1);
            SpateStanga.setPower(0.1);
            SpateDreapta.setPower(0.1);
            sleep(1100);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(1000);
            FataDreapta.setTargetPosition(-1000);
            SpateStanga.setTargetPosition(1000);
            SpateDreapta.setTargetPosition(-1000);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(0.1);
            FataDreapta.setPower(0.1);
            SpateStanga.setPower(0.1);
            SpateDreapta.setPower(0.1);
            sleep(1900);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            Servo_Servo.setPosition(1);
            Eticheta.setPosition(-1);
            sleep(1500);
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataStanga.setTargetPosition(-1000);
            FataDreapta.setTargetPosition(-1000);
            SpateStanga.setTargetPosition(-1000);
            SpateDreapta.setTargetPosition(-1000);
            FataStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateStanga.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            SpateDreapta.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            FataStanga.setPower(0.1);
            FataDreapta.setPower(0.1);
            SpateStanga.setPower(0.1);
            SpateDreapta.setPower(0.1);
            sleep(1500);
        }
    }
}