package io.khasang;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        ThingsManager thingsManager = new ThingsManager(count);
        Menu menu = new Menu(thingsManager);
        menu.showMenu();
    }
}
