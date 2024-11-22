public class two3hm {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d", null, "f", "g", "lmao"};
        System.out.println("\nfor");
        for (int i = 0; i < words.length; i += 2) {
            if (words[i] == null) {
                System.out.print("\n Ошибка!\n");
                break;
            }
            System.out.print(words[i] + " ");
        }
    }
}
