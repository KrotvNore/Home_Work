package Task4;

import java.util.*;

public class draft {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1};
        Arrays.sort(numbers); // Сортировка
        System.out.println(Arrays.toString(numbers)); // [1, 3, 5, 8]


        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("zakhar");
        System.out.println(list.get(2)); // Вывод: zakhar


        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(5);
        list1.add(7);
        System.out.println(list1.get(1)); // Вывод: 7


        HashSet<String> set = new HashSet<>();
        set.add("Zakhar");
        set.add("Rar222");
        System.out.println(set.contains("rar222")); // false
        System.out.println(set.contains("Rar222")); // true

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        System.out.println(map.get(1)); // Один
    }
}
