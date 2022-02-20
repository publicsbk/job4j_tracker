package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(){
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printErrorInfo() {
        System.out.println("Error status: " + active);
        System.out.println("Error code: " + status);
        System.out.println("Error description: " + message);
    }

    public static void main(String[] args) {
        Error compError = new Error(true, 666, "compile Error");
        compError.printErrorInfo();
    }

}
