import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira aqui o primeiro número");
        int parametroUm = scanner.nextInt();
        System.out.println("Insira aqui o segundo número");
        int parametroDois = scanner.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }


        int contagem = parametroDois - parametroUm;
        int resultado = contagem;
        for (contagem = 0; resultado >= contagem; contagem++) {
            System.out.println("Imprimindo o número " + contagem);

        }
    }
}