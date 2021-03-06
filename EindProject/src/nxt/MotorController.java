package nxt;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

public class MotorController {

	private final static float wheelDiameter = 32;
	private final static float wheelSpace = 170;
	private final static NXTRegulatedMotor leftMotor = Motor.A;
	private final static NXTRegulatedMotor rightMotor = Motor.B;
	//private float speed;
	
	private static DifferentialPilot differentialPilot = new DifferentialPilot(
			wheelDiameter, wheelSpace, leftMotor, rightMotor);

	public static void driveArc(float turnRadius) {
		differentialPilot.arcForward(turnRadius);
	}

	public static void driveForward() {
		differentialPilot.forward();
	}

	public static void stop() {
		differentialPilot.stop();
	}

	public static void turnOnPlace(float degrees, boolean moveOn) {
		differentialPilot.rotate(degrees, moveOn);
	}
	
	public static void turnOnPlace(float degrees) {
		differentialPilot.rotate(degrees);
	}

	public static void driveBackwards() {
		differentialPilot.backward();
	}
	public static void driveDistance(float distance){
		differentialPilot.travel(distance);
	}
	
	public static boolean moving(){
		return differentialPilot.isMoving();
	}
	
	public static void driveArc(float turnRadius, boolean immediateReturn) {
		differentialPilot.arc(turnRadius, 360, immediateReturn);
		
	}

	public static void DriveArc(int i, int aRC_DEGREES, boolean b) {
		differentialPilot.arc(i, aRC_DEGREES, b);		
	}
}
