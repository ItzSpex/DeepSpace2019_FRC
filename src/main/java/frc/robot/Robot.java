

package frc.robot;
import com.spikes2212.genericsubsystems.drivetrains.TankDrivetrain;
import com.spikes2212.genericsubsystems.drivetrains.commands.DriveTank;
import com.spikes2212.utils.InvertedConsumer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.commands.commandgroups.Auto;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static TankDrivetrain drivetrain;
  public static OI oi;
  Command autonomousCommand;
  @Override
  public void robotInit() {
    drivetrain = new TankDrivetrain(SubsystemComponents.Drivetrain.LeftMotors::set
            ,new InvertedConsumer(SubsystemComponents.Drivetrain.RightMotors::set));
    drivetrain.setDefaultCommand(new DriveTank(drivetrain,oi::getForwardDriver, oi::getRotationDriver));
    oi = new OI();

  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    autonomousCommand = new Auto();
    if (autonomousCommand != null)
      autonomousCommand.start();
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    if (autonomousCommand != null)
      autonomousCommand.cancel();
  }


  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
  @Override
  public void testPeriodic() {
  }
}
