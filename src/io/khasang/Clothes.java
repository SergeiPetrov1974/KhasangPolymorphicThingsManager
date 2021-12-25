package io.khasang;

import java.util.Scanner;

public class Clothes extends Thing {
    private final int size;
    private final Scanner scanner;

    public Clothes(Count count) {
        super(count);
        System.out.println("Введите размер новой вещи");
        this.scanner = new Scanner(System.in);
        checkNumber();
        this.size = scanner.nextInt();
        this.scanner.nextLine();
    }

    private void checkNumber() {
        while (!scanner.hasNextInt()) {
            System.out.println("Ввод размера одежды необходимо сделать цифрами '1,2,3'. Повторите попытку.");
            scanner.next();
        }
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
