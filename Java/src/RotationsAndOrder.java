import java.util.Arrays;

public class RotationsAndOrder {
    public static void main(String[] args) {

        int[] n1 = new int[] { 12, 2, 32, 14, 5 }; // Criação de um array
        int rotations = Integer.parseInt(args[0]); // criação de uma variavel rotations que vai guardar o numero de
                                                   // rotações que a array vai efetuar
        System.out.println();
        System.out.println("Posição original do Array: " + Arrays.toString(n1));
        rotacao(n1, rotations); // chamar a função rotação
        System.out.println("Rotações: " + rotations); // fazer print no numero de rotações que o programa vai fazer

        for (int i = 0; i < n1.length; i++) { // criação de um ciclo for onde criamos uma variavel que vai ser 0 e vai
                                              // ser comparada ao numero de numeros que estão dentro do array

            System.out.print(" -> " + n1[i]);
        }
        System.out.println("");
        System.out.println("");
        Ordenar(n1);// Chamar a função Ordenar
    } 

    public static void rotacao(int[] arr, int N_Rotações) {
        if (arr.length < 2) {
            System.out.println("");
            System.out.println(" O Array está vazio ou têm apenas um numero");
            return; //
        }
        if ((N_Rotações%4==0){

            System.out.println();
        }
        for (int i = 0; i < N_Rotações; i++) {
            int temp = arr[0]; // primeiro elemento do array
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j]; // Vai trocar
            }
            arr[arr.length - 1] = temp;
        }
    }
        
    public static void Ordenar(int[] arr) { // Iniciar a função Ordenar
        int[] array = arr; 
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Ordenação:");
        for (int i = 0; i < array.length; i++) {

            System.out.print(" -> " + array[i]);
        }
        System.out.println("");
    }
}