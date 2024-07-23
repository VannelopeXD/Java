package br.com.sofia.screenmatch.calculo;

import br.com.sofia.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui (Filme f){
//        //soma com o tempo total com o getDuracaoEmMinutos
//       this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie s){
//        //soma com o tempo total com o getDuracaoEmMinutos
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo){
        this.tempoTotal+= titulo.getDuracaoEmMinutos();
    }
}

