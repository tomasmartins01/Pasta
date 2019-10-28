import java.util.Arrays;

public class Piramide2 {
    public static void main(String[] args) {
        int[][] triangle = new int[4][]; // nº de linhas
        for (int i = 0; i < triangle.length; i++) { // nº de elementos
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) { // Atualizar elementos
                triangle[i][j] = j + 1 ;
            }
        }
        for (int i = 0; i < triangle.length; i++) { // Imprimir arrays
            System.out.println(Arrays.toString(triangle[i]));
        }
    }
}