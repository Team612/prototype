package org.usfirst.frc.team612.robot.subsystems;

import org.usfirst.frc.team612.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SolenoidSS extends Subsystem {
	public DoubleSolenoid solenoid_one = new DoubleSolenoid(RobotMap.PCM_solenoid_G,RobotMap.solenoid_G_one,RobotMap.solenoid_G_two);
	DoubleSolenoid solenoid_two = new DoubleSolenoid(RobotMap.PCM_solenoid_G,RobotMap.solenoid_G_one,RobotMap.solenoid_G_two);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public DoubleSolenoid getSolenoid(int num) {
    	if(num ==1) {
    		return solenoid_one;
    	}
    	else {
    		return solenoid_two;
    	}
    }
}

