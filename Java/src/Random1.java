public class Random1 {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] dados = new int[n];
        int max=0;
        for (int i=0; i < n; i++){
            dados[i] = (int)(Math.random() * 21 + 1);

            max=Math.max(dados[i],max);
            System.out.println(dados[i]);
        }
        System.out.println("O Máximo é "+ max);
    }
   
}
