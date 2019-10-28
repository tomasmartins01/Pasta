public class Max{
  public static void main(String[] args) {
     int numero = args.length - 1 ;
     int max = 0;
        for( int i = 0; i <= numero; i++)
        { 
     int a = Integer.parseInt(args[i]);
        if(a>max)
        {
       max=a;
       }
  }
  System.out.println("o maior numero é: " + max);
}
}