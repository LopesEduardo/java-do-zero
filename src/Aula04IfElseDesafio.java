import java.util.Scanner;
public class Aula04IfElseDesafio {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota");
        double nota = scanner.nextDouble();
        if (nota >= 7){
            System.out.println("Parabéns Voce passou!:-)");
        } else {
            System.out.println("Infelizmente você não passou!:-(");
        }
        scanner.close();
    }
}
