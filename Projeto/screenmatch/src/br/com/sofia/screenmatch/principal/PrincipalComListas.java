package br.com.sofia.screenmatch.principal;

import br.com.sofia.screenmatch.modelos.Filme;
import br.com.sofia.screenmatch.modelos.Serie;
import br.com.sofia.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso Chefão", 1972);
        filme1.avalia(9);
        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(5);
        var filme3 = new Filme("DogVille", 2003);
        filme3.avalia(7);
        var filme4 = new Filme("La La Land", 2016);
        filme4.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(filme4);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme && filme1.getClassificao() > 2){
                Filme filme = (Filme) item;
                System.out.println("Classificação " + filme.getClassificao());
            }

        }

            //Ordenar Listas
            ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Ryan Gosling");
            buscaPorArtista.add("Sofia");
            buscaPorArtista.add("Matheus");
            System.out.println(buscaPorArtista);

            Collections.sort(buscaPorArtista);
            System.out.println("Depois da ordenação");
            System.out.println(buscaPorArtista);
            System.out.println("Lista de Titulos Ordenados");
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Comparando por Ano");
            System.out.println(lista);
            Collections.sort(lista);

    }
}
