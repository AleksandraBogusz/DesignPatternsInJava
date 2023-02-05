package org.example.builderPattern;

import org.example.builderPattern.Interfaces.RobotBuilder;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildHead();
        this.robotBuilder.buildArms();
        this.robotBuilder.buildTorso();
    }
}
