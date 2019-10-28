public class AssestmentTest{
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int option;
      System.out.println("");
      do {
          System.out.println("Exercício 1 ");
          System.out.println("Exercício 2");
          System.out.println("Exercício 3");
          option = keyboard.nextInt();
          switch (option) {
          case 1:
              System.out.println("VENDER BILHETE");
              CinemasActions.sellTicket();
              break;
          case 2:
              System.out.println("IMPRIMIR SALA DE CINEMA");
              break;
          default:
              System.out.println("Até amanhã");
          }
      } while (option != 0);
  
   }   
      public static double avg(int[] numbers) {
            int  soma;
               for (int i = 0; i < numbers.length; i++){

                soma = soma + numbers[i];
               }
            double media = soma / numbers.length;
            return media;
      }
   
     public class Assestementest1 {

      public static boolean requireRange(int lowerBound, int upperBound, int value){

         boolean Resposta;
         if (lowerBound <= value && upperBound > value){
            Resposta = true;
         }
      }
      System.out.println(Resposta);
   } 

   public class Assestementest2{
      public static boolean hasPassed(int[] grades){
         boolean check;
         for (int i=0 ;i < grades.length; i++){
            if(grades[i]>=0 && grades[i]=<20){
               int soma = soma + grades[i];   
            }else{
               int notinRange=notinRange + 1;
            }
         }
         double avg = soma/(grades.length - notinRange);
         if (avg>=9,5){
            check = True;
         }else{chech = False;}
         return check;

      }
   }
}