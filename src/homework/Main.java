package homework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//Використовуючи Intelij IDEA, створити проект, пакет.
// Створити клас Main, створити список цілих чисел і за допомогою
// ListIterator пройтись по списку і збільшити значення на 1.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        System.out.println(list);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            iterator.set(current + 1);
        }
        System.out.println(list);
    }
}
