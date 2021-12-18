package io.khasang;

import java.util.Scanner;

public class Magnit extends Thing{
    private String placeFrom;
    private Scanner scanner;

    public Magnit(Count count) {
        super(count);
        System.out.println("Введите место, откуда магнит");
        this.scanner = new Scanner(System.in);
        this.placeFrom = scanner.nextLine();
    }

    public Magnit(String name, Count count, String placeFrom) {
        super(name, count);
        this.placeFrom = placeFrom;
        this.scanner = new Scanner(System.in);
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    @Override
    public String toString() {
        return name + " id: " + id + ", привезен из " + placeFrom;
    }
}
