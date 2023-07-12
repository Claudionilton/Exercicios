import java.util.Scanner;
public class Main {
/**
    Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 **/
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float numero1;
        float numero2;
        int operacao;
        char desejaContinuar = 's';


        while(desejaContinuar == 's' || desejaContinuar == 'S') {

            System.out.println("Operações matematicas ");
            System.out.println("Digite o primeiro numero: ");
            numero1 = leitor.nextFloat();
            System.out.println("Digite o segundo numero: ");
            numero2 = leitor.nextFloat();
            System.out.println("Qual operação deseja realizar?");
            System.out.println("Digite 1 para SOMA");
            System.out.println("Digite 2 para SUBTRAÇÃO");
            System.out.println("Digite 3 para MULTIPLICAÇÃO");
            System.out.println("Digite 4 para DIVISÃO");
            operacao = leitor.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("A soma dos numeros é: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("A subtração dos numeros é: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("A multiplicação dos numeros é: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("A divisão dos numeros é: " + (numero1 / numero2));
                    break;


            }
            System.out.println("Deseja realizar outra operação? S - SIM / N - NÃO");
            desejaContinuar = leitor.next().charAt(0);
        }
    }
}