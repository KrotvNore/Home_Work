package Task4;

public class Hw4_3<T> {
    private Object[] node; // массив для хранения элементов
    private int size;      // текущий размер списка (количество элементов)

    public Hw4_3() { // создаём список с фиксированным размером
        node = new Object[50];
        size = 0;
    }

    public void add(T element) { // метод для добавления одного элемента в конец списка
        if (size >= node.length) {
            System.out.println("Ошибка: список переполнен, невозможно добавить новый элемент.");
            return;
        }
        node[size] = element; // записываем элемент в массив
        size++;               // увеличиваем размер списка
    }

    public void remove(int index) { // метод для удаления элемента по индексу
        if (index < 0 || index >= size) {
            System.out.println("Ошибка: индекс " + index + " выходит за пределы размера списка.");
            return;
        }
        for (int i = index; i < size - 1; i++) { // сдвигаем элементы влево, начиная с указанного индекса
            node[i] = node[i + 1];
        }
        node[size - 1] = null; // очищаем последний элемент
        size--;                // уменьшаем размер списка
    }

    public T get(int index) { // метод для получения элемента по индексу
        if (index < 0 || index >= size) {
            System.out.println("Ошибка: некорректный индекс " + index);
            return null;
        }
        return (T) node[index]; // возвращаем элемент
    }

    public void print() { // метод для вывода всех элементов списка
        System.out.print("Список: ");
        for (int i = 0; i < size; i++) {
            System.out.print(node[i] + " ");
        }
        System.out.println(); // для перехода на новую строку после вывода списка
    }

    public int size() { // метод для получения текущего размера списка
        return size;
    }

    // Тестируем работу списка
    public static void main(String[] args) {
        Hw4_3<Integer> list = new Hw4_3<>();

        // добавляем элементы
        list.add(5);
        list.add(10);
        list.add(15);
        list.print(); // Список: 5 10 15

        // удаляем элемент
        list.remove(1);
        list.print(); // Список: 5 15

        // получаем элемент по индексу
        System.out.println("Элемент с индексом 0: " + list.get(0)); // 5

        // размер списка
        System.out.println("Размер списка: " + list.size()); // 2

        // добавляем больше элементов
        list.add(20);
        list.add(25);
        list.print(); // Список: 5 15 20 25
    }
}
