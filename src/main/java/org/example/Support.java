package org.example;

public class Support {
    String skill;
    String nickName;


    public Support(String skill, String nickName){
        this.skill = skill;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Support: " +
                "skill = " + skill +
                ", nickName = " + nickName;
    }
}
