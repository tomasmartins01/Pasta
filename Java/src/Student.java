import java.util.Scanner;

public class Student {
    public static int count = 0;
    public static String[] names = new String[100];
    public static int[] ages = new int[100];
    public static float[] grades = new float[100];

    public static void insertStudent() {
        System.out.println("option 1");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserir nome do Aluno");
        String name = keyboard.nextLine();

        System.out.println("Inserir idade do Aluno");
        int age = keyboard.nextInt();

        System.out.println("Inserir nota do Aluno");
        float grade = keyboard.nextFloat();
        
        count = count + 1;
        names[count - 1] = name;
        ages[count - 1] = age;
        grades[count - 1] = grade;
    }
        
    public static void print(int index){
   
            System.out.println("Name: "names[index] + "Grade " + grades[index] + "Idade" + ages[index]);

    }
    public static void print(int index){

        for (int i = 0; i < count; i++) {
            PrintStudent(i);
        }
    }
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int option;
        do {
            System.out.println("1- Inserir Aluno");
            System.out.println("2- Imprimir Relatorio");
            System.out.println("0- Sair");
            option = keyboard.nextInt();
            switch (option) {
            case 1:
                System.out.println("option 1");
                insertStudent();
                break;
            case 2:
                System.out.println("option 2");
                break;
            default:
                System.out.println("Invalido");
            }
        } while (option != 0);
    }
