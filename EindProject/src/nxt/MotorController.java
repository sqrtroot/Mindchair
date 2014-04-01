package nxt;

import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;

public class MotorController {
	private final static float wheelDiameter = 39;
	private final static float wheelSpace = 130;
	private final static NXTRegulatedMotor leftMotor = Motor.A;
	private final static NXTRegulatedMotor rightMotor = Motor.B;
	private float speed;

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

	public static void turnOnPlace(float degrees, boolean asdf) {
		differentialPilot.rotate(degrees, asdf);
	}

	public static void driveBackwards() {
		differentialPilot.backward();
	}

	public static void driveDistance(float distance) {
		differentialPilot.travel(distance);
	}

	public static boolean isMoving() {
		return differentialPilot.isMoving();
	}
}
