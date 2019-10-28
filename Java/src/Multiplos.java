public class Multiplos {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;

        while(n<i) {
            if ((n%3==0) && (n%5==0)) {
                System.out.println("FizzBuzz");
            } else if (n%3==0){
                System.out.println("Fizz");
            } else if (n%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(n);
                i=i+1;
                
            }
        }
    }
}
    
    
