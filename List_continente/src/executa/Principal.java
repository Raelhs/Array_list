package executa;

import entidades.Continente;
import entidades.Pais;

public class Principal {

    public static void main(String[] args) {

        Continente continente1 = new Continente();

        continente1.adicionarPaises(new Pais("Brasil", 168.890));
        continente1.adicionarPaises(new Pais("Rússia", 459.890));

        System.out.println(continente1.getListaPaises());
        System.out.println("\n<Maior País> " +continente1.maiorPais());



    }

}
