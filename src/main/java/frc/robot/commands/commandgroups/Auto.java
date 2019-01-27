package frc.robot.commands.commandgroups;

import com.spikes2212.genericsubsystems.drivetrains.commands.DriveTank;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;


public class Auto extends CommandGroup {

    public Auto() {
        addSequential(new DriveTank(Robot.drivetrain,0.8,0.8),0.5);
        addSequential(new DriveTank(Robot.drivetrain,-0.8,-0.8),0.5);
    }
}
