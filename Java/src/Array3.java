public class Array3 {
    public static void main(String args[]) {
       int[] Array = {1, 3, 6, 4, 2};
       System.out.println("O máximo dos arrays é: "+max(Array));
       System.out.println("A média é: "+média(Array));
       System.out.println("A soma dos numeros pares é: "+sumofevens(Array));

    }
    public static int max(int [] array) {
        int max = 0;
       
        for(int i=0; i<array.length; i++ ) {
           if(array[i]>max) {
              max = array[i];
           }
        }
        return max;
     }

     public static int média(int [] array) {

        int soma = 0;
        for (int j=0; j<array.length; j++){
        soma = soma + array[j];
    }
        return soma/array.length;
       
     }

     public static int sumofevens(int[]array) {

        int soma = 0;
        for (int k=0; k<array.length; k++){
            if (array[k]%2==0){
             soma = soma + array[k];
    }
}
        return soma;
       
     }
 }