

package org.usfirst.frc.team6239.robot;



public class Robot extends IterativeRobot {

  public static OI oi;
  public static RobotMap robotmap; 
  
  @Override
  public void robotInit() {
    oi = new OI();
    robotmap = new RobotMap();
  }

  
  @Override
  public void robotPeriodic() {
    Scheduler.getInstance().run();
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
    Scheduler.getInstance().run();
  }
}
