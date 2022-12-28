package Class.For;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 10, 9, -4, 21};
        System.out.println(array[0]);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }
}
