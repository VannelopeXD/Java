public class Temperatura {
    public static void main (String[] args){
        double temperaturaEmCelsius = 31.0;
        double temperaturaFarheint = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format ("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius,temperaturaFarheint);
        System.out.println(mensagem);

        int temperaturaFarheintInteira = (int) temperaturaFarheint;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFarheintInteira);
    }
}

