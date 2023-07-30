package main;

public class TestRobotBuilder {

    public static void main(String[] args){

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEnginner robotEnginner = new RobotEnginner(oldStyleRobot);

        robotEnginner.makeRobot();

        Robot firstRobot = robotEnginner.getRobot();

        System.out.println(firstRobot);
        System.out.println("Robot Built");
        System.out.println("Robot Head Type : " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type : " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type : " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type : " + firstRobot.getRobotLegs());

    }
}
