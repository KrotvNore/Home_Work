public class twohm {
    public static void main(String[] args){
    int[] nums ={10,2,3,4,5,6};
    int x = 0; //если тут будет 4, то будет выдовать в do..while - 5 6

        System.out.println("foreach");
    for (int i : nums){
        System.out.print(i + " ");
    }

        System.out.println("\ndo...whiel");
    do {
        System.out.print(nums[x] + " "); // x в [] означает какая грубо говоря цифра по счету
        x++;
    } while (x < nums.length);

        System.out.println("\nfor");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
