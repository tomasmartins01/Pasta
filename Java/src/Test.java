import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        Scanner users = new Scanner(System.in);
        System.out.println("Insere o numero de users");
       
        int x = users.nextInt();
        for (int i = 0; i < users; i++) {
            
            System.out.println("Insere o teu nome");
            String name = Scan.nextLine();
            System.out.println("Insere a tua idade");
            int age = Scan.nextInt();
            System.out.println("Insere o teu salário");
            double salary = Scan.nextDouble();
        
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Salário: " + salary);
        }   
    }
}