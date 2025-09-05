package Laboratorio1.Reto3;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class EcoMisterioso {

    public static String repetirConBuilder(String mensaje) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(mensaje).append(" ");
        }
        return sb.toString().trim();
    }
    

    public static String ecoCompleto(String mensaje) {

        String repetido = Stream.generate(() -> mensaje)
                .limit(3)
                .collect(Collectors.joining(" "));
        

        StringBuffer buffer = new StringBuffer(repetido);
        return buffer.reverse().toString();
    }
    
    public static void main(String[] args) {
        String mensaje = "Hola";
        
        // Usar lambda para invocar
        java.util.function.Function<String, String> ecoLambda = EcoMisterioso::ecoCompleto;
        
        String resultado = ecoLambda.apply(mensaje);
        System.out.println("Eco misterioso: " + resultado);
    }
}
