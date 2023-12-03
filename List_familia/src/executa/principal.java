package executa;

import entidades.Familia;
import entidades.Pessoa;

import java.time.LocalDate;

public class principal {
    public static void main(String[] args) {


        Familia familia1 = new Familia();

        familia1.adicionarPessoas(new Pessoa("Emanuel", LocalDate.of(2003,1,28)));
        familia1.adicionarPessoas(new Pessoa("Rael", LocalDate.of(2002,12,16)));

        System.out.println(familia1.getListaPessoas());

        System.out.println("\nPessoa mais velha: " +familia1.pessoaMaisVelha());

    }
}