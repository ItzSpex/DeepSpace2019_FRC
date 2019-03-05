

package frc.robot;
import com.spikes2212.genericsubsystems.basicSubsystem.BasicSubsystem;
import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystem;
import com.spikes2212.genericsubsystems.basicSubsystem.utils.limitationFunctions.Limitless;
import com.spikes2212.genericsubsystems.drivetrains.TankDrivetrain;
import com.spikes2212.genericsubsystems.drivetrains.commands.DriveArcade;
import com.spikes2212.utils.CamerasHandler;
import com.spikes2212.utils.InvertedConsumer;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.SubsystemComponents.Hand;
import frc.robot.SubsystemComponents.Intake;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static TankDrivetrain drivetrain;
  public static BasicSubsystem hand;
  public static BasicSubsystem intake;
  public static BasicSubsystem fork;
  public static OI oi;
  public static CamerasHandler camerashandler;
  @Override
  public void robotInit()
  {
    drivetrain = new TankDrivetrain(SubsystemComponents.Drivetrain.RightMotors::set
            ,new InvertedConsumer(SubsystemComponents.Drivetrain.LeftMotors::set));
    Hand.rightMotor.setInverted(true);
    hand = new BasicSubsystem(SubsystemComponents.Hand.Motors::set, new Limitless());
    Intake.UpMotor.setInverted(true);
    intake = new BasicSubsystem(SubsystemComponents.Intake.Motors::set, new Limitless());
    fork = new BasicSubsystem(SubsystemComponents.Fork.Motor::set, new Limitless());
    oi = new OI();
    drivetrain.setDefaultCommand(new DriveArcade(drivetrain,oi::getForwardDriver, oi::getRotationDriver));
    camerashandler = new CamerasHandler(384, 216, RobotMap.USB.FIRST_CAMERA, RobotMap.USB.SECOND_CAMERA);
    camerashandler.setExposure(50);
    hand.setDefaultCommand(new MoveBasicSubsystem(Robot.hand, oi::getHand));
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
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }


  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
  @Override
  public void testPeriodic() {
  }
}
