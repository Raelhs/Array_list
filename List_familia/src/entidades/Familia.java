package entidades;

import java.util.ArrayList;
import java.util.List;

public class Familia {

    private List<Pessoa> listaPessoas = new ArrayList<>();

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public void adicionarPessoas(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public Pessoa pessoaMaisVelha() {
        Pessoa maisVelha = listaPessoas.get(0);
        for (Pessoa pessoa : listaPessoas) {
            if (pessoa.getDataDeNascimento().isBefore(maisVelha.getDataDeNascimento())) {
                maisVelha = pessoa;
            }
        }
        return maisVelha;
    }

    @Override
    public String toString() {
        return "Familia" +
                "listaPessoas: " + listaPessoas;
    }
}
