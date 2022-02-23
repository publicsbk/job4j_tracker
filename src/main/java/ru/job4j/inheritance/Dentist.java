package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private boolean teethDrillingSkill;

    public Dentist(String name, String surname, String education, String birthday,
                   boolean anatomyKnowledge, boolean teethDrillingSkill) {
        super(name, surname, education, birthday, anatomyKnowledge);
        this.teethDrillingSkill = teethDrillingSkill;
    }

    public void teethDrilling(String patient) {
    }
}
