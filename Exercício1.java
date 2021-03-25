import java.util.Random;
import java.util.Scanner;


public class Exercício1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Horas que trabalhou ? ");
        int horas = sc.nextInt();
        System.out.println("Preço por hora ?");
        double preço = sc.nextDouble();
        System.out.println("Descontos para o seguro ?");
        double seguro = sc.nextDouble();
        System.out.println("Descontos para a segurança social?");
        double segurança = sc.nextDouble();
        
        System.out.println("Horas que trabalhou" + " " + horas + " " + "Preço por hora " + preço + " " + "Descontos para o seguro" + " " + seguro + " " + "Descontos para a segurança social" + " " + segurança);

        double salario = horas * preço;
        System.out.println("Salario total do trabalhador  " + salario);

        double liquido = salario - seguro - segurança;
        System.out.println("Resultado liquido " + liquido);
    }
}

