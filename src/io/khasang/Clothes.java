package io.khasang;

import java.util.Scanner;

public class Clothes extends Thing {
    private int size;
    private Scanner scanner;

    public Clothes(Count count) {
        super(count);
        System.out.println("Введите размер новой вещи");
        this.scanner = new Scanner(System.in);
        this.size = scanner.nextInt();
        this.scanner.nextLine();
    }

    public Clothes(String name, Count count, int size) {
        super(name, count);
        this.size = size;
        this.scanner = new Scanner(System.in);
    }

    public int getSize() {
        return size;
    }

    @Override
    public  String toString() {
        return name + " id: " + id + ", размер " + size;
    }
}
