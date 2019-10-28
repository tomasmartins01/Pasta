public class Sequencia {
    public static void main(String[] args) {

        int a = 100;
        int t1 = 0, t2 = 1;
        while (t1<=a) {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
 