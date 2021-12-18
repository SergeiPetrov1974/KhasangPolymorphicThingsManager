package io.khasang;

import java.util.Scanner;

public class Book extends Thing{
    private final String author;
    private final long ISBN;
    private Scanner scanner;

    public Book(Count count) {
        super(count);
        System.out.println("Введите автора новой книги");
        this.scanner = new Scanner(System.in);
        this.author = scanner.nextLine();
        System.out.println("Введите ISBN новой книги");
        this.ISBN = scanner.nextLong();
        scanner.nextLine();
        System.out.printf("%nСоздана \"%s\" автор %s, её id %d, ISBN: %d%n",name, author, id, ISBN);
    }

    public Book(String name, Count count, String author, long ISBN) {
        super(name, count);
        this.author = author;
        this.ISBN = ISBN;
        this.scanner = new Scanner(System.in);
    }

    public String getAuthor() {
        return author;
    }

    public long getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return name + "\"" + " " + author + " id: " + id + ", ISBN: " + ISBN;
    }
}
