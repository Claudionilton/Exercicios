import java.time.Month;
import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {

        int numeroMes;
        String nomeMes;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero do mes");
        numeroMes = leitor.nextInt();
        nomeMes = Month.of(numeroMes).name();
        System.out.println("Mês: "+nomeMes);
    }
}