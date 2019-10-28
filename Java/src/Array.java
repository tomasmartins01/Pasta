import java.util.Arrays;
public class Array {
   public static void main(String[] args) {
       int[][] box = { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 6, 7 }, { 8, 9 } };
       int[] n = box[4];
       System.out.println(Arrays.toString(n));
   }
}

