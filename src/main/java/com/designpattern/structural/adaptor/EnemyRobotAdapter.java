package com.designpattern.structural.adaptor;

//EnemyAttacker is the Target Interface : This is what the client
//expects to work with.
// As per client requirement, in adaptor call we have implemented all three methods in EnemyAttacker interface
// but EnemyRobotAdapter indirectly calls the EnemyRobot robot methods.
public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot){
		
		theRobot = newRobot;
		
	}
	
	public void fireWeapon() {
		
		theRobot.smashWithHands();
		
	}

	public void driveForward() {
		
		theRobot.walkForward();
		
	}

	public void assignDriver(String driverName) {
		
		theRobot.reactToHuman(driverName);
		
	}
	
}
