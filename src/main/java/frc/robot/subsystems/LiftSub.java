
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
package org.usfirst.frc.team6239.robot;

public class LiftSub extends Subsystem {
  

  @Override
  public void initDefaultCommand() { 
  }

  public void Run() {
  Robot.Robotmap.liftMotorControl.set(Robot.oi.liftcontrol.getRawAxis());

  }
}
