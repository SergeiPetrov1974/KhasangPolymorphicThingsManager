package io.khasang;

import java.util.ArrayList;
import java.util.Scanner;

public class ThingsManager {
    private ArrayList<Thing> collection;
    private Scanner scanner;
    public Count count;

    public ThingsManager(Count count) {
        this.collection = new ArrayList<Thing>();
        this.count = count;
        scanner = new Scanner(System.in);
    }

    private int getThingIndexById(int id) {
        int index = -1;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    public void addThing(Thing aThing) {
        collection.add(aThing);
        System.out.printf("%n\"%s\" добавлена в коллекцию, её id: %d%n",
                aThing.getName(), aThing.getId());
    }

    public void removeThingById() {
        System.out.println("Введите id вещи, которую Вы хотите удалить\n_");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = getThingIndexById(id);
        if (index == -1) {
            System.out.println("Вещи с таким id  в библиотеке нет");
        } else {
            System.out.printf("Вещь %s удалена из библиотеки%n", collection.get(index).getName());
            collection.remove(index);
        }
    }

    public void showThingInfoById() {
        System.out.println("Введите id вещи, информацию о которой хотите увидеть\n_");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = getThingIndexById(id);
        if (index == -1) {
            System.out.println("Вещи с таким id в библиотеке нет");
            return;
        }
        System.out.println(collection.get(index));
    }

    public void showAllThings() {
        if (collection.size() == 0) {
            System.out.println("Коллекция пуста");
            return;
        }
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(i + 1 + " " + collection.get(i));
        }
    }

    public void removeAll() {
        for (int i = collection.size() -1; i >= 0; i--) {
            collection.remove(i);
        }
        System.out.println("Все элементы коллекции удалены\n");
    }

    public void createNewThing() {
        int num = 5;
        do {
            System.out.println("\nВведите вид новой вещи:");
            System.out.println("1. Книга.");
            System.out.println("2. Магнит.");
            System.out.println("3. Одежда.");
            System.out.println("4. Другая вещь.");
            System.out.println("5. Выход.");

            num = scanner.nextInt();
            scanner.nextLine();
            switch (num) {
                case 1:
                    Book book = new Book(count);
                    addThing(book);
                    break;
                case 2:
                    Magnit magnit = new Magnit(count);
                    addThing(magnit);
                    break;
                case 3:
                    Clothes clothes = new Clothes(count);
                    addThing(clothes);
                    break;
                case 4:
                    Thing thing = new Thing(count);
                    addThing(thing);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Выберите цифру.");
                    break;
            }
        } while (num != 5);
    }
}
