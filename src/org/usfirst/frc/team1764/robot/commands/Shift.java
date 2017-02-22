package org.usfirst.frc.team1764.robot.commands;

import org.usfirst.frc.team1764.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class Shift extends InstantCommand {
	private boolean gear;

    public Shift(boolean gear) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    	this.gear = gear;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.chassis.setShifter(gear);
    }
}
