/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public interface CAN
    {
        public static final int HAND_MOTOR1 = 0;
        public static final int HAND_MOTOR2 = 1;
        public static final int INTAKE_UP = 2;
        public static final int INTAKE_DOWN = 3;
        public static final int FORK_MOTOR = 4;

    }

    public interface PWM
    {
        public static final int DRIVE_RIGHT1 = 0;
        public static final int DRIVE_RIGHT2 = 1;
        public static final int DRIVE_LEFT1 = 2;
        public static final int DRIVE_LEFT2 = 3;
    }

    public interface USB
    {
        public static final int CAMERA = 0;
    }
}
