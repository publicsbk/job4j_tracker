package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student ivanIvanov = new Student();
        ivanIvanov.setName("Ivan");
        ivanIvanov.setMiddleName("Ivanovich");
        ivanIvanov.setSurname("Ivanov");
        ivanIvanov.setGroup(1110);
        ivanIvanov.setEntryDate("01.09.2022");
        System.out.println("Name: " + ivanIvanov.getName() + " " + ivanIvanov.getMiddleName()
                + " " + ivanIvanov.getSurname() + "\nGroup number: " + ivanIvanov.getGroup()
                + "\nCollege entry date: " + ivanIvanov.getEntryDate());
    }
}
