package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Oleg Gazmanov", "My thoughts are my horses");
        System.out.println(text);
    }
}
