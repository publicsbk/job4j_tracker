package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private boolean fleshCuttingSkill;

    public Surgeon(String name, String surname, String education, String birthday,
                   boolean anatomyKnowledge, boolean fleshCuttingSkill) {
        super(name, surname, education, birthday, anatomyKnowledge);
        this.fleshCuttingSkill = fleshCuttingSkill;
    }

    public void surgery(String patient) {
    }
}
