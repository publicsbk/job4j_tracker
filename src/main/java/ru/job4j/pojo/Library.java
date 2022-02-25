package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 464);
        Book book2 = new Book("The Godfather", 448);
        Book book3 = new Book("For whom bell tolls", 576);
        Book book4 = new Book("Head First Java", 720);
        Book[] books = {book1, book2, book3, book4};
        for (Book bk : books) {
            System.out.println("\"" + bk.getName() + "\"" + " - " + bk.getCount() + " pages");
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("\nReplace " + "\"" + books[0].getName() + "\""
                + " to " + "\"" + books[3].getName() + "\"\n");
        for (Book bk : books) {
            System.out.println("\"" + bk.getName() + "\"" + " - " + bk.getCount() + " pages");
        }
        for (Book bk : books) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println("\n\"" + bk.getName() + "\"");
            }
        }
    }
}
