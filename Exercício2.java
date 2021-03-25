import java.security.DrbgParameters.Reseed;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Continuar continuar = new Continuar("Voltar a jogar?");
        int primo = 2;
        do {
            System.out.println("Insere um número");
            int num = sc.nextInt();
            if (num % 2 == 0)
                System.out.println("O número " + num + " é par");
            else
                System.out.println("O número " + num + " é impar");
            if (primo(num)) {
                System.out.println("Numero é primo -> " + num);

            }

        } while (Continuar.perguntar());
    }

private static boolean primo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}