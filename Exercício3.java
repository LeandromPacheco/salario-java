import java.util.Random;
import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia da semana ?");
        String dias = sc.nextLine();

        switch (dias) {
        case "Segunda":
            System.out.println("Monday");
            break;
        case "Terça":
            System.out.println("Tuesday");
            break;
        case "Quatra":
            System.out.println("Wednesday");
            break;
        case "Quinta":
            System.out.println("Thursday");
            break;
        case "Sexta":
            System.out.println("Friday");
            break;
        case "Sabado":
            System.out.println("Saturday");
            break;
        case "Domingo":
            System.out.println("Sunday");
            break;
        default:
            break;
        }
    }
}
