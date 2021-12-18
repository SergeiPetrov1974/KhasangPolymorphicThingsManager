package io.khasang;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public ThingsManager thingsManager;
    ArrayList<Thing> collection;
    private  Scanner scanner;

    public Menu(ThingsManager thingsManager) {
        this.thingsManager = thingsManager;
        collection = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choose = 6;
        do {
            System.out.println("\nВыберите, пункт меню");
            System.out.println("1. Показать перечень всех вещей");
            System.out.println("2. Добавить вещь в коллекцию");
            System.out.println("3. Показать информацию о вещи");
            System.out.println("4. Удалить вещь из воллекции");
            System.out.println("5. Удалить все вещи из воллекции");
            System.out.println("6. Выйти");

            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    thingsManager.showAllThings();
                    break;
                case 2:
                    thingsManager.createNewThing();
                    break;
                case 3:
                    thingsManager.showThingInfoById();
                    break;
                case 4:
                    thingsManager.removeThingById();
                    break;
                case 5:
                    thingsManager.removeAll();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Выберите один из пунктов: ");
                    break;
            }
        } while (choose != 6);
    }
}
