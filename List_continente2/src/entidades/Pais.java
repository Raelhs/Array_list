package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String nome;
    private double dimensao;
    private List<Pais> listaPaisesDeFronteira = new ArrayList<>();

    public Pais(String nome, double dimensao) {
        setNome(nome);
        setDimensao(dimensao);
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

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        if (dimensao <= 0) {
            throw new IllegalArgumentException("Dimensão inválida");
        }
        this.dimensao = dimensao;
    }

    public List<Pais> getListaPaisesDeFronteira() {
        return listaPaisesDeFronteira;
    }

    public void setListaPaisesDeFronteira(List<Pais> listaPaisesDeFronteira) {
        this.listaPaisesDeFronteira = listaPaisesDeFronteira;
    }

    public boolean fazFronteira(Pais outroPais) {
        return listaPaisesDeFronteira.contains(outroPais);
    }

    public List<Pais> fronteirasIguais(Pais outroPais) {
        List<Pais> fronteirasComuns = new ArrayList<>();
        for (Pais pais : listaPaisesDeFronteira) {
            if (outroPais.fazFronteira(pais)) {
                fronteirasComuns.add(pais);
            }
        }
        return fronteirasComuns;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nDimensão: " + dimensao +
                "\nPaíses de Fronteira: " + listaPaisesDeFronteira;
    }
}

