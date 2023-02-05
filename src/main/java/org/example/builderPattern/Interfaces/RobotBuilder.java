package org.example.builderPattern.Interfaces;

import org.example.builderPattern.Robot;

public interface RobotBuilder {

    public void buildHead();

    public void buildTorso();

    public void buildArms();

    public Robot getRobot();
}
