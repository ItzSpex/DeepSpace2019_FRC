package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

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

}
