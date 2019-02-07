package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class SubsystemComponents {
    public static class Drivetrain
    {
        public static final SpeedControllerGroup RightMotors = new SpeedControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT1)
                , new WPI_TalonSRX(RobotMap.CAN.DRIVE_RIGHT2));
        public static final SpeedControllerGroup LeftMotors = new SpeedControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT1)
                , new WPI_TalonSRX(RobotMap.CAN.DRIVE_LEFT2));
    }
    public static class Hand
    {
        public static final SpeedControllerGroup Motors = new SpeedControllerGroup(
                new WPI_TalonSRX(RobotMap.CAN.HAND_MOTOR1)
                , new WPI_TalonSRX(RobotMap.CAN.HAND_MOTOR2));
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
