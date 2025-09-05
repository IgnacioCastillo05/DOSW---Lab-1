package Laboratorio1.Reto2;

import java.util.*;
import java.util.stream.Collectors;

public class CarreraParalela {
    
    static class Resultados {
        private int maximo1, minimo1, cantidad1;
        private int maximo2, minimo2, cantidad2;
        private boolean mayorEsMultiploDe2_Lista1, mayorEsDivisorDe2_Lista1;
        private boolean mayorEsMultiploDe2_Lista2, mayorEsDivisorDe2_Lista2;
        private boolean cantidadEsPar_Lista1, cantidadEsImpar_Lista1;
        private boolean cantidadEsPar_Lista2, cantidadEsImpar_Lista2;
        
        @Override
        public String toString() {
            return "Lista 1 - Max: " + maximo1 + ", Min: " + minimo1 + ", Cantidad: " + cantidad1 +
                   "\\nLista 2 - Max: " + maximo2 + ", Min: " + minimo2 + ", Cantidad: " + cantidad2;
        }
    }
    
    public static Map<String, Integer> encontrarMinimoYCantidad(List<Integer> numeros) {
        Map<String, Integer> resultado = new HashMap<>();
        resultado.put("minimo", numeros.stream().min(Integer::compareTo).orElse(0));
        resultado.put("cantidad", numeros.size());
        return resultado;
    }
    
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(5, 10, 15, 3, 8);
        List<Integer> lista2 = Arrays.asList(12, 7, 9, 2);
        
        Resultados resultado = analizarListas(lista1, lista2);
        System.out.println(resultado);
    }
}