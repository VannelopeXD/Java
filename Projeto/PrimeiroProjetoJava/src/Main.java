public class Main {
    public static void main (String [] args) {
            System.out.println("ScreenMatch");
            System.out.println("Filme: Top Gun: Maverick");

            int anoDeLancamento = 2022;
            System.out.println("Ano de Lançamento " +  anoDeLancamento);
            boolean incluidoNoPlano = true;
            double notaDoFilme = 8.1;

            double media = (9.8 + 6.3 + 8.0) / 3;
            System.out.println("Nota dos telespectadores " + media);

            String
            sinopse =   """
                        Filme Top Gun
                        Filme de aventura com o galã dos anos 80
                        Muito bom!
                        Ano de Lançamento
                        """ + anoDeLancamento;
            System.out.println(sinopse);
        int classificacao;
        classificacao = (int) (media/2);
    }

}