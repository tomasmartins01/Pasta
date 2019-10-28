public class Range {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        if (n1 > n2) {
            while (n2 <= n1) {
                System.out.println(n2);
                n2 = n2 + 1;
            } 
        } else {
            while (n1 <= n2) {
                System.out.println(n1);
                n1 = n1 + 1;
            }
        }
    }
}