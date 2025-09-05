package Laboratorio1.Reto3;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class EcoMisterioso {
    
    public static String invertirConBuffer(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }
    
    public static String ecoCompleto(String mensaje) {
        String repetido = Stream.generate(() -> mensaje)
                .limit(3)
                .collect(Collectors.joining(" "));
    }
    
    public static void main(String[] args) {
        String mensaje = "Hola";
        
        java.util.function.Function<String, String> ecoLambda = EcoMisterioso::ecoCompleto;
        
        String resultado = ecoLambda.apply(mensaje);
        System.out.println("Eco misterioso: " + resultado);
    }
}