import java.util.Scanner;
public class Main {
/**
    Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 **/
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float numero1;
        float numero2;

        System.out.println("Operações matematicas ");
        System.out.println("Digite o primeiro numero: ");
        numero1 = leitor.nextFloat();
        System.out.println("Digite o segundo numero: ");
        numero2 = leitor.nextFloat();

        System.out.println("A soma dos numeros é: " + (numero1+numero2));
        System.out.println("A subtração dos numeros é: " + (numero1-numero2));
        System.out.println("A multiplicação dos numeros é: " + (numero1*numero2));
        System.out.println("A divisao numeros é: " + (numero1/numero2));

    }
}