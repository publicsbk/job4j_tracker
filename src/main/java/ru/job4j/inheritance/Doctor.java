package ru.job4j.inheritance;

public class Doctor extends Profession {

    private boolean anatomyKnowledge;

    public Doctor(String name, String surname, String education, String birthday, boolean anatomyKnowledge) {
        super(name, surname, education, birthday);
        this.anatomyKnowledge = anatomyKnowledge;
    }

    public void diagnose(String patientName) {
    }
}
