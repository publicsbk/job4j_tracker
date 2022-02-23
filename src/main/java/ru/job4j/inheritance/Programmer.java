package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private boolean programmingKnowledge;

    public Programmer(String name, String surname, String education, String birthday,
                   boolean engineeringKnowledge, boolean programmingKnowledge) {
        super(name, surname, education, birthday, engineeringKnowledge);
        this.programmingKnowledge = programmingKnowledge;
    }

    public void softwareDevelopment(String scope) {
    }
}
