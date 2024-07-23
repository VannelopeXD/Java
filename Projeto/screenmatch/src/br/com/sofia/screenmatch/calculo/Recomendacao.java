package br.com.sofia.screenmatch.calculo;

public class Recomendacao {
    private String recomendacao;

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificao()>= 4){
            System.out.println("Filme está entre os preferidos do momento!");
        } else if (classificavel.getClassificao()>=2) {
            System.out.println("Muito bem avaliado no momento");
        }   else {
            System.out.println("Coloque na sua lista para ver depois");
        }
    }
}
