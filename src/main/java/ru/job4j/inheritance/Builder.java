package ru.job4j.inheritance;

public class Builder extends Engineer {

    private boolean buildingSkill;

    public Builder(String name, String surname, String education, String birthday,
                   boolean engineeringKnowledge, boolean buildingSkill) {
        super(name, surname, education, birthday, engineeringKnowledge);
        this.buildingSkill = buildingSkill;
    }

    public void building(String constructionName) {
    }
}
