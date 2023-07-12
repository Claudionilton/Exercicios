import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    float distancia = 0;
    float combustivel = 0;
    float consumoMedio;

    Scanner leitor = new Scanner(System.in);

        System.out.println("Cálculo de consumo médio.");

        System.out.println("Distancia percorrida em KM (Digite apenas numeros)");
        distancia = leitor.nextFloat();


        System.out.println("Combustivel gasto em Litros (Digite apenas numeros)");
        combustivel = leitor.nextFloat();

        consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio é de: " + consumoMedio+"km/litro");
    }

}