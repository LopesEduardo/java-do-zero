import java.util.Scanner;
public class Aula03ScannerDesafio {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Prazer em conhecer você " + nome + "!");
        System.out.println("Qual é a sua cidade?");
        String cidade = scanner.nextLine();
        System.out.println("Você mora em " + cidade + ".");
        System.out.println("Qual é o seu sonho profissional?");
        String sonhoProfissional = scanner.nextLine();
        System.out.println("Seu sonho é ser " + sonhoProfissional + ".");
        System.out.println("Continue estudando");
        scanner.close();
    }
}