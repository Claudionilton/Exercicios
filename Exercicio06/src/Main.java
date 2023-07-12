import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Valor A");
        a = leitor.nextInt();
        System.out.println("Valor B");
        b = leitor.nextInt();

        System.out.println("Valor A:"+a);
        System.out.println("Valor B:"+b);

        c = a;
        a = b;
        b = c;


        System.out.println("Valores trocados:");
        System.out.println("Valor A:"+a);
        System.out.println("Valor B:"+b);


    }
}