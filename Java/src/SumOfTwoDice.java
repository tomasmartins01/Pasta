public class SumOfTwoDice { 
    public static void main(String[] args) {
        int lados = 6;
        int a =  (int) (Math.random() * lados) + 1;
        int b =  (int) (Math.random() * lados) + 1;
        int soma = a + b ;
        System.out.println("O primeiro dado é " + a  + " o segundo Dado é " + b + " a soma dos Dois é " + soma);
    }
}