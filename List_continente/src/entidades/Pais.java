package entidades;

public class Pais {

    private String nome;
    private double dimensao;

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
        if (dimensao <= 0){
            throw new IllegalArgumentException("Dimensão inválida");
        }
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "\nPaís: " +
                "\nNome: " + nome +
                "\nDimensão: " + dimensao;
    }
}





