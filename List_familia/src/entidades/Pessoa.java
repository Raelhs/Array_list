package entidades;

import java.time.LocalDate;

public class Pessoa {
private String nome;
private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        setNome(nome);
        setDataDeNascimento(dataDeNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty() || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        if (dataDeNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data Inválida");
        }
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nData de Nascimento: " + dataDeNascimento;
    }
}
