package Laboratorio1.Reto4;

import java.util.*;
import java.util.stream.Collectors;

public class TesoroDeLasLlaves {
  
  
    public static HashMap<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> pares) {
        HashMap<String, Integer> mapa = new HashMap<>();
        for (Map.Entry<String, Integer> par : pares) {
            mapa.putIfAbsent(par.getKey(), par.getValue());
        }
        return mapa;
    }
    

    public static Hashtable<String, Integer> crearHashtable(List<Map.Entry<String, Integer>> pares) {
        Hashtable<String, Integer> tabla = new Hashtable<>();
        for (Map.Entry<String, Integer> par : pares) {
            tabla.putIfAbsent(par.getKey(), par.getValue());
        }
        return tabla;
    }
    
    public static Map<String, Integer> combinarMapas(HashMap<String, Integer> hashMap, 
                                                     Hashtable<String, Integer> hashTable) {
        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashTable); 
        return combinado;
    }
    
    public static void procesarTesoro(List<Map.Entry<String, Integer>> paresHashMap,
                                     List<Map.Entry<String, Integer>> paresHashtable) {
        Hashtable<String, Integer> hashtable = crearHashtable(paresHashtable);
        HashMap<String, Integer> hashMap = crearHashMap(paresHashMap);
        Map<String, Integer> tesoroFinal = combinarMapas(hashMap, hashtable);
      
        tesoroFinal.entrySet().stream()
            .collect(Collectors.toMap(
                entry -> entry.getKey().toUpperCase(),
                Map.Entry::getValue,
                (existing, replacement) -> existing,
                TreeMap::new
            ))
            .forEach((clave, valor) -> 
                System.out.println("Clave: " + clave + " | Valor: " + valor));
    }
 
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> hashMapPares = Arrays.asList(
            new AbstractMap.SimpleEntry<>("oro", 5),
            new AbstractMap.SimpleEntry<>("plata", 3),
            new AbstractMap.SimpleEntry<>("oro", 7),
            new AbstractMap.SimpleEntry<>("diamante", 10)
        );
        
        List<Map.Entry<String, Integer>> hashtablePares = Arrays.asList(
            new AbstractMap.SimpleEntry<>("plata", 8),
            new AbstractMap.SimpleEntry<>("rubí", 4),
            new AbstractMap.SimpleEntry<>("oro", 12),
            new AbstractMap.SimpleEntry<>("esmeralda", 6)
        );
        
        procesarTesoro(hashMapPares, hashtablePares);
    }
}
