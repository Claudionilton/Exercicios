import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        float salario;
        float totalVenda;
        float salarioComissao = 0;
        float comissao = 0;

        System.out.println("Nome do vendedor");
        nome = leitor.nextLine();
        System.out.println("Salario fixo");
        salario = leitor.nextFloat();
        System.out.println("Total vendido no mes em dinheiro");
        totalVenda = leitor.nextFloat();

        comissao = (totalVenda/100) * 15;
        salarioComissao = salario+comissao;

        System.out.println("Neste mês o vendedor "+ nome +", que tem o salario de R$:"+salario+
                " receberá R$:"+salarioComissao+ " com um acrescimo de R$:"+comissao+
                " devido ao valor de " +totalVenda+" vendidos neste mes." );

    }
}