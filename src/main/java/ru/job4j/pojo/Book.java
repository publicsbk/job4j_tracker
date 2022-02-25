package ru.job4j.pojo;

public class Book {

    private String name;
    private int count;

    public Book(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void swap(Book[] arr, int x, int y) {
        Book temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
