public class Ordenar {
    public static void main(String[] args) {
        int[] array = { 45, 12, 54, 23, 67, 98, 2, 13 };
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}