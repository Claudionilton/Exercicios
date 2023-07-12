import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        float salarioFuncionario;
        float salarioMinimo;
        float novoSalario;
        float custoEmpresa;

        System.out.println("Nome do funcionario");
        nome = leitor.nextLine();
        System.out.println("Salario atual do funcionario");
        salarioFuncionario = leitor.nextFloat();
        System.out.println("Salario minimo atual");
        salarioMinimo = leitor.nextFloat();

        if(salarioFuncionario <= salarioMinimo*3){
            custoEmpresa = (salarioFuncionario/100)*50;
            novoSalario = salarioFuncionario+custoEmpresa;
            System.out.println("O funcionario "+nome+" recebera um novo salario de R$"+novoSalario +
                    " e vai aumentar "+custoEmpresa+" de custo para a empresa.");
        } else if (salarioFuncionario > salarioMinimo*3 && salarioFuncionario <= salarioMinimo*10 ) {
            custoEmpresa = (salarioFuncionario/100)*20;
            novoSalario = salarioFuncionario+custoEmpresa;
            System.out.println("O funcionario "+nome+" recebera um novo salario de R$"+novoSalario +
                    " e vai aumentar "+custoEmpresa+" de custo para a empresa.");
        } else if (salarioFuncionario > salarioMinimo*10 && salarioFuncionario <= salarioMinimo*20 ) {
            custoEmpresa = (salarioFuncionario/100)*15;
            novoSalario = salarioFuncionario+custoEmpresa;
            System.out.println("O funcionario "+nome+" recebera um novo salario de R$"+novoSalario +
                    " e vai aumentar "+custoEmpresa+" de custo para a empresa.");
        } else{
            custoEmpresa = (salarioFuncionario/100)*10;
            novoSalario = salarioFuncionario+custoEmpresa;
            System.out.println("O funcionario "+nome+" recebera um novo salario de R$"+novoSalario +
                    " e vai aumentar "+custoEmpresa+" de custo para a empresa.");

        }

    }
}