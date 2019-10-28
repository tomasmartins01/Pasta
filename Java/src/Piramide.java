public class Piramide {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int espacos = a;

        if (a > 1){
          
            for (int l = 0; l < espacos; l++) {

                for (int c = espacos; c >= l; c--)
                    System.out.print(" ");
                
                for (int c = 0; c*2 <= l*4; c++)
                    System.out.print("#");
                System.out.println();
            }
        }
        else {System.out.println("A altura tem de ser maior que 1!");}
    }
 }