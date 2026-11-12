package it.unibo.oop.robot.arms;

import it.unibo.oop.robot.base.BaseRobot;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{
	BasicArm rightArm = new BasicArm("Right arm");
	BasicArm leftArm = new BasicArm("Left arm");
	private final String robotName;
	
	RobotWithTwoArms(String robotName){
		super(robotName);
	}
}
