package entidades;

import java.util.ArrayList;
import java.util.List;

public class Setor {

    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void adicionarFuncionario(Funcionario novoFuncionario) {
        getListaFuncionarios().add(novoFuncionario);
    }

    public double totalFolhaDePagamentoSetor() {
        double totalSalarioSetor = 0;
        for (Funcionario setor : listaFuncionarios) {
            totalSalarioSetor += setor.getSalario();
        }
        return totalSalarioSetor;
    }

    public double totalFolhaDePagamentoDept(int departamento) {
        double totalSalarioDep = 0;
        for (Funcionario dep : listaFuncionarios) {
            if (dep.getDepartamento() == departamento) {
                totalSalarioDep += dep.getSalario();
            }
        }
        return totalSalarioDep;
    }

    public Funcionario funcionarioMaiorSalario() {
        Funcionario maiorSalario = listaFuncionarios.get(0);
        for (Funcionario func : listaFuncionarios) {
            if (func.getSalario() > maiorSalario.getSalario()) {
                maiorSalario = func;
            }
        }

        return maiorSalario;
    }

    public Funcionario acharFuncionario(String nomeFuncionario, String matricula) {
        for (Funcionario func : listaFuncionarios) {
            if (func.getNome().equals(nomeFuncionario) && func.getMatricula().equals(matricula)) {
                return func;
            }
        }
        return null;
    }

}
