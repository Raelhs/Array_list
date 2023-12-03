package executa;

import entidades.Funcionario;
import entidades.Setor;

public class Principal {
    public static void main(String[] args) {

        Setor manutencao = new Setor();
        Funcionario funcionario1 = new Funcionario("Emanuel", "123CV", 6, 15000);
        Funcionario funcionario2 = new Funcionario("Danel", "456PCC", 5, 10000);

        manutencao.adicionarFuncionario(funcionario1);
        manutencao.adicionarFuncionario(funcionario2);

        System.out.println(manutencao.getListaFuncionarios());
        System.out.println("\nFuncionário com maior salário: " + manutencao.funcionarioMaiorSalario());

        System.out.println("\nTotal salário do setor: " + manutencao.totalFolhaDePagamentoSetor());
        System.out.println("\nTotal salário do departamento: " + manutencao.totalFolhaDePagamentoDept(5));
        System.out.println(manutencao.acharFuncionario("Danel", "456PCC"));
    }

}

