package robotcode.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Ashwin, James, Kavya, Calvin and Emily
 */
public class DriveTrain extends Subsystem {
    private Talon[] talons;
    public DriveTrain()
    {
        for(int i = 0;i<4;i++)
            talons[i] = new Talon(i+1);
    }    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public Talon getTalonObj(int talon){
        return talons[talon];
    }
    public double getTalon(int talon){
        return talons[talon].get();
    }
    public void setTalon(int talon, double speed){
        talons[talon].set(speed);
    }
}   