public class Toinarray{
    public static void main(String[] args) {
        
    public static int[] Tointarray(String[]array){


        int[] result = new int[array.length];
        for (int i=0; i<array.length;i++){

            result[i]=Integer.parseInt (array[i]);
    }
    return result;
}
}