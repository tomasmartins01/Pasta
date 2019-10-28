public class Teste2{
    public static void main(String[] args) {
String [][]matrix=new String[3][];

for (int i = 0 ; i < matrix.length ; i++ ){
matrix [ i ] = new String [ i + 1 ] ; 

for (int j = 0 ; j <= i ; j++ ){
    matrix[ i ]= new int[ j + 1] ;
}
  }
  System.out.println( matrix[0].length);
}
}