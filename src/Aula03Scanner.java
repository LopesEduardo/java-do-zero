import java.util.Scanner;
public class Aula03Scanner {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");

        String nome = scanner.nextLine();

        System.out.println("Prazer em conhecer você, " + nome + "!");

        scanner.close();
    }

}
