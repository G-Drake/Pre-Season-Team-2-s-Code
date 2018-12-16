
package org.usfirst.frc.team6239.robot;


public class OI {

  public Joystick controller1;
  public Button liftcontrol;

  OI(){

    controller1 = new Joystick(0)
    liftcontrol = new JoystickButton(controller1, 0)

  }
}
