import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double celcius;
        double fahrenheit = 0;
        double valorTemperatura;
        int temperatura;

        System.out.println("Conversor de temperatura Celsius para Fahrenheit.");
        System.out.println("Digite a temperatura a ser convertida");
        valorTemperatura = leitor.nextDouble();
        System.out.println("Digite 1 para converter Celsius em para Fahrenheit");
        System.out.println("Ou 2 para converter Fahrenheit em Celsius");
        temperatura = leitor.nextInt();
        switch (temperatura){
            case 1:
                fahrenheit = (valorTemperatura*9/5)+32;
                System.out.println("A temperatura em Fahrenheit é:"+fahrenheit+"F");
                break;
            case 2:
                celcius = (valorTemperatura-32)/1.8;
                System.out.println("A temperatura em Celsius é:"+celcius+"C");
                break;
        }

    }
}