/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.spikes2212.utils.XboXUID;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private XboXUID driver = new XboXUID(0);

    public double getForwardDriver() {
        return  Math.pow (driver.getLeftY(), 3);
    }

    public double getRotationDriver() {
        return Math.pow(driver.getRightX(), 3);
    }

}

