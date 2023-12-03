package entidades;

import java.util.ArrayList;
import java.util.List;

public class Continente {

    private List<Pais> listaPaises = new ArrayList<>();


    public List<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(List<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public void adicionarPaises(Pais pais) {
        listaPaises.add(pais);
    }

    public Pais maiorPais() {
        Pais maiorPais = listaPaises.get(0);
        for (Pais pais : listaPaises) {
            if (pais.getDimensao() > maiorPais.getDimensao()) {
                maiorPais = pais;
            }
        }
        return maiorPais;
    }

    public String toString() {
        return "<Continente>" +
                "\nlistaPaises: " + listaPaises;
    }
}



