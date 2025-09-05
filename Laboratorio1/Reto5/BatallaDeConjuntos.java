package Laboratorio1.Reto5;

import java.util.*;
import java.util.stream.Collectors;

public class BatallaDeConjuntos {
    
    public static HashSet<Integer> crearEquipoHashSet() {
        HashSet<Integer> equipo = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        return equipo.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public static TreeSet<Integer> unirEquipos() {
        HashSet<Integer> equipoHash = crearEquipoHashSet();
        
        TreeSet<Integer> arena = new TreeSet<>();
        arena.addAll(equipoHash);
        
        return arena;
    }

    public static void main(String[] args) {
        TreeSet<Integer> arenaFinal = unirEquipos();
        
        arenaFinal.forEach(numero -> 
            System.out.println("Número en arena: " + numero));
    }
}
