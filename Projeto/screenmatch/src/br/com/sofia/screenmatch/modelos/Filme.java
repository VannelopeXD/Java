package br.com.sofia.screenmatch.modelos;

import br.com.sofia.screenmatch.calculo.Classificavel;

// a classe filme tem tudo que o Titulo tem e mais um pouco;
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String NomeDoFilme, int anoDeLancamento) {
       super(NomeDoFilme, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificao() {
        return (int) pegaMedia() /2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
