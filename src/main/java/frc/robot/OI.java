//----------------------------------------------------------------------------
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystem;
import com.spikes2212.utils.RunnableCommand;
import com.spikes2212.utils.XboXUID;

import edu.wpi.first.wpilibj.buttons.Button;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private XboXUID driver = new XboXUID(0);
    private XboXUID operator = new XboXUID(1);
    Button HandFButton;
    Button HandBButton;
    Button HandSBButton;
    Button HandSFButton;
    Button Intake;
    Button Outtake;
    Button ForkClose;
    Button ForkOpen;
    Button ForkStall;
    Button switchToFirst;
    Button switchToSecond;
    public OI()
    {
        operatorButtons();
        driverButtons();
    }
    void operatorButtons()
    {
        HandBButton = operator.getGreenButton();
        HandFButton = operator.getRedButton();
        HandSBButton = operator.getBlueButton();
        HandSFButton = operator.getYellowButton();
        HandFButton.whileHeld(new MoveBasicSubsystem(Robot.hand, SubsystemConstants.hand.FORWARD));
        HandBButton.whileHeld(new MoveBasicSubsystem(Robot.hand, SubsystemConstants.hand.BACKWARD));
        HandSBButton.toggleWhenPressed(new MoveBasicSubsystem(Robot.hand, SubsystemConstants.hand.STALL_BACKWARD));
        HandSFButton.toggleWhenPressed(new MoveBasicSubsystem(Robot.hand, SubsystemConstants.hand.STALL_FORWARD));
        Intake = operator.getRBButton();
        Intake.whileHeld(new MoveBasicSubsystem(Robot.intake, SubsystemConstants.intake.INTAKE));
        Outtake = operator.getLBButton();
        Outtake.whileHeld(new MoveBasicSubsystem(Robot.intake, SubsystemConstants.intake.OUTTAKE));
    }
    void driverButtons()
    {
        ForkClose = driver.getLBButton();
        ForkOpen = driver.getRBButton();
        ForkStall = driver.getGreenButton();
        ForkClose.whileHeld(new MoveBasicSubsystem(Robot.fork, SubsystemConstants.fork.CLOSE_SPEED));
        ForkOpen.whileHeld(new MoveBasicSubsystem(Robot.fork, SubsystemConstants.fork.OPEN_SPEED));
        ForkStall.toggleWhenPressed(new MoveBasicSubsystem(Robot.fork, SubsystemConstants.fork.STALL_SPEED));
        switchToFirst = driver.getBlueButton();
        switchToSecond = driver.getYellowButton();
        switchToFirst.whenPressed(new RunnableCommand(()->Robot.camerashandler.switchCamera(RobotMap.USB.FIRST_CAMERA)));
        switchToSecond.whenPressed(new RunnableCommand(()->Robot.camerashandler.switchCamera(RobotMap.USB.SECOND_CAMERA)));
    }
    public double getForwardDriver()
    {
        return  Math.pow (driver.getLeftY(), 3);
    }

    public double getRotationDriver()
    {
        return -Math.pow(driver.getRightX(), 3);
    }

}

