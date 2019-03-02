/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.commandgroups;

import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystem;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.SubsystemConstants;

public class ForkStall extends CommandGroup {
  /**
   * Add your docs here.
   */
  public ForkStall() {
    addSequential(new MoveBasicSubsystem(Robot.fork, SubsystemConstants.fork.STALL_SPEED),15);
  }
}
