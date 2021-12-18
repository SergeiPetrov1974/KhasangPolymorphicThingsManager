package io.khasang;

import java.util.Scanner;

public class Thing {
    protected String name;
    protected int id;
    private Scanner scanner;

    public Thing(Count count) {
        System.out.println("Введите имя новой вещи");
        this.scanner =new Scanner(System.in);
        this.name = scanner.nextLine();
        this.id = count.getCount();
    }

    public Thing(String name, Count count) {
        this.name = name;
        this.id = count.getCount();
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " id: " + id;
    }
}
