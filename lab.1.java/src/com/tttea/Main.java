// Объявление класса частью пакета
package com.tttea ;
public class Main {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Tea[] breakfast = new Tea[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new greenTea();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new blackTea();
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Tea item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
        System.out.println("Всего хорошего!");
    }
}