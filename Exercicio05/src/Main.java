import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float media;

        System.out.println("Nota 1:");
        nota1 = leitor.nextFloat();
        System.out.println("Nota 2:");
        nota2 = leitor.nextFloat();
        System.out.println("Nota 3");
        nota3 = leitor.nextFloat();

        media = (nota1+nota2+nota3) / 3;

        System.out.println("A média aritmética é:"+media);
    }
}