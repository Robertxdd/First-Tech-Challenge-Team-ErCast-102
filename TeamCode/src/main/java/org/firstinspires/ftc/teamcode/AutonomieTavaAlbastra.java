package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="Basic: Linear OpMode", group="Linear Opmode")
//@Disabled
public class AutonomieTavaAlbastra extends LinearOpMode {

    private DcMotor FataStanga;
    private DcMotor FataDreapta;
    private DcMotor SpateStanga;
    private DcMotor SpateDreapta;
    private Servo _1;
    private Servo _3;

    @Override
    public void runOpMode() {
        FataStanga = hardwareMap.dcMotor.get("Fata Stanga");
        FataDreapta = hardwareMap.dcMotor.get("Fata Dreapta");
        SpateStanga = hardwareMap.dcMotor.get("Spate Stanga");
        SpateDreapta = hardwareMap.dcMotor.get("Spate Dreapta");
        _1 = hardwareMap.servo.get("1");
        _3 = hardwareMap.servo.get("3");

        waitForStart();
        if (opModeIsActive()) {
            //fata
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
            //lateral
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
            sleep(800);
            //stanga
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
            //lateral / servo sus
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
            _1.setPosition(-1);
            _3.setPosition(1);
            sleep(1100);
            //servo sus
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            _1.setPosition(1);
            _3.setPosition(-1);
            sleep(700);
            //laterala
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
            sleep(2100);
            //fata
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
            sleep(700);
            //dreapta
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
            sleep(1200);
            //lateral
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
            sleep(950);
            //spate servo sus
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            _1.setPosition(-1);
            _3.setPosition(1);
            FataStanga.setTargetPosition(1000);
            FataDreapta.setTargetPosition(1000);
            SpateStanga.setTargetPosition(1000);
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
            //laterala servo sus
            FataStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            FataDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateStanga.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            SpateDreapta.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            _1.setPosition(-1);
            _3.setPosition(1);
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
            sleep(1600);
        }
    }
}