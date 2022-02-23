package ru.job4j.inheritance;

public class Engineer extends Profession {

    private boolean engineeringKnowledge;

    public Engineer(String name, String surname, String education, String birthday, boolean engineeringKnowledge) {
        super(name, surname, education, birthday);
        this.engineeringKnowledge = engineeringKnowledge;
    }

    public void diagnose(String patientName) {
        System.out.println("Doctor diagnoses patient: " + patientName);
    }
}
