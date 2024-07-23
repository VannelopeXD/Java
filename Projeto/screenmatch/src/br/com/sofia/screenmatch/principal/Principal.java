package br.com.sofia.screenmatch.principal;

import br.com.sofia.screenmatch.calculo.CalculadoraDeTempo;
import br.com.sofia.screenmatch.calculo.Recomendacao;
import br.com.sofia.screenmatch.modelos.Episodio;
import br.com.sofia.screenmatch.modelos.Filme;
import br.com.sofia.screenmatch.modelos.Serie;

import java.lang.reflect.Constructor;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso Chefão",1972);
        filme1.setDuracaoEmMinutos(180);

        filme1.exibeFicaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);

        System.out.println("Total de Avaliações " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());
//----------------------------------------------------------------------------------------------------------------------
        Serie lost = new Serie("Lost",2000);
        lost.exibeFicaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração Episódio: " + lost.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Avatar",2023);
        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme("DogVille",2003);
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(10);

        var filme4 = new Filme("La La Land",2016);
        filme4.setDuracaoEmMinutos(200);
        filme4.avalia(10);

        ArrayList <Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(filme1);
        ListaDeFilmes.add(filme2);
        ListaDeFilmes.add(filme3);
        ListaDeFilmes.add(filme4);

        System.out.println("Tamanho da Lista " + ListaDeFilmes.size());
        System.out.println("Primeiro Filme " + ListaDeFilmes.get(0).getNome());
        System.out.println(ListaDeFilmes);
        System.out.println("ToString do filme: " + ListaDeFilmes.get(0).toString());


    }
}

