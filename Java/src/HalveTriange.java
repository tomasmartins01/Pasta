public class HalveTriange {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a > 1){
            for (int l = 0; l < a; l++) {
                for (int c = 0; c <= l; c++)
                    System.out.print("#");
                System.out.println();
            }
        }
        else {System.out.println("A altura tem de ser superior a 1!");}
    }
  }