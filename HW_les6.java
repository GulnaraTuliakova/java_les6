package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW_les6 {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
    // поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
    // и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение,
    // Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
    // по условиям.
    public static void main(String[] args) {
        // initListNotebooks();
        Notebook n1 = new Notebook();
        n1.id = 0001;
        n1.name = "asus1";
        n1.diag = 14;
        n1.price = 26199;
        n1.memory = 4;
        n1.color = "black";

        Notebook n2 = new Notebook();
        n2.id = 0002;
        n2.name = "asus2";
        n2.diag = 15;
        n2.price = 27999;
        n2.memory = 4;
        n2.color = "black";

        Notebook n3 = new Notebook();
        n3.id = 0003;
        n3.name = "huawei";
        n3.diag = 15;
        n3.price = 35999;
        n3.memory = 6;
        n3.color = "white";

        List<Notebook> notebooks = new ArrayList<Notebook>(Arrays.asList(n1, n2, n3));
        for (int index = 0; index < notebooks.size(); index++) {
            System.out.printf("id: %d, name: %s, color: %s, diag: %d, price: %d", notebooks.get(index).id,
                    notebooks.get(index).name,
                    notebooks.get(index).color, notebooks.get(index).diag, notebooks.get(index).price);
            System.out.println();
        }

        // цвет
        for (int index = 0; index < notebooks.size(); index++) {
            System.out.println();
            System.out.print("Цвет: " + notebooks.get(index).color + ": ");
            for (int i = 0; i < notebooks.size(); i++) {
                String tmp = notebooks.get(index).color;
                if (notebooks.get(i).color == notebooks.get(index).color)
                    System.out.print(notebooks.get(i).name + " ");
            }
        }
        // diag
        System.out.println();
        for (int index = 0; index < notebooks.size(); index++) {
            System.out.println();
            System.out.print("Диагональ: " + notebooks.get(index).diag + ": ");
            for (int i = 0; i < notebooks.size(); i++) {
                int tmp = notebooks.get(index).diag;
                if (notebooks.get(i).diag == notebooks.get(index).diag)
                    System.out.print(notebooks.get(i).name + " ");
            }
        }

        // price
        System.out.println();
        for (int index = 0; index < notebooks.size(); index++) {
            System.out.println();
            System.out.print("Цена: " + notebooks.get(index).price + ": ");
            for (int i = 0; i < notebooks.size(); i++) {
                int tmp = notebooks.get(index).price;
                if (notebooks.get(i).price == notebooks.get(index).price)
                    System.out.print(notebooks.get(i).name + " ");
            }
        }
    }
}
