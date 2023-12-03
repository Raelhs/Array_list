package entidades;

public class Funcionario {

    private String nome;
    private String matricula;
    private int departamento;
    private double salario;

    public Funcionario(String nome, String matricula, int departamento, double salario) {
        setNome(nome);
        setMatricula(matricula);
        setDepartamento(departamento);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank() || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty() || matricula.isBlank()) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        this.matricula = matricula;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        if (departamento <= 0) {
            throw new IllegalArgumentException("Departamento inválida");
        }
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário inválido");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nMatrícula: " + matricula +
                "\nDepartamento: " + departamento +
                "\nSalário: " + salario;
    }
}
