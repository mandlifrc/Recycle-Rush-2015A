package com.nicoletfear.Robot2015.commands;

import com.nicoletfear.Robot2015.OI;
import com.nicoletfear.Robot2015.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

public class Exhaust extends Command {

    public Exhaust() {
    	requires(Subsystems.toteEater);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.lbButton.get()){
    		Subsystems.toteEater.exhaust();
    	}else{
    		Subsystems.toteEater.stopEater();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
