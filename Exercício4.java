import java.util.Random;
import java.util.Scanner;

public class Exercício4 {
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

        // -------------------------------------Inglês------------------------------//
        case "Monday":
            System.out.println("Segunda");
            break;
        case "Tuesday":
            System.out.println("Terça");
            break;
        case "Wednesday":
            System.out.println("Quatra");
            break;
        case "Thursday":
            System.out.println("Quinta");
            break;
        case "Friday":
            System.out.println("Sexta");
            break;
        case "Saturday":
            System.out.println("Sabado");
            break;
        case "Sunday":
            System.out.println("Domingo");
            break;
        default:
            break;
        }
    }
}
