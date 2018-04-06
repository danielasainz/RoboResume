package com.Sainz;

public class Skills {
    private String skillName;
    private String skillProficiency;

    @Override
    public String toString() {
        return "Skill: " + skillName + " " + "Proficiency: " + skillProficiency;
    }


    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillProficiency() {
        return skillProficiency;
    }

    public void setSkillProficiency(String skillProficiency) {
        this.skillProficiency = skillProficiency;
    }
}
