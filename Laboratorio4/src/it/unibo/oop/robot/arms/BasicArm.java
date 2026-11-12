package it.unibo.oop.robot.arms;

public class BasicArm {
	
	private final String armName;
	private boolean grab;
	private static final int GRABBING_DELTA = 5;
	
	BasicArm(String name){
		this.armName = name;
	}
	
	public boolean isGrabbing() {
		return grab;
	}
	
	public void pickUp() {
		if(!grab) {
			grab = true;
		}
	}
	
	public void dropDown() {
		if(grab) {
			grab = false;
		}
	}
	
	public double getConsumptionForPickUp() {
		return this.GRABBING_DELTA;
	}
	
	public double getConsumptionForDropDown() {
		return this.GRABBING_DELTA;
	}

	public String toString() {
		return "BasicArm [armName=" + armName + ", grab=" + grab + "]";
	}
}
