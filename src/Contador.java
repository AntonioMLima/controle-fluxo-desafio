import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int primeiroNum = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int segundoNum = scanner.nextInt();

        try {
            contar(primeiroNum, segundoNum);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Parâmetros inválidos: o segundo paramêtro deve ser maior que o primeiro.");
        }

        scanner.close();
    }

    static void contar(int primeiroParam, int segundoParam) throws ParametrosInvalidosException{
        if (segundoParam < primeiroParam){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = segundoParam - primeiroParam;
            for (int c = 1; c <= contagem; c++) {
                System.out.println(String.format("Contando...%d", c));
            }
        }
    }

}
