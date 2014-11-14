/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotcode.commands;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author james_000
 */
public class CMDManualDrive extends CommandBase {
    Joystick joy1;
    Joystick joy2;
    public CMDManualDrive(Joystick stick1, Joystick stick2) {
        joy1 = stick1;
        joy2 = stick2;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveTrain.setLeftTalon(joy1.getY());
        driveTrain.setRightTalon(joy2.getY());
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return oi.gamepad.getButtonYState(); 
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
