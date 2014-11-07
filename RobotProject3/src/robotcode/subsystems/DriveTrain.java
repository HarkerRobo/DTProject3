package robotcode.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Ashwin, James, Kavya, Calvin and Emily
 */
public class DriveTrain extends Subsystem {
    private Talon talon1;
    private Talon talon2;
    private Talon talon3;
    private Talon talon4;
    public DriveTrain()
    {
        talon1 = new Talon(1);
        talon2 = new Talon(2);
        talon3 = new Talon(3);
        talon4 = new Talon(4);
    }    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Talon getTalon1()
    {return talon1;}
    public Talon getTalon2()
    {return talon2;}
    public Talon getTalon3()
    {return talon3;}
    public Talon getTalon4()
    {return talon4;}
}
