package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemComponents {
    public static class Drivetrain
    {
        public static final SpeedControllerGroup RightMotors = new SpeedControllerGroup(
                new VictorSP(RobotMap.PWM.DRIVE_RIGHT1)
                , new VictorSP(RobotMap.PWM.DRIVE_RIGHT2));
        public static final SpeedControllerGroup LeftMotors = new SpeedControllerGroup(
                new VictorSP(RobotMap.PWM.DRIVE_LEFT1)
                , new VictorSP(RobotMap.PWM.DRIVE_LEFT2));
    }
    public static class Hand
    {
        public static final SpeedController leftMotor = new WPI_TalonSRX(RobotMap.CAN.HAND_MOTOR1);
        public static final SpeedController rightMotor = new WPI_TalonSRX(RobotMap.CAN.HAND_MOTOR2);
        public static final SpeedControllerGroup Motors = new SpeedControllerGroup(
                leftMotor
                , rightMotor);
    }

    public static class Intake
    {
        public static final SpeedController UpMotor = new WPI_TalonSRX(RobotMap.CAN.INTAKE_UP);
        public static final SpeedControllerGroup Motors = new SpeedControllerGroup(
            Intake.UpMotor
            , new WPI_TalonSRX(RobotMap.CAN.INTAKE_DOWN));
            
                
    }

    public static class Fork
    {
        public static final SpeedController Motor = new WPI_TalonSRX(RobotMap.CAN.FORK_MOTOR);
    }

}
