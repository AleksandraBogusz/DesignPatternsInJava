package org.example.builderPattern;

import org.example.builderPattern.Interfaces.RobotPlan;

public class Robot implements RobotPlan {

    private String head;
    private String torso;
    private String arms;

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.torso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms = arms;
    }
}
