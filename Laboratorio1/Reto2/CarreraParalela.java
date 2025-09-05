package Laboratorio1.Reto2;

import java.util.List;
import java.util.Map;

public class CarreraParalela {
    static class Resultados {
        private int maximo1, minimo1, cantidad1;
        private int maximo2, minimo2, cantidad2;
        private boolean mayorEsMultiploDe2_Lista1, mayorEsDivisorDe2_Lista1;
        private boolean mayorEsMultiploDe2_Lista2, mayorEsDivisorDe2_Lista2;
        private boolean cantidadEsPar_Lista1, cantidadEsImpar_Lista1;
        private boolean cantidadEsPar_Lista2, cantidadEsImpar_Lista2;
        
        // Constructor y getters/setters...
        
        @Override
        public String toString() {
            return "Lista 1 - Max: " + maximo1 + ", Min: " + minimo1 + ", Cantidad: " + cantidad1 +
                   "\nLista 2 - Max: " + maximo2 + ", Min: " + minimo2 + ", Cantidad: " + cantidad2;
        }
    }

    // Función del carril 1 (Estudiante B)
    public static int encontrarMaximo(List<Integer> numeros) {
        return numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static Resultados analizarListas(List<Integer> lista1, List<Integer> lista2) {
        Resultados resultado = new Resultados();
        
        // Lista 1
        resultado.maximo1 = encontrarMaximo(lista1);
        Map<String, Integer> minYCant1 = encontrarMinimoYCantidad(lista1);
        resultado.minimo1 = minYCant1.get("minimo");
        resultado.cantidad1 = minYCant1.get("cantidad");
        
        // Lista 2
        resultado.maximo2 = encontrarMaximo(lista2);
        Map<String, Integer> minYCant2 = encontrarMinimoYCantidad(lista2);
        resultado.minimo2 = minYCant2.get("minimo");
        resultado.cantidad2 = minYCant2.get("cantidad");
        
        // Verificaciones con operador ternario
        resultado.mayorEsMultiploDe2_Lista1 = resultado.maximo1 % 2 == 0 ? true : false;
        resultado.mayorEsDivisorDe2_Lista1 = 2 % resultado.maximo1 == 0 ? true : false;
        resultado.mayorEsMultiploDe2_Lista2 = resultado.maximo2 % 2 == 0 ? true : false;
        resultado.mayorEsDivisorDe2_Lista2 = 2 % resultado.maximo2 == 0 ? true : false;
        
        resultado.cantidadEsPar_Lista1 = resultado.cantidad1 % 2 == 0 ? true : false;
        resultado.cantidadEsImpar_Lista1 = resultado.cantidad1 % 2 != 0 ? true : false;
        resultado.cantidadEsPar_Lista2 = resultado.cantidad2 % 2 == 0 ? true : false;
        resultado.cantidadEsImpar_Lista2 = resultado.cantidad2 % 2 != 0 ? true : false;
        
        return resultado;
    }
}
