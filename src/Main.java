import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String[] frases = {
                "“La confusion es el primer paso a la claridad”",
                "“La prisa es la enemiga de la perfección”",
                "“Más vale maña que fuerza”",
                "“A mal tiempo, buena cara”",
                "“La suerte ayuda a los audaces”"};
        System.out.println();
        for (String frase: frases) {
            System.out.println(frase);
        }
        System.out.println();
        Function<String, String> transformador = str -> str.toUpperCase();
        Arrays.stream(frases).map(transformador).forEach(System.out::println);
    }
}