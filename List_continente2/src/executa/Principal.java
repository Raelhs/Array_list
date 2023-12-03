package executa;

import entidades.Continente;
import entidades.Pais;

import java.util.List;

public class Principal {
    public static void main(String[] args) {


        Continente continente1 = new Continente();
        Pais brasil = new Pais("Brasil", 2789.989);
        Pais argentina = new Pais("Argentina", 789.989);
        Pais bolivia = new Pais("Bolívia", 569.797);
        Pais paraguai = new Pais("Paraguai", 349.647);

        continente1.adicionarPaises(brasil);
        continente1.adicionarPaises(argentina);
        continente1.adicionarPaises(bolivia);
        continente1.adicionarPaises(paraguai);

        
        bolivia.getListaPaisesDeFronteira().add(brasil);

        System.out.println("Brasil faz fronteira com Argentina: " + brasil.fazFronteira(argentina));


        System.out.println("\n<Maior País>" + continente1.maiorPais());


        List<Pais> fronteirasComuns = brasil.fronteirasIguais(argentina);
        System.out.println("Países com fronteira em comum com Argentina:");
        for (Pais pais : fronteirasComuns) {
            System.out.println(pais.getNome());
        }
    }
}