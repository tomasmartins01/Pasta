import java.util.Scanner;//Impotação da biblioteca do scanner
public class Tom{
	public static void main(String[] args) {
		Scanner receber = new Scanner(System.in);//variavel que vai receber o que for escrito pelo utilizador
		System.out.print(" ");
        Integer nomeUtilizador=receber.nextInt();


        if(nomeUtilizador<20){
        System.out.println();
        System.out.println("Whaaaaat so tens  "+nomeUtilizador +" centimetros de piroca fodasse, mas és anão??");
        System.out.println();
    }
        if(nomeUtilizador>20 && nomeUtilizador!=69){
        System.out.println();
        System.out.println("Whaaaaat   "+nomeUtilizador +" centimetros de piroca fodasse, ÉS UM HOMEM");
        System.out.println();
        }

        if(nomeUtilizador==69){
            System.out.println();
            System.out.println("ÉS O PIROCOSSAURO REX");
            System.out.println();
            }
	}
}