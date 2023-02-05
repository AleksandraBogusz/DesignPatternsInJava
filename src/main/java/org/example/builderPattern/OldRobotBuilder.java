package org.example.builderPattern;

import org.example.builderPattern.Interfaces.RobotBuilder;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setRobotHead("head");
    }

    @Override
    public void buildTorso() {
        robot.setRobotTorso("torso");
    }

    @Override
    public void buildArms() {
        robot.setRobotArms("arms");
    }

    public Robot getRobot() {
        return this.robot;
    }
}
