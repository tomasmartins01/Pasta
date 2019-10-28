public class Random3 {
    public static void main (String[] args) {

        int[] a = new int[]{1,2,3,4,5};
            
        for (int i=0; i < a.length; i++){

             int temp= a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
            for (int x = 0; x < a.length; x++) {
                int temp = a[x];
            System.out.println(a[x]);
    }
        int[] a2 = new int[]{a.length};
}
}