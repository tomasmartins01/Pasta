class App4 {

    public static void main(String[] args) {

System.out.println("A soma é " + sum(1,2));
System.out.println("A soma é " + sum(new int[]{1,2,3,4}));

    }

    static int sum(int a, int b) {
        return a + b;

    }

    public static int sum(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma = array[i] + soma;
        }
        return soma;
    }

    public static int[] Tointarray(String[]array){


        int[] result = new int[array.length]; //muda o array de strings para 
        for (int i=0; i<array.length;i++){

            result[i]=Integer.parseInt (array[i]);
    }
    return result;
}
}

