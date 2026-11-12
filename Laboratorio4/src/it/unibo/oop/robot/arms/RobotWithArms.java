package it.unibo.oop.robot.arms;

import it.unibo.oop.robot.base.Robot;

public interface RobotWithArms extends Robot {
	
	boolean pickUp();
	
	boolean dropDown();
	 
	int getCarriedItemsCount(); 
}
